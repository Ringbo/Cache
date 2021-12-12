diff --git a/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/internal/display/context/JournalDDMTemplateDisplayContext.java b/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/internal/display/context/JournalDDMTemplateDisplayContext.java
index 32b9aa0..8c82dfb 100644
--- a/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/internal/display/context/JournalDDMTemplateDisplayContext.java
+++ b/modules/apps/journal/journal-web/src/main/java/com/liferay/journal/web/internal/display/context/JournalDDMTemplateDisplayContext.java
@@ -101,7 +101,8 @@
 					dropdownItem -> {
 						dropdownItem.setHref(
 							_renderResponse.createRenderURL(), "mvcPath",
-							"/edit_ddm_template.jsp", "groupId",
+							"/edit_ddm_template.jsp", "redirect",
+							themeDisplay.getURLCurrent(), "groupId",
 							String.valueOf(themeDisplay.getScopeGroupId()),
 							"classNameId",
 							String.valueOf(
