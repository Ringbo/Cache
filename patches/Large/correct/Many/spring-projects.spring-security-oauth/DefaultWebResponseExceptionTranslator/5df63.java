diff --git a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/error/DefaultWebResponseExceptionTranslator.java b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/error/DefaultWebResponseExceptionTranslator.java
index c8bcd95..39bb4cf 100644
--- a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/error/DefaultWebResponseExceptionTranslator.java
+++ b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/error/DefaultWebResponseExceptionTranslator.java
@@ -63,7 +63,7 @@
 		ase = (HttpRequestMethodNotSupportedException) throwableAnalyzer
 				.getFirstThrowableOfType(HttpRequestMethodNotSupportedException.class, causeChain);
 		if (ase instanceof HttpRequestMethodNotSupportedException) {
-			return handleOAuth2Exception(new BadRequest(ase.getMessage(), ase));
+			return handleOAuth2Exception(new MethodNotAllowed(ase.getMessage(), ase));
 		}
 
 		return handleOAuth2Exception(new ServerErrorException(e.getMessage(), e));
@@ -143,18 +143,18 @@
 	}
 
 	@SuppressWarnings("serial")
-	private static class BadRequest extends OAuth2Exception {
+	private static class MethodNotAllowed extends OAuth2Exception {
 
-		public BadRequest(String msg, Throwable t) {
+		public MethodNotAllowed(String msg, Throwable t) {
 			super(msg, t);
 		}
 
 		public String getOAuth2ErrorCode() {
-			return "bad_request";
+			return "method_not_allowed";
 		}
 
 		public int getHttpErrorCode() {
-			return 400;
+			return 405;
 		}
 
 	}
