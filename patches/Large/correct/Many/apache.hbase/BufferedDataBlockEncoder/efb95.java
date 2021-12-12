diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/io/encoding/BufferedDataBlockEncoder.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/io/encoding/BufferedDataBlockEncoder.java
index 00ec0fc..bc905e5 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/io/encoding/BufferedDataBlockEncoder.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/io/encoding/BufferedDataBlockEncoder.java
@@ -470,7 +470,7 @@
     }
 
     @Override
-    public Cell deepClone() {
+    public ExtendedCell deepClone() {
       // This is not used in actual flow. Throwing UnsupportedOperationException
       throw new UnsupportedOperationException();
     }
@@ -715,7 +715,7 @@
     }
 
     @Override
-    public Cell deepClone() {
+    public ExtendedCell deepClone() {
       // This is not used in actual flow. Throwing UnsupportedOperationException
       throw new UnsupportedOperationException();
     }
