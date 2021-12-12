diff --git a/spring-web/src/main/java/org/springframework/http/HttpHeaders.java b/spring-web/src/main/java/org/springframework/http/HttpHeaders.java
index dfb4308..136ff11 100644
--- a/spring-web/src/main/java/org/springframework/http/HttpHeaders.java
+++ b/spring-web/src/main/java/org/springframework/http/HttpHeaders.java
@@ -677,9 +677,14 @@
 		return getFirst(UPGARDE);
 	}
 
-	// Utility methods
+	// Date methods
 
-	private long getFirstDate(String headerName) {
+	/**
+	 * Parse the first header value for the given header name as a date, return -1 if
+	 * there is no value, or raise {@link IllegalArgumentException} if the value cannot be
+	 * parsed as a date.
+	 */
+	public long getFirstDate(String headerName) {
 		String headerValue = getFirst(headerName);
 		if (headerValue == null) {
 			return -1;
@@ -698,7 +703,12 @@
 				"\" for \"" + headerName + "\" header");
 	}
 
-	private void setDate(String headerName, long date) {
+	/**
+	 * Set the given date under the given header name after formatting it as a string
+	 * using the pattern {@code "EEE, dd MMM yyyy HH:mm:ss zzz"}. The equivalent of
+	 * {@link #set(String, String)} but for date headers.
+	 */
+	public void setDate(String headerName, long date) {
 		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMATS[0], Locale.US);
 		dateFormat.setTimeZone(GMT);
 		set(headerName, dateFormat.format(new Date(date)));
