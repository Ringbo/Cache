diff --git a/xml/impl/src/com/intellij/codeInsight/completion/XmlTagInsertHandler.java b/xml/impl/src/com/intellij/codeInsight/completion/XmlTagInsertHandler.java
index 3592b78..5b8276c 100644
--- a/xml/impl/src/com/intellij/codeInsight/completion/XmlTagInsertHandler.java
+++ b/xml/impl/src/com/intellij/codeInsight/completion/XmlTagInsertHandler.java
@@ -285,12 +285,12 @@
         return true;
       }
     }
-    else if (completionChar == Lookup.AUTO_INSERT_SELECT_CHAR || completionChar == Lookup.NORMAL_SELECT_CHAR) {
+    else if (completionChar == Lookup.AUTO_INSERT_SELECT_CHAR || completionChar == Lookup.NORMAL_SELECT_CHAR || completionChar == Lookup.REPLACE_SELECT_CHAR) {
       if (WebEditorOptions.getInstance().isAutomaticallyInsertClosingTag() && HtmlUtil.isSingleHtmlTag(tag.getName())) {
         template.addTextSegment(tag instanceof HtmlTag ? ">" : "/>");
       }
       else {
-        if (needAlLeastOneAttribute(tag) && WebEditorOptions.getInstance().isAutomaticallyStartAttribute()) {
+        if (needAlLeastOneAttribute(tag) && WebEditorOptions.getInstance().isAutomaticallyStartAttribute() && tag.getAttributes().length == 0) {
           completeAttribute(template);
           return true;
         }
