diff --git a/core/java/android/widget/ListPopupWindow.java b/core/java/android/widget/ListPopupWindow.java
index aaf299b..e9de385 100644
--- a/core/java/android/widget/ListPopupWindow.java
+++ b/core/java/android/widget/ListPopupWindow.java
@@ -202,7 +202,7 @@
         if (mObserver == null) {
             mObserver = new PopupDataSetObserver();
         } else if (mAdapter != null) {
-            adapter.unregisterDataSetObserver(mObserver);
+            mAdapter.unregisterDataSetObserver(mObserver);
         }
         mAdapter = adapter;
         if (mAdapter != null) {
