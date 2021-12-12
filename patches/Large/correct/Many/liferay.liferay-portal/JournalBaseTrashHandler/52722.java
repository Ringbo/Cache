diff --git a/portal-impl/src/com/liferay/portlet/journal/trash/JournalBaseTrashHandler.java b/portal-impl/src/com/liferay/portlet/journal/trash/JournalBaseTrashHandler.java
index 5615533..04ceccf 100644
--- a/portal-impl/src/com/liferay/portlet/journal/trash/JournalBaseTrashHandler.java
+++ b/portal-impl/src/com/liferay/portlet/journal/trash/JournalBaseTrashHandler.java
@@ -116,8 +116,7 @@
 
 	@Override
 	public String getRootContainerModelTitle(
-			long containerModelId, Locale locale)
-		throws PortalException {
+		long containerModelId, Locale locale) {
 
 		return LanguageUtil.get(locale, "home");
 	}
