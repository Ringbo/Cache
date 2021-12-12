diff --git a/org.springframework.web/src/main/java/org/springframework/remoting/httpinvoker/HttpComponentsHttpInvokerRequestExecutor.java b/org.springframework.web/src/main/java/org/springframework/remoting/httpinvoker/HttpComponentsHttpInvokerRequestExecutor.java
index 0d5e179..58298f8 100644
--- a/org.springframework.web/src/main/java/org/springframework/remoting/httpinvoker/HttpComponentsHttpInvokerRequestExecutor.java
+++ b/org.springframework.web/src/main/java/org/springframework/remoting/httpinvoker/HttpComponentsHttpInvokerRequestExecutor.java
@@ -113,7 +113,7 @@
 	 * @param timeout the timeout value in milliseconds
 	 */
 	public void setConnectTimeout(int timeout) {
-		Assert.isTrue(timeout < 0, "Timeout must be a non-negative value");
+		Assert.isTrue(timeout >= 0, "Timeout must be a non-negative value");
 		getHttpClient().getParams().setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, timeout);
 	}
 
@@ -124,7 +124,7 @@
 	 * @see #DEFAULT_READ_TIMEOUT_MILLISECONDS
 	 */
 	public void setReadTimeout(int timeout) {
-		Assert.isTrue(timeout < 0, "Timeout must be a non-negative value");
+		Assert.isTrue(timeout >= 0, "Timeout must be a non-negative value");
 		getHttpClient().getParams().setIntParameter(CoreConnectionPNames.SO_TIMEOUT, timeout);
 	}
 
