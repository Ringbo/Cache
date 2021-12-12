diff --git a/handlebars/src/com/dmarcotte/handlebars/editor/folding/HbFoldingBuilder.java b/handlebars/src/com/dmarcotte/handlebars/editor/folding/HbFoldingBuilder.java
index 285e9d7..6b3b8a4 100644
--- a/handlebars/src/com/dmarcotte/handlebars/editor/folding/HbFoldingBuilder.java
+++ b/handlebars/src/com/dmarcotte/handlebars/editor/folding/HbFoldingBuilder.java
@@ -42,7 +42,7 @@
       // tags before we allow folding
       if (commentText.length() > 6
           && commentText.substring(0, 3).equals("{{!")
-          && commentText.substring(commentText.length() - 2, commentText.length()).equals("}}")) {
+          && commentText.substring(commentText.length() - 2).equals("}}")) {
         TextRange range = new TextRange(commentNode.getTextRange().getStartOffset() + 3, commentNode.getTextRange().getEndOffset() - 2);
         descriptors.add(new FoldingDescriptor(commentNode, range));
       }
