diff --git a/src/main/java/org/red5/server/util/HttpConnectionUtil.java b/src/main/java/org/red5/server/util/HttpConnectionUtil.java
index b6f8c28..2eb4aa0 100644
--- a/src/main/java/org/red5/server/util/HttpConnectionUtil.java
+++ b/src/main/java/org/red5/server/util/HttpConnectionUtil.java
@@ -62,7 +62,7 @@
 	 * 
 	 * @return client
 	 */
-	public static final DefaultHttpClient getClient() {
+	public static final HttpClient getClient() {
 		return getClient(connectionTimeout);
 	}
 
@@ -72,7 +72,7 @@
 	 * @param timeout - socket timeout to set
 	 * @return client
 	 */
-	public static final DefaultHttpClient getClient(int timeout) {
+	public static final HttpClient getClient(int timeout) {
 		HttpClientBuilder client = HttpClientBuilder.create();
 		client.setConnectionManager(connectionManager);
 		// dont retry
