diff --git a/platform/diff-impl/src/com/intellij/openapi/util/diff/tools/util/FoldingModelSupport.java b/platform/diff-impl/src/com/intellij/openapi/util/diff/tools/util/FoldingModelSupport.java
index 77661e0..9554ff5 100644
--- a/platform/diff-impl/src/com/intellij/openapi/util/diff/tools/util/FoldingModelSupport.java
+++ b/platform/diff-impl/src/com/intellij/openapi/util/diff/tools/util/FoldingModelSupport.java
@@ -514,7 +514,7 @@
       List<FoldedRange> ranges = new ArrayList<FoldedRange>(myFoldings.size());
       for (FoldedBlock folding : myFoldings) {
         FoldRegion region = folding.getRegion(index);
-        if (region == null) continue;
+        if (region == null || !region.isValid()) continue;
         DocumentEx document = myEditors[index].getDocument();
         int line1 = document.getLineNumber(region.getStartOffset());
         int line2 = document.getLineNumber(region.getEndOffset()) + 1;
@@ -553,7 +553,7 @@
 
         for (int i = 0; i < myCount; i++) {
           FoldRegion region = myRegions[i];
-          if (region == null) continue;
+          if (region == null || !region.isValid()) continue;
           myHighlighters.add(DiffDrawUtil.createLineSeparatorHighlighter(myEditors[i], region.getEndOffset(), new RangeCondition(region)));
         }
       }
@@ -568,7 +568,7 @@
       public void updateLineNumbers() {
         for (int i = 0; i < myCount; i++) {
           FoldRegion region = myRegions[i];
-          if (region == null) {
+          if (region == null || !region.isValid()) {
             myLines[i] = -1;
           }
           else {
@@ -605,7 +605,7 @@
 
     @Override
     public boolean get() {
-      return !myRegion.isExpanded();
+      return myRegion.isValid() && !myRegion.isExpanded();
     }
   }
 
