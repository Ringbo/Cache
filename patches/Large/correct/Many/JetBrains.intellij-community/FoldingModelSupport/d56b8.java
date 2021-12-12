diff --git a/platform/diff-impl/src/com/intellij/diff/tools/util/FoldingModelSupport.java b/platform/diff-impl/src/com/intellij/diff/tools/util/FoldingModelSupport.java
index f6ee853..27307d8 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/util/FoldingModelSupport.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/util/FoldingModelSupport.java
@@ -546,7 +546,7 @@
           FoldedRange range = ranges.get(myIndex[index]);
           if (range.myEndLine <= start) continue;
           if (range.myStartLine >= end) return null;
-          if (range.myStartLine < end && range.myEndLine > start) {
+          if (range.myStartLine <= start && range.myEndLine >= end) {
             return range.myExpanded;
           }
         }
