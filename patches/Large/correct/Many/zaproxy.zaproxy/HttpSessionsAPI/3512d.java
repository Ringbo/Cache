diff --git a/src/org/zaproxy/zap/extension/httpsessions/HttpSessionsAPI.java b/src/org/zaproxy/zap/extension/httpsessions/HttpSessionsAPI.java
index c70b3a2..41ae614 100644
--- a/src/org/zaproxy/zap/extension/httpsessions/HttpSessionsAPI.java
+++ b/src/org/zaproxy/zap/extension/httpsessions/HttpSessionsAPI.java
@@ -134,7 +134,7 @@
 		HttpSessionsSite site;
 		switch (name) {
 		case ACTION_CREATE_EMPTY_SESSION:
-			site = extension.getHttpSessionsSite(getAuthority(params.getString(ACTION_PARAM_SITE)), false);
+			site = extension.getHttpSessionsSite(getAuthority(params.getString(ACTION_PARAM_SITE)), true);
 			if (site == null) {
 				throw new ApiException(ApiException.Type.ILLEGAL_PARAMETER, ACTION_PARAM_SITE);
 			}
