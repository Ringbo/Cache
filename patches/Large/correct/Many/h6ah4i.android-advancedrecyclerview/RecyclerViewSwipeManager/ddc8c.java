diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager.java
index 716a23c..87f5456 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager.java
@@ -1006,7 +1006,7 @@
         }
 
         public void release() {
-            removeCallbacks(null);
+            removeCallbacksAndMessages(null);
             mHolder = null;
         }
 
