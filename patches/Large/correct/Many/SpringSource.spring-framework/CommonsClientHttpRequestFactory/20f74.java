diff --git a/org.springframework.web/src/main/java/org/springframework/http/client/CommonsClientHttpRequestFactory.java b/org.springframework.web/src/main/java/org/springframework/http/client/CommonsClientHttpRequestFactory.java
index f16b07d..e70c8f3 100644
--- a/org.springframework.web/src/main/java/org/springframework/http/client/CommonsClientHttpRequestFactory.java
+++ b/org.springframework.web/src/main/java/org/springframework/http/client/CommonsClientHttpRequestFactory.java
@@ -96,7 +96,7 @@
 	 * @see org.apache.commons.httpclient.params.HttpConnectionManagerParams#setConnectionTimeout(int)
 	 */
 	public void setConnectTimeout(int timeout) {
-		Assert.isTrue(timeout < 0, "Timeout must be a non-negative value");
+		Assert.isTrue(timeout >= 0, "Timeout must be a non-negative value");
 		this.httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
 	}
 
@@ -107,7 +107,7 @@
 	 * @see org.apache.commons.httpclient.params.HttpConnectionManagerParams#setSoTimeout(int)
 	 */
 	public void setReadTimeout(int timeout) {
-		Assert.isTrue(timeout < 0, "Timeout must be a non-negative value");
+		Assert.isTrue(timeout >= 0, "Timeout must be a non-negative value");
 		getHttpClient().getHttpConnectionManager().getParams().setSoTimeout(timeout);
 	}
 
