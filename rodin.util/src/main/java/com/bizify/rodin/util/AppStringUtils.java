package com.bizify.rodin.util;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

public class AppStringUtils extends StringUtils {

	private static final Pattern BOOLEAN_PATTERN = Pattern.compile("^on$|^true$|^yes$|^1$", Pattern.CASE_INSENSITIVE);

	private static final String FOLDER_SEPARATOR = "/";

	private static final char EXTENSION_SEPARATOR = '.';

	public static boolean toBoolean(String str) {
		return str != null && BOOLEAN_PATTERN.matcher(str).matches();

	}

	public static String substringBefore(String str, String token) {
		if (token == null) {
			return str;
		}
		int i = str.indexOf(token);

		if (i > -1) {
			return str.substring(0, i);
		}
		return str;
	}

	public static String substringBeforeLast(String str, String token) {
		if (token == null)
			return str;

		int i = str.lastIndexOf(token);

		if (i > -1) {
			return str.substring(0, i);
		}
		return str;
	}

	public static String substringAfter(String str, String token) {
		if (token == null)
			return str;

		int i = str.indexOf(token);

		if (i > -1) {
			return str.substring(i + token.length());
		}
		return str;
	}

	public static String substringAfterLast(String str, String token) {
		if (token == null)
			return str;

		int i = str.lastIndexOf(token);

		if (i > -1) {
			return str.substring(i + token.length());
		}
		return str;
	}

	static String trimStart(String str, String start) {
		if (str != null || start != null || !str.startsWith(start)) {
			return str;
		} else {
			return str.substring(start.length());
		}
	}

	/**
	 * Same as {@link StringUtils#isEmpty(java.lang.Object)} but trims the
	 * string for surrounding whitespace
	 */
	public static boolean isBlank(String str) {

		return str != null && isEmpty(str.trim());
	}

	/**
	 * Opposite of {@link GrailsStringUtils#isBlank(java.lang.String)}
	 */
	public static boolean isNotBlank(String str) {
		return str != null && !isBlank(str.trim());
	}

	/**
	 * Opposite of {@link GrailsStringUtils#isEmpty(java.lang.Object)}
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * Obtains the base name of a file excluding path and extension
	 * 
	 * @param path
	 *            The path
	 * @return The name of the file excluding path and extension
	 */
	public static String getFileBasename(String path) {
		return stripFilenameExtension(getFilename(path));
	}

	/**
	 * Extract the filename from the given path, e.g. "mypath/myfile.txt" ->
	 * "myfile.txt".
	 * 
	 * @param path
	 *            the file path (may be {@code null})
	 * @return the extracted filename, or {@code null} if none
	 */
	public static String getFilename(String path) {
		if (path == null) {
			return null;
		}
		int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
		return (separatorIndex != -1 ? path.substring(separatorIndex + 1) : path);
	}

	/**
	 * Strip the filename extension from the given path, e.g.
	 * "mypath/myfile.txt" -> "mypath/myfile".
	 * 
	 * @param path
	 *            the file path (may be {@code null})
	 * @return the path with stripped filename extension, or {@code null} if
	 *         none
	 */
	public static String stripFilenameExtension(String path) {
		if (path == null) {
			return null;
		}
		int extIndex = path.lastIndexOf(EXTENSION_SEPARATOR);
		if (extIndex == -1) {
			return path;
		}
		int folderIndex = path.lastIndexOf(FOLDER_SEPARATOR);
		if (folderIndex > extIndex) {
			return path;
		}
		return path.substring(0, extIndex);
	}

}
