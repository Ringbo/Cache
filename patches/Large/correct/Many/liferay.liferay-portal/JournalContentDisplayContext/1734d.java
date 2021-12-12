diff --git a/portal-impl/src/com/liferay/portlet/journalcontent/context/JournalContentDisplayContext.java b/portal-impl/src/com/liferay/portlet/journalcontent/context/JournalContentDisplayContext.java
index ce16992..f0490c6 100644
--- a/portal-impl/src/com/liferay/portlet/journalcontent/context/JournalContentDisplayContext.java
+++ b/portal-impl/src/com/liferay/portlet/journalcontent/context/JournalContentDisplayContext.java
@@ -196,7 +196,7 @@
 		return currentExtensions;
 	}
 
-	public DDMTemplate getDDMTemplate() {
+	public DDMTemplate getDDMTemplate() throws PortalException {
 		if (_ddmTemplate != null) {
 			return _ddmTemplate;
 		}
@@ -549,7 +549,7 @@
 		return _showEditArticleIcon;
 	}
 
-	public boolean isShowEditTemplateIcon() {
+	public boolean isShowEditTemplateIcon() throws PortalException {
 		if (_showEditTemplateIcon != null) {
 			return _showEditTemplateIcon;
 		}
