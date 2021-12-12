diff --git a/portal-impl/src/com/liferay/portlet/messageboards/trash/MBCategoryTrashHandler.java b/portal-impl/src/com/liferay/portlet/messageboards/trash/MBCategoryTrashHandler.java
index 4c3e4b8..09bd4f6 100644
--- a/portal-impl/src/com/liferay/portlet/messageboards/trash/MBCategoryTrashHandler.java
+++ b/portal-impl/src/com/liferay/portlet/messageboards/trash/MBCategoryTrashHandler.java
@@ -187,8 +187,7 @@
 
 	@Override
 	public String getRootContainerModelTitle(
-			long containerModelId, Locale locale)
-		throws PortalException {
+		long containerModelId, Locale locale) {
 
 		return LanguageUtil.get(locale, "home");
 	}
