diff --git a/portal-impl/src/com/liferay/portal/xuggler/XugglerImpl.java b/portal-impl/src/com/liferay/portal/xuggler/XugglerImpl.java
index 53b4af8..a1ef710 100644
--- a/portal-impl/src/com/liferay/portal/xuggler/XugglerImpl.java
+++ b/portal-impl/src/com/liferay/portal/xuggler/XugglerImpl.java
@@ -115,7 +115,7 @@
 	}
 
 	protected void informAdministrator(String errorMessage) {
-		if (!_informAdministrator) {
+		if (!_informAdministrator || !_log.isWarnEnabled()) {
 			return;
 		}
 
@@ -131,7 +131,7 @@
 		sb.append("/external-services. Error message is: ");
 		sb.append(errorMessage);
 
-		_log.error(sb.toString());
+		_log.warn(sb.toString());
 	}
 
 	private static final Log _log = LogFactoryUtil.getLog(XugglerImpl.class);
