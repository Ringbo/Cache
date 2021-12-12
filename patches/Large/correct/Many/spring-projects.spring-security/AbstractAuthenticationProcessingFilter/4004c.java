diff --git a/web/src/main/java/org/springframework/security/web/authentication/AbstractAuthenticationProcessingFilter.java b/web/src/main/java/org/springframework/security/web/authentication/AbstractAuthenticationProcessingFilter.java
index ba40440..d133798 100644
--- a/web/src/main/java/org/springframework/security/web/authentication/AbstractAuthenticationProcessingFilter.java
+++ b/web/src/main/java/org/springframework/security/web/authentication/AbstractAuthenticationProcessingFilter.java
@@ -348,7 +348,7 @@
 		SecurityContextHolder.clearContext();
 
 		if (logger.isDebugEnabled()) {
-			logger.debug("Authentication request failed: " + failed.toString());
+			logger.debug("Authentication request failed: " + failed.toString(), failed);
 			logger.debug("Updated SecurityContextHolder to contain null Authentication");
 			logger.debug("Delegating to authentication failure handler " + failureHandler);
 		}
