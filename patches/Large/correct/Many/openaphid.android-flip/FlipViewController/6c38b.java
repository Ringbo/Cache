diff --git a/FlipView/FlipLibrary/src/com/aphidmobile/flip/FlipViewController.java b/FlipView/FlipLibrary/src/com/aphidmobile/flip/FlipViewController.java
index b7ae3eb..42fabc2 100644
--- a/FlipView/FlipLibrary/src/com/aphidmobile/flip/FlipViewController.java
+++ b/FlipView/FlipLibrary/src/com/aphidmobile/flip/FlipViewController.java
@@ -103,7 +103,7 @@
       //XXX: use a SparseArray to keep the related view indices?
   private int bufferIndex = -1;
   private int adapterIndex = -1;
-  private int sideBufferSize = 1;
+  private final int sideBufferSize = 1;
 
   private float touchSlop;
 
@@ -529,7 +529,7 @@
         if (adapterIndex < adapterDataCount - 1) {
           adapterIndex++;
           View old = bufferedViews.get(bufferIndex);
-          if (bufferIndex > 0) {
+          if (bufferIndex + 1 > sideBufferSize) {
             releaseView(bufferedViews.removeFirst());
           }
           if (adapterIndex + sideBufferSize < adapterDataCount) {
@@ -543,7 +543,7 @@
         if (adapterIndex > 0) {
           adapterIndex--;
           View old = bufferedViews.get(bufferIndex);
-          if (bufferIndex < bufferedViews.size() - 1) {
+          if (bufferIndex - 1 + sideBufferSize < bufferedViews.size() - 1) {
             releaseView(bufferedViews.removeLast());
           }
           if (adapterIndex - sideBufferSize >= 0) {
