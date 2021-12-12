diff --git a/platform/lang-impl/src/com/intellij/codeInsight/template/impl/ListTemplatesHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/template/impl/ListTemplatesHandler.java
index 4236d58..0fc6f04 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/template/impl/ListTemplatesHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/template/impl/ListTemplatesHandler.java
@@ -81,7 +81,7 @@
 
   public static Map<TemplateImpl, String> filterTemplatesByPrefix(@NotNull Collection<TemplateImpl> templates, @NotNull Editor editor,
                                                                   int offset, boolean fullMatch, boolean searchInDescription) {
-    if (offset >= editor.getDocument().getTextLength()) {
+    if (offset > editor.getDocument().getTextLength()) {
       Logger.getInstance(ListTemplatesHandler.class).error("Cannot filter templates, index out of bounds. Offset: " + offset, 
                                                            AttachmentFactory.createAttachment(editor.getDocument()));
     }
