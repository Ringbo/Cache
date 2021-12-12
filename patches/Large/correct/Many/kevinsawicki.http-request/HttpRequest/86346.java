diff --git a/lib/src/main/java/com/github/kevinsawicki/http/HttpRequest.java b/lib/src/main/java/com/github/kevinsawicki/http/HttpRequest.java
index 0e430b6..d1be2de 100644
--- a/lib/src/main/java/com/github/kevinsawicki/http/HttpRequest.java
+++ b/lib/src/main/java/com/github/kevinsawicki/http/HttpRequest.java
@@ -624,7 +624,7 @@
 	 * @return request
 	 * @throws HttpRequestException
 	 */
-	public static HttpRequest get(String url) throws HttpRequestException {
+	public static HttpRequest get(CharSequence url) throws HttpRequestException {
 		return new HttpRequest(url, METHOD_GET);
 	}
 
@@ -646,7 +646,8 @@
 	 * @return request
 	 * @throws HttpRequestException
 	 */
-	public static HttpRequest post(String url) throws HttpRequestException {
+	public static HttpRequest post(CharSequence url)
+			throws HttpRequestException {
 		return new HttpRequest(url, METHOD_POST);
 	}
 
@@ -668,7 +669,7 @@
 	 * @return request
 	 * @throws HttpRequestException
 	 */
-	public static HttpRequest put(String url) throws HttpRequestException {
+	public static HttpRequest put(CharSequence url) throws HttpRequestException {
 		return new HttpRequest(url, METHOD_PUT);
 	}
 
@@ -690,7 +691,8 @@
 	 * @return request
 	 * @throws HttpRequestException
 	 */
-	public static HttpRequest delete(String url) throws HttpRequestException {
+	public static HttpRequest delete(CharSequence url)
+			throws HttpRequestException {
 		return new HttpRequest(url, METHOD_DELETE);
 	}
 
@@ -712,7 +714,8 @@
 	 * @return request
 	 * @throws HttpRequestException
 	 */
-	public static HttpRequest head(String url) throws HttpRequestException {
+	public static HttpRequest head(CharSequence url)
+			throws HttpRequestException {
 		return new HttpRequest(url, METHOD_HEAD);
 	}
 
@@ -734,7 +737,8 @@
 	 * @return request
 	 * @throws HttpRequestException
 	 */
-	public static HttpRequest options(String url) throws HttpRequestException {
+	public static HttpRequest options(CharSequence url)
+			throws HttpRequestException {
 		return new HttpRequest(url, METHOD_OPTIONS);
 	}
 
@@ -756,7 +760,8 @@
 	 * @return request
 	 * @throws HttpRequestException
 	 */
-	public static HttpRequest trace(String url) throws HttpRequestException {
+	public static HttpRequest trace(CharSequence url)
+			throws HttpRequestException {
 		return new HttpRequest(url, METHOD_TRACE);
 	}
 
@@ -879,10 +884,11 @@
 	 * @param method
 	 * @throws HttpRequestException
 	 */
-	public HttpRequest(final String url, final String method)
+	public HttpRequest(final CharSequence url, final String method)
 			throws HttpRequestException {
 		try {
-			connection = (HttpURLConnection) new URL(url).openConnection();
+			connection = (HttpURLConnection) new URL(url.toString())
+					.openConnection();
 			connection.setRequestMethod(method);
 		} catch (IOException e) {
 			throw new HttpRequestException(e);
