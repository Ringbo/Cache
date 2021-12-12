diff --git a/org.springframework.web/src/main/java/org/springframework/http/client/HttpComponentsClientHttpRequestFactory.java b/org.springframework.web/src/main/java/org/springframework/http/client/HttpComponentsClientHttpRequestFactory.java
index 8224902..f2a576c 100644
--- a/org.springframework.web/src/main/java/org/springframework/http/client/HttpComponentsClientHttpRequestFactory.java
+++ b/org.springframework.web/src/main/java/org/springframework/http/client/HttpComponentsClientHttpRequestFactory.java
@@ -112,7 +112,7 @@
 	 * @param timeout the timeout value in milliseconds
 	 */
 	public void setConnectTimeout(int timeout) {
-		Assert.isTrue(timeout < 0, "Timeout must be a non-negative value");
+		Assert.isTrue(timeout >= 0, "Timeout must be a non-negative value");
 		getHttpClient().getParams().setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, timeout);
 	}
 
@@ -122,7 +122,7 @@
 	 * @param timeout the timeout value in milliseconds
 	 */
 	public void setReadTimeout(int timeout) {
-		Assert.isTrue(timeout < 0, "Timeout must be a non-negative value");
+		Assert.isTrue(timeout >= 0, "Timeout must be a non-negative value");
 		getHttpClient().getParams().setIntParameter(CoreConnectionPNames.SO_TIMEOUT, timeout);
 	}
 
