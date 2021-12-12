diff --git a/webs/wurfl-web/docroot/WEB-INF/src/com/liferay/portal/mobile/device/wurfl/WURFLHolderImpl.java b/webs/wurfl-web/docroot/WEB-INF/src/com/liferay/portal/mobile/device/wurfl/WURFLHolderImpl.java
index c1167e8..7387b29 100644
--- a/webs/wurfl-web/docroot/WEB-INF/src/com/liferay/portal/mobile/device/wurfl/WURFLHolderImpl.java
+++ b/webs/wurfl-web/docroot/WEB-INF/src/com/liferay/portal/mobile/device/wurfl/WURFLHolderImpl.java
@@ -154,7 +154,7 @@
 			PortletPropsValues.WURFL_DATABASE_PATCHES);
 
 		for (String fileName : fileNames) {
-			File file = new File(fileName);
+			File file = new File(PortletPropsValues.WURFL_DATABASE_PATCHES, fileName);
 
 			FileInputStream fileInputStream = new FileInputStream(file);
 
