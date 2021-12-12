diff --git a/handlebars/src/com/dmarcotte/handlebars/format/HbFormattingModelBuilder.java b/handlebars/src/com/dmarcotte/handlebars/format/HbFormattingModelBuilder.java
index 32c3684..ccc2db1 100644
--- a/handlebars/src/com/dmarcotte/handlebars/format/HbFormattingModelBuilder.java
+++ b/handlebars/src/com/dmarcotte/handlebars/format/HbFormattingModelBuilder.java
@@ -110,7 +110,7 @@
     public ChildAttributes getChildAttributes(int newChildIndex) {
       if (newChildIndex > 0) {
         List<Block> blocks = getSubBlocks();
-        if (blocks.size() >= newChildIndex - 1) {
+        if (blocks.size() > newChildIndex - 1) {
           Block prevBlock = blocks.get(newChildIndex - 1);
           if (prevBlock instanceof AbstractBlock) {
             ASTNode node = ((AbstractBlock)prevBlock).getNode();
