diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/RecyclerViewDragDropManager.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/RecyclerViewDragDropManager.java
index dd34de9..1080099 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/RecyclerViewDragDropManager.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/RecyclerViewDragDropManager.java
@@ -2056,7 +2056,7 @@
         }
 
         public void release() {
-            removeCallbacks(null);
+            removeCallbacksAndMessages(null);
             mHolder = null;
         }
 
