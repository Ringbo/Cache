diff --git a/src/org/zaproxy/zap/extension/api/API.java b/src/org/zaproxy/zap/extension/api/API.java
index 138554d..f50b919 100644
--- a/src/org/zaproxy/zap/extension/api/API.java
+++ b/src/org/zaproxy/zap/extension/api/API.java
@@ -173,7 +173,7 @@
 		if (this.getOptionsParamApi().isSecureOnly() && ! requestHeader.isSecure()) {
 			// Insecure request with secure only set, always ignore
 			logger.debug("handleApiRequest rejecting insecure request");
-			return false;
+			return true;
 		}
 			
 		logger.debug("handleApiRequest " + url);
