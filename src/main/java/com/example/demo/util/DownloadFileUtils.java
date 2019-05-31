/**
 * 
 */
package com.example.demo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.constant.BrowserConstant;
import com.example.demo.constant.FileMessageConstant;

/**
 * File： DownloadFileUtils.java<br>
 * Title: <br>
 * Description: 文件下载工具类<br>
 * Company: <br>
 * 
 * @author
 * @version
 */
public class DownloadFileUtils {

	/**
	 * 单个文件下载
	 * 
	 * @param fileName
	 *            文件名
	 * @param filePath
	 *            文件路径（不包含文件名）
	 * @param request
	 * @param response
	 * @throws IOException
	 *             void <br>
	 */
	public static void fileDownload(String fileName, String filePath, HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		DownloadRecordeUtils recordeUtils = new DownloadRecordeUtils(fileName, filePath, request);

		// 设置文件名和response端
		response.setCharacterEncoding(BrowserConstant.RESPONSE_HEADER_CHARACTER_ENCODING);
		response.setContentType(BrowserConstant.RESPONSE_HEADER_CONTENT_TYPE);
		// 设置文件名的编码格式
		fileName = URLEncoder.encode(fileName, FileMessageConstant.FILE_ENCODE_UTF8);
		String responseFile = BrowserConstant.RESPONSE_HEADER_ATTACHMENT_FILE_NAME + fileName;
		response.setHeader(BrowserConstant.RESPONSE_HEADER_CONTENT_DISPOSITION, responseFile);
		// 记录下载文件长度 单位：byte
		long downloadLength = 01;
		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {
			// 新建一个文件输入流对象
			String filePathName = filePath + "\\" + fileName;
			inputStream = new FileInputStream(filePathName);
			outputStream = response.getOutputStream();
			// 定义缓冲变量
			byte[] buff = new byte[2048];
			int len;
			while ((len = inputStream.read(buff)) > 0) {
				outputStream.write(buff, 0, len);
				downloadLength += buff.length;
			}
			// 记录下载状态
			recordeUtils.setStatus(FileMessageConstant.FILE_UPLOAD_STATUS_SUCCESS);
		} catch (Exception e) {
			// TODO: handle exception
			recordeUtils.setStatus(FileMessageConstant.FILE_DOWNLOAD_STATUS_ERROR);
			throw e;
		} finally {
			// 关闭输入输出流
			inputStream.close();
			outputStream.close();
			// 记录好结束下载时间和下载长度，方便下一次接着下载
			recordeUtils.setEndTime(new Timestamp(System.currentTimeMillis()));
			recordeUtils.setLength(downloadLength);
		}
	}

	/**
	 * 
	 * @param fileNames
	 *            多个文件名以","分隔的文件名字符串
	 * @param filePath
	 *            文件路径，不包括文件名
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public static void mutilFileDownload(String fileNames, String filePath, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// 处理多个文件名,多个文件名义逗号隔开，删除最后一个逗号
		StringBuffer buffer = new StringBuffer(fileNames);
		buffer.deleteCharAt(fileNames.lastIndexOf(","));
		fileNames = buffer.toString();
		// 得到文件数组
		String[] fileName = fileNames.split(",");
		String zipName = "myFile.zip";
		zipName = URLEncoder.encode(zipName, FileMessageConstant.FILE_ENCODE_UTF8);

		// 设置文件名和response端
		String responseFiles = BrowserConstant.RESPONSE_HEADER_ATTACHMENT_FILE_NAME + zipName;
		response.setHeader(BrowserConstant.RESPONSE_HEADER_CONTENT_DISPOSITION, responseFiles);
		response.setContentType(BrowserConstant.RESPONSE_HEADER_CONTENT_TYPE);
		response.setCharacterEncoding(FileMessageConstant.FILE_ENCODE_UTF8);

		// 定义压缩输出流以及设置压缩方式
		ZipOutputStream zipOutStream = new ZipOutputStream(response.getOutputStream());
		zipOutStream.setMethod(ZipOutputStream.DEFLATED);
		String filePathName;

		try {
			for (String fileNameTemp : fileName) {
				fileNameTemp = URLEncoder.encode(fileNameTemp, FileMessageConstant.FILE_ENCODE_UTF8);
				filePathName = filePath + "\\" + fileNameTemp;
				// 转为.zip压缩文件并且下载文件包
				toZipDownload(filePathName, zipOutStream, request);
				response.flushBuffer();
			}
		} finally {
			// TODO: handle finally clause
			zipOutStream.close();
		}
	}

	/**
	 * 转为zip压缩文件下载
	 * 
	 * @param filePathName
	 *            包含文件路径和文件名
	 * @param out
	 * @param request
	 * @throws Exception
	 *             void <br>
	 */
	public static void toZipDownload(String filePathName, ZipOutputStream out, HttpServletRequest request)
			throws Exception {

		File file = new File(filePathName);
		if (file.exists()) {
			// 用于记录文件下载的长度，单位：byte
			long downloadLength = 01;
			// 记录本次下载记录
			String filePath = filePathName.substring(filePathName.lastIndexOf("\\"));
			DownloadRecordeUtils recordeUtils = new DownloadRecordeUtils(filePathName, filePath, request);

			// 定义一个文件输入流对象
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
				// 创建一个zip示例对象
				ZipEntry zipEntry = new ZipEntry(file.getName());
				out.putNextEntry(zipEntry);
				// 定义缓冲变量
				byte[] buff = new byte[2048];
				int len = 0;
				// 读入需要下载的内容
				while ((len = fileInputStream.read(buff)) > 0) {
					out.write(buff, 0, len);
					downloadLength += len;
				}
				// 冲刷输出流
				out.flush();
				// 记录下载成功状态
				recordeUtils.setStatus(FileMessageConstant.FILE_UPLOAD_STATUS_SUCCESS);
			} catch (Exception e) {
				// TODO: handle exception
				recordeUtils.setStatus(FileMessageConstant.FILE_DOWNLOAD_STATUS_ERROR);
				throw e;
			} finally {
				// 关闭输入、输出流
				out.closeEntry();
				fileInputStream.close();
				// 记录下载结束时间、长度
				recordeUtils.setEndTime(new Timestamp(System.currentTimeMillis()));
				recordeUtils.setLength(downloadLength);
			}

		}
	}
}
