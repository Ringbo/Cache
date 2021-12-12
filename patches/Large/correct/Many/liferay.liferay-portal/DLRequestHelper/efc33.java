diff --git a/modules/apps/document-library/document-library-web/src/main/java/com/liferay/document/library/web/internal/display/context/util/DLRequestHelper.java b/modules/apps/document-library/document-library-web/src/main/java/com/liferay/document/library/web/internal/display/context/util/DLRequestHelper.java
index 711ac3a..e8d499d 100644
--- a/modules/apps/document-library/document-library-web/src/main/java/com/liferay/document/library/web/internal/display/context/util/DLRequestHelper.java
+++ b/modules/apps/document-library/document-library-web/src/main/java/com/liferay/document/library/web/internal/display/context/util/DLRequestHelper.java
@@ -71,7 +71,7 @@
 	}
 
 	public DLPortletInstanceSettings getDLPortletInstanceSettings() {
-		if (_dlGroupServiceSettings != null) {
+		if (_dlPortletInstanceSettings != null) {
 			return _dlPortletInstanceSettings;
 		}
 
