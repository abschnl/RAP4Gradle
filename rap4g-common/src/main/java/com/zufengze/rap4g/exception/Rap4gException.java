/**
 * 文件名： Rap4gException.java 此类描述的是： 作者: zufengze 创建时间: 2016年7月11日
 * 上午10:16:44
 */
package com.zufengze.rap4g.exception;

import com.zufengze.rap4g.constants.ErrorCode;

/**
 * 内部异常 .
 *
 * @author: zufengze
 * @version:
 */
public class Rap4gException extends Exception
{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4488920747852502701L;
	
	/** The result code. */
	private String resultCode = "0";
	
	/** The result message. */
	private String resultMessage = "Success";
	
	/**
	 * The Constructor.
	 * 
	 * @param string2
	 * @param string
	 */
	public Rap4gException(String errorCode, String errorMessage)
	{
		super();
		this.resultCode = errorCode;
		this.resultMessage = errorMessage;
	}
	
	/**
	 * The Constructor.
	 *
	 * @param code the code
	 */
	public Rap4gException(ErrorCode code)
	{
		super();
		this.resultCode = code.getErrorCode();
		this.resultMessage = code.getDesc();
	}
	
	/**
	 * The Constructor.
	 *
	 * @param code the code
	 * @param cause the cause
	 */
	public Rap4gException(ErrorCode code, Throwable cause)
	{
		super(cause);
		this.resultCode = code.getErrorCode();
		this.resultMessage = code.getDesc();
	}
	
	/**
	 * Gets the result code.
	 *
	 * @return the resultCode
	 */
	public String getResultCode()
	{
		return resultCode;
	}
	
	/**
	 * Sets the result code.
	 *
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(String resultCode)
	{
		this.resultCode = resultCode;
	}
	
	/**
	 * Gets the result message.
	 *
	 * @return the resultMessage
	 */
	public String getResultMessage()
	{
		return resultMessage;
	}
	
	/**
	 * Sets the result message.
	 *
	 * @param resultMessage the resultMessage to set
	 */
	public void setResultMessage(String resultMessage)
	{
		this.resultMessage = resultMessage;
	}
	
	/**
	 * @return the string
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("TCFException [resultCode=");
		builder.append(resultCode);
		builder.append(", resultMessage=");
		builder.append(resultMessage);
		builder.append("]");
		return builder.toString();
	}
	
}
