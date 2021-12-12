diff --git a/app/src/main/java/com/hippo/ehviewer/download/DownloadManager.java b/app/src/main/java/com/hippo/ehviewer/download/DownloadManager.java
index 8954087..72620d4 100644
--- a/app/src/main/java/com/hippo/ehviewer/download/DownloadManager.java
+++ b/app/src/main/java/com/hippo/ehviewer/download/DownloadManager.java
@@ -299,7 +299,9 @@
                 continue;
             }
 
-            if (info.state != DownloadInfo.STATE_WAIT) {
+            if (info.state == DownloadInfo.STATE_NONE ||
+                    info.state == DownloadInfo.STATE_FAILED ||
+                    info.state == DownloadInfo.STATE_FINISH) {
                 update = true;
                 // Set state DownloadInfo.STATE_WAIT
                 info.state = DownloadInfo.STATE_WAIT;
@@ -323,6 +325,7 @@
     void startAllDownload() {
         boolean update = false;
         // Start all STATE_NONE and STATE_FAILED item
+        // TODO keep order in wait list
         SparseArray<DownloadInfo> allInfoMap = mAllInfoMap;
         List<DownloadInfo> waitList = mWaitList;
         for (int i = 0, n = allInfoMap.size(); i < n; i++) {
@@ -873,7 +876,7 @@
         }
     }
 
-    private static Comparator<DownloadInfo> sDateAscComparator = new Comparator<DownloadInfo>() {
+    private static final Comparator<DownloadInfo> sDateAscComparator = new Comparator<DownloadInfo>() {
         @Override
         public int compare(DownloadInfo lhs, DownloadInfo rhs) {
             return lhs.date - rhs.date > 0 ? 1 : -1;
@@ -882,15 +885,30 @@
 
     public interface DownloadInfoListener {
 
-        void onAdd(DownloadInfo info, List<DownloadInfo> list, int position);
+        /**
+         * Add the special info to the special position
+         */
+        void onAdd(@NonNull DownloadInfo info, @NonNull List<DownloadInfo> list, int position);
 
-        void onUpdate(DownloadInfo info, List<DownloadInfo> list);
+        /**
+         * The special info is changed
+         */
+        void onUpdate(@NonNull DownloadInfo info, @NonNull List<DownloadInfo> list);
 
+        /**
+         * Maybe all data is changed, but size is the same
+         */
         void onUpdateAll();
 
+        /**
+         * Maybe all data is changed, maybe size is changed
+         */
         void onReload();
 
-        void onRemove(DownloadInfo info, List<DownloadInfo> list, int position);
+        /**
+         * Remove the special info from the special position
+         */
+        void onRemove(@NonNull DownloadInfo info, @NonNull List<DownloadInfo> list, int position);
 
         void onUpdateLabels();
     }
