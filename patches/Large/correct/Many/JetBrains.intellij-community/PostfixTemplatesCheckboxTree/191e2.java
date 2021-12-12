diff --git a/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/settings/PostfixTemplatesCheckboxTree.java b/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/settings/PostfixTemplatesCheckboxTree.java
index 46f7c25..2741cca 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/settings/PostfixTemplatesCheckboxTree.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/template/postfix/settings/PostfixTemplatesCheckboxTree.java
@@ -288,7 +288,7 @@
       PostfixEditTemplateDialog dialog = new PostfixEditTemplateDialog(this, editor, providerName, templateToEdit);
       if (dialog.showAndGet()) {
         PostfixTemplate newTemplate = editor.createTemplate(template.getId(), dialog.getTemplateName());
-        if (templateToEdit.isBuiltin()) {
+        if (template.isBuiltin()) {
           PostfixTemplate builtin = template instanceof PostfixChangedBuiltinTemplate
                                     ? ((PostfixChangedBuiltinTemplate)template).getBuiltinTemplate()
                                     : templateToEdit;
