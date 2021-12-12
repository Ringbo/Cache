diff --git a/src/core/RowKey.java b/src/core/RowKey.java
index 694ac11..3563d8e 100644
--- a/src/core/RowKey.java
+++ b/src/core/RowKey.java
@@ -55,7 +55,7 @@
    */
   public static Deferred<String> metricNameAsync(final TSDB tsdb, 
       final byte[] row) {
-    if (row == null || row.length < 0) {
+    if (row == null || row.length < 1) {
       throw new IllegalArgumentException("Row key cannot be null or empty");
     }
     if (row.length < Const.SALT_WIDTH() + tsdb.metrics.width()) {
