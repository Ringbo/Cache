diff --git a/src/core/TsdbQuery.java b/src/core/TsdbQuery.java
index fbb8e31..354da65 100644
--- a/src/core/TsdbQuery.java
+++ b/src/core/TsdbQuery.java
@@ -575,7 +575,7 @@
     final byte[] end_row = new byte[metric_salt_width + Const.TIMESTAMP_BYTES];
     
     if (Const.SALT_WIDTH() > 0) {
-      final byte[] salt = Internal.getSaltBytes(salt_bucket);
+      final byte[] salt = RowKey.getSaltBytes(salt_bucket);
       System.arraycopy(salt, 0, start_row, 0, Const.SALT_WIDTH());
       System.arraycopy(salt, 0, end_row, 0, Const.SALT_WIDTH());
     }
