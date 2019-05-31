/**
 * 
 */
package com.example.demo.util;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;
import com.example.demo.constant.FileMessageConstant;

/**
 * File： UploadFileUtils.java<br>
 * Title: <br>
 * Description: 文件上传工具类<br>
 * Company: <br>
 * 
 * @author
 * @version
 */
public class UploadFileUtils {

	/**
	 * 
	 * @param file
	 *            上传文件
	 * @param filePath
	 *            文件上传路径
	 * @return String 文件上传状态信息<br>
	 * @throws UnsupportedEncodingException
	 */
	public String uploadMutilFile(MultipartFile file, String filePath) throws UnsupportedEncodingException {

		// 如果文件为空
		if (file.isEmpty()) {
			return FileMessageConstant.FILE_IS_EMPTY;
		}

		// 定义文件名和文件类型
		String filename, fileType;
		// 获得文件名与文件类型
		filename = file.getOriginalFilename();
		fileType = filename.substring(filename.lastIndexOf("."), filename.length());

		// 如果文件类型是.rar或者zip则可以上传
		final boolean isTrueType = fileType.equals(FileMessageConstant.FILE_RAR_TYPE)
				|| fileType.equals(FileMessageConstant.FILE_ZIP_TYPE);
		if (isTrueType) {
			// 重新命名文件名，避免重名
			Date date = new Date();
			filename = String
					.valueOf(date.getTime() + "_" + URLEncoder.encode(filename, FileMessageConstant.FILE_ENCODE_UTF8));

			// 重新得到一个上传的新文件
			File destFile = new File(filePath + filename);
			try {
				// 上传成功后返回一个上传路径
				file.transferTo(destFile);
				return destFile.getPath();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return FileMessageConstant.FILE_TYPE_REQUEST;
	}
}
