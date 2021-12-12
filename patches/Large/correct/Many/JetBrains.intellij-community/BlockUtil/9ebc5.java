diff --git a/platform/lang-impl/src/com/intellij/formatting/templateLanguages/BlockUtil.java b/platform/lang-impl/src/com/intellij/formatting/templateLanguages/BlockUtil.java
index 1a67ea0..d6079a7 100644
--- a/platform/lang-impl/src/com/intellij/formatting/templateLanguages/BlockUtil.java
+++ b/platform/lang-impl/src/com/intellij/formatting/templateLanguages/BlockUtil.java
@@ -73,10 +73,11 @@
       if (bounds.contains(textRange)) {
         createAndAddBlock(before, block, null);
       }
-      else if (bounds.getEndOffset() < textRange.getStartOffset()) {
+      else if (bounds.getEndOffset() <= textRange.getStartOffset()) {
         createAndAddBlock(after, block, null);
       }
       else {
+        //assert block.getSubBlocks().size() != 0 : "Block " + block.getTextRange() + " doesn't contain subblocks!";
         splitByRightBoundAndCollectBlocks(block.getSubBlocks(), before, after, bounds);
       }
     }
