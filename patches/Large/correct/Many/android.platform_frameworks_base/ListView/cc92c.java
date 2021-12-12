diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index 5382894..91f4946 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -415,7 +415,7 @@
      */
     @Override
     public void setAdapter(ListAdapter adapter) {
-        if (mAdapter != null) {
+        if (mAdapter != null && mDataSetObserver != null) {
             mAdapter.unregisterDataSetObserver(mDataSetObserver);
         }
 
