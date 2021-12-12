diff --git a/xml/impl/src/com/intellij/codeInsight/completion/XmlTagInsertHandler.java b/xml/impl/src/com/intellij/codeInsight/completion/XmlTagInsertHandler.java
index 5b8276c..8b5f5f5 100644
--- a/xml/impl/src/com/intellij/codeInsight/completion/XmlTagInsertHandler.java
+++ b/xml/impl/src/com/intellij/codeInsight/completion/XmlTagInsertHandler.java
@@ -290,7 +290,8 @@
         template.addTextSegment(tag instanceof HtmlTag ? ">" : "/>");
       }
       else {
-        if (needAlLeastOneAttribute(tag) && WebEditorOptions.getInstance().isAutomaticallyStartAttribute() && tag.getAttributes().length == 0) {
+        if (needAlLeastOneAttribute(tag) && WebEditorOptions.getInstance().isAutomaticallyStartAttribute() && tag.getAttributes().length == 0
+            && template.getSegmentsCount() == 0) {
           completeAttribute(template);
           return true;
         }
