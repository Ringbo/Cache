diff --git a/portal-impl/src/com/liferay/portlet/messageboards/util/MBUtil.java b/portal-impl/src/com/liferay/portlet/messageboards/util/MBUtil.java
index 5771c8a..661578f 100644
--- a/portal-impl/src/com/liferay/portlet/messageboards/util/MBUtil.java
+++ b/portal-impl/src/com/liferay/portlet/messageboards/util/MBUtil.java
@@ -692,7 +692,7 @@
 		long plid, long categoryId, long threadId, long userId,
 		ThemeDisplay themeDisplay) {
 
-		StringBundler sb = new StringBundler(5);
+		StringBundler sb = new StringBundler(10);
 
 		sb.append(themeDisplay.getPortalURL());
 		sb.append(themeDisplay.getPathMain());
