diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/trash/DLBaseTrashHandler.java b/portal-impl/src/com/liferay/portlet/documentlibrary/trash/DLBaseTrashHandler.java
index aaea7f6..1184fcf 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/trash/DLBaseTrashHandler.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/trash/DLBaseTrashHandler.java
@@ -129,8 +129,7 @@
 
 	@Override
 	public String getRootContainerModelTitle(
-			long containerModelId, Locale locale)
-		throws PortalException {
+		long containerModelId, Locale locale) {
 
 		return LanguageUtil.get(locale, "home");
 	}
