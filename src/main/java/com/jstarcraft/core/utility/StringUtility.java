package com.jstarcraft.core.utility;

import java.nio.charset.Charset;

import org.apache.commons.codec.CharEncoding;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

/**
 * 字符串工具
 * 
 * @author Birdy
 *
 */
public class StringUtility extends StringUtils {

	/** 字符串编码 */
	public static final Charset CHARSET = Charset.forName(CharEncoding.UTF_8);

	/** 星号 */
	public static final String ASTERISK = "*";

	/** 冒号 */
	public static final String COLON = ":";

	/** 逗号 */
	public static final String COMMA = ",";

	/** 破折号 */
	public static final String DASH = "-";

	/** 除号 */
	public static final String DIVISION = "/";

	/** 双引号 */
	public static final String DOUBLE_QUOTATION = "\"";

	/** 惊叹号 */
	public static final String EXCLAMATION = "!";

	/** 连字符 */
	public static final String HYPHEN = "-";

	/** 减号 */
	public static final String MINUS = "-";

	/** 乘号 */
	public static final String MULTIPLICATION = "*";

	/** 句号 */
	public static final String PERIOD = ".";

	/** 加号 */
	public static final String PLUS = "+";

	/** 问号 */
	public static final String QUESTION = "?";

	/** 分号 */
	public static final String SEMICOLON = ";";

	/** 单引号 */
	public static final String SINGLE_QUOTATION = "'";

	/**
	 * 使用指定参数格式化指定模板,并转换为字符串
	 * 
	 * @param template
	 * @param parameters
	 * @return
	 */
	public static final String format(String template, Object... parameters) {
		FormattingTuple formatter = MessageFormatter.arrayFormat(template, parameters);
		return formatter.getMessage();
	}

	/**
	 * 将指定对象通过反射转换为字符串
	 * 
	 * @param object
	 * @return
	 */
	public static final String reflect(Object object) {
		return ReflectionToStringBuilder.toString(object);
	}

}