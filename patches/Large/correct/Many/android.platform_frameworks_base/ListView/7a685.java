diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index 5a97317..e37ccf8 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -264,7 +264,7 @@
 
         // in the case of re-adding a header view, or adding one later on,
         // we need to notify the observer
-        if (mDataSetObserver != null) {
+        if (mAdapter != null && mDataSetObserver != null) {
             mDataSetObserver.onChanged();
         }
     }
@@ -299,7 +299,7 @@
     public boolean removeHeaderView(View v) {
         if (mHeaderViewInfos.size() > 0) {
             boolean result = false;
-            if (((HeaderViewListAdapter) mAdapter).removeHeader(v)) {
+            if (mAdapter != null && ((HeaderViewListAdapter) mAdapter).removeHeader(v)) {
                 if (mDataSetObserver != null) {
                     mDataSetObserver.onChanged();
                 }
@@ -350,7 +350,7 @@
 
         // in the case of re-adding a footer view, or adding one later on,
         // we need to notify the observer
-        if (mDataSetObserver != null) {
+        if (mAdapter != null && mDataSetObserver != null) {
             mDataSetObserver.onChanged();
         }
     }
@@ -384,7 +384,7 @@
     public boolean removeFooterView(View v) {
         if (mFooterViewInfos.size() > 0) {
             boolean result = false;
-            if (((HeaderViewListAdapter) mAdapter).removeFooter(v)) {
+            if (mAdapter != null && ((HeaderViewListAdapter) mAdapter).removeFooter(v)) {
                 if (mDataSetObserver != null) {
                     mDataSetObserver.onChanged();
                 }
