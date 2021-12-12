diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/utils/BaseWrapperAdapter.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/utils/BaseWrapperAdapter.java
index c7a1bd2..36b39d4 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/utils/BaseWrapperAdapter.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/utils/BaseWrapperAdapter.java
@@ -133,7 +133,7 @@
     }
 
     protected void onHandleWrappedAdapterItemRangeChanged(int positionStart, int itemCount, Object payload) {
-        notifyItemRangeChanged(positionStart, itemCount);
+        notifyItemRangeChanged(positionStart, itemCount, payload);
     }
 
     protected void onHandleWrappedAdapterItemRangeInserted(int positionStart, int itemCount) {
