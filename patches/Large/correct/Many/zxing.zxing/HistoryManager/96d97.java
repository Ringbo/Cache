diff --git a/android/src/com/google/zxing/client/android/history/HistoryManager.java b/android/src/com/google/zxing/client/android/history/HistoryManager.java
index 2eb9585..12863ac 100644
--- a/android/src/com/google/zxing/client/android/history/HistoryManager.java
+++ b/android/src/com/google/zxing/client/android/history/HistoryManager.java
@@ -298,7 +298,7 @@
   static Uri saveHistory(String history) {
     File bsRoot = new File(Environment.getExternalStorageDirectory(), "BarcodeScanner");
     File historyRoot = new File(bsRoot, "History");
-    if (!historyRoot.exists() && !historyRoot.mkdirs()) {
+    if (!historyRoot.mkdirs() && !historyRoot.isDirectory()) {
       Log.w(TAG, "Couldn't make dir " + historyRoot);
       return null;
     }
