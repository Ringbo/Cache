diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index 3fa0940..94dadb4 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -2606,7 +2606,7 @@
             mGlobalLayoutListenerAddedFilter = false;
         }
 
-        if (mAdapter != null) {
+        if (mAdapter != null && mDataSetObserver != null) {
             mAdapter.unregisterDataSetObserver(mDataSetObserver);
             mDataSetObserver = null;
         }
