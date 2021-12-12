diff --git a/org.springframework.web/src/main/java/org/springframework/remoting/httpinvoker/CommonsHttpInvokerRequestExecutor.java b/org.springframework.web/src/main/java/org/springframework/remoting/httpinvoker/CommonsHttpInvokerRequestExecutor.java
index 5487214..c53e364 100644
--- a/org.springframework.web/src/main/java/org/springframework/remoting/httpinvoker/CommonsHttpInvokerRequestExecutor.java
+++ b/org.springframework.web/src/main/java/org/springframework/remoting/httpinvoker/CommonsHttpInvokerRequestExecutor.java
@@ -102,7 +102,7 @@
 	 * @see org.apache.commons.httpclient.params.HttpConnectionManagerParams#setConnectionTimeout(int)
 	 */
 	public void setConnectTimeout(int timeout) {
-		Assert.isTrue(timeout < 0, "Timeout must be a non-negative value");
+		Assert.isTrue(timeout >= 0, "Timeout must be a non-negative value");
 		this.httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
 	}
 
@@ -114,7 +114,7 @@
 	 * @see #DEFAULT_READ_TIMEOUT_MILLISECONDS
 	 */
 	public void setReadTimeout(int timeout) {
-		Assert.isTrue(timeout < 0, "Timeout must be a non-negative value");
+		Assert.isTrue(timeout >= 0, "Timeout must be a non-negative value");
 		this.httpClient.getHttpConnectionManager().getParams().setSoTimeout(timeout);
 	}
 
