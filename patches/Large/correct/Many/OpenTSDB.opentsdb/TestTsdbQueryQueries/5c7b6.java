diff --git a/test/core/TestTsdbQueryQueries.java b/test/core/TestTsdbQueryQueries.java
index a218029..464cb91 100644
--- a/test/core/TestTsdbQueryQueries.java
+++ b/test/core/TestTsdbQueryQueries.java
@@ -490,7 +490,7 @@
     
     final byte[] key = 
         IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags);
-    Internal.prefixKeyWithSalt(key);
+    RowKey.prefixKeyWithSalt(key);
     System.arraycopy(Bytes.fromInt(1356998400), 0, key, 
         Const.SALT_WIDTH() + TSDB.metrics_width(), Const.TIMESTAMP_BYTES);
     assertEquals(1, storage.numColumns(key));
@@ -565,12 +565,12 @@
     // leave the others alone
     final byte[] key_a = 
         IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags);
-    Internal.prefixKeyWithSalt(key_a);
+    RowKey.prefixKeyWithSalt(key_a);
     final Map<String, String> tags_copy = new HashMap<String, String>(tags);
     tags_copy.put(TAGK_STRING, TAGV_B_STRING);
     final byte[] key_b = 
         IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags_copy);
-    Internal.prefixKeyWithSalt(key_b);
+    RowKey.prefixKeyWithSalt(key_b);
     
     System.arraycopy(Bytes.fromInt(1356998400), 0, key_a, 
         Const.SALT_WIDTH() + TSDB.metrics_width(), Const.TIMESTAMP_BYTES);
@@ -704,12 +704,12 @@
     // leave the others alone
     final byte[] key_a = 
         IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags);
-    Internal.prefixKeyWithSalt(key_a);
+    RowKey.prefixKeyWithSalt(key_a);
     final Map<String, String> tags_copy = new HashMap<String, String>(tags);
     tags_copy.put(TAGK_STRING, TAGV_B_STRING);
     final byte[] key_b = 
         IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags_copy);
-    Internal.prefixKeyWithSalt(key_b);
+    RowKey.prefixKeyWithSalt(key_b);
     
     System.arraycopy(Bytes.fromInt(1356998400), 0, key_a, 
         Const.SALT_WIDTH() + TSDB.metrics_width(), Const.TIMESTAMP_BYTES);
@@ -757,7 +757,7 @@
     // in a row without any data
     final byte[] key = 
         IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags);
-    Internal.prefixKeyWithSalt(key);
+    RowKey.prefixKeyWithSalt(key);
     System.arraycopy(Bytes.fromInt(1357002000), 0, key, 
         Const.SALT_WIDTH() + TSDB.metrics_width(), Const.TIMESTAMP_BYTES);
     storage.flushRow(key);
@@ -798,7 +798,7 @@
     // in a row without any data
     final byte[] key = 
         IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags);
-    Internal.prefixKeyWithSalt(key);
+    RowKey.prefixKeyWithSalt(key);
     System.arraycopy(Bytes.fromInt(1357002000), 0, key, 
         Const.SALT_WIDTH() + TSDB.metrics_width(), Const.TIMESTAMP_BYTES);
     storage.flushRow(key);
@@ -846,7 +846,7 @@
     
     final byte[] key = 
         IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags);
-    Internal.prefixKeyWithSalt(key);
+    RowKey.prefixKeyWithSalt(key);
     System.arraycopy(Bytes.fromInt(1357002000), 0, key, 
         Const.SALT_WIDTH() + TSDB.metrics_width(), Const.TIMESTAMP_BYTES);
     storage.flushRow(key);
@@ -1078,7 +1078,7 @@
     final byte[] val6 = Bytes.fromLong(6L);
 
     final byte[] key = IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags);
-    Internal.prefixKeyWithSalt(key);
+    RowKey.prefixKeyWithSalt(key);
     System.arraycopy(Bytes.fromInt(1356998400), 0, key, 
         Const.SALT_WIDTH() + TSDB.metrics_width(), Const.TIMESTAMP_BYTES);
     
@@ -1133,7 +1133,7 @@
     final byte[] val6 = Bytes.fromLong(6L);
 
     final byte[] key = IncomingDataPoints.rowKeyTemplate(tsdb, METRIC_STRING, tags);
-    Internal.prefixKeyWithSalt(key);
+    RowKey.prefixKeyWithSalt(key);
     System.arraycopy(Bytes.fromInt(1356998400), 0, key, 
         Const.SALT_WIDTH() + TSDB.metrics_width(), Const.TIMESTAMP_BYTES);
     
