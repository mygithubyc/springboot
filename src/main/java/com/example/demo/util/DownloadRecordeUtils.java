/**
 * 
 */
package com.example.demo.util;

import java.sql.Timestamp;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.constant.BrowserConstant;

/**
 * File： DownloadRecordeUtils.java<br>
 * Title: <br>
 * Description: <br>
 * Company: <br>
 * 
 * @author
 * @version
 */
public class DownloadRecordeUtils {

	private String uid;
	private String ip;
	private int port;
	private String ua;
	private String fileName;
	private String filePath;
	private long length;
	private int status;
	private Timestamp startTime;
	private Timestamp endTime;

	public DownloadRecordeUtils() {
	}

	public DownloadRecordeUtils(String fileName, String filePath, HttpServletRequest request) {
		this.uid = UUID.randomUUID().toString().replace("-", "");
		this.fileName = fileName;
		this.filePath = filePath;
		this.ip = request.getRemoteAddr();
		this.port = request.getRemotePort();
		this.ua = request.getHeader(BrowserConstant.REQUEST_HEADER);
		this.startTime = new Timestamp(System.currentTimeMillis());
	}

	/**
	 * @return String uid <br>
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid
	 *            <br>
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return String ip <br>
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip
	 *            <br>
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return int port <br>
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port
	 *            <br>
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return String ua <br>
	 */
	public String getUa() {
		return ua;
	}

	/**
	 * @param ua
	 *            <br>
	 */
	public void setUa(String ua) {
		this.ua = ua;
	}

	/**
	 * @return String fileName <br>
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            <br>
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return String filePath <br>
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath
	 *            <br>
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @return long length <br>
	 */
	public long getLength() {
		return length;
	}

	/**
	 * @param length
	 *            <br>
	 */
	public void setLength(long length) {
		this.length = length;
	}

	/**
	 * @return int status <br>
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            <br>
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return Timestamp startTime <br>
	 */
	public Timestamp getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            <br>
	 */
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return Timestamp endTime <br>
	 */
	public Timestamp getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime
	 *            <br>
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

}
