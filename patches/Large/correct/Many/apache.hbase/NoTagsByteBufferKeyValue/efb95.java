diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/NoTagsByteBufferKeyValue.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/NoTagsByteBufferKeyValue.java
index 1822563..82b243b 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/NoTagsByteBufferKeyValue.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/NoTagsByteBufferKeyValue.java
@@ -52,7 +52,7 @@
   }
 
   @Override
-  public Cell deepClone() {
+  public ExtendedCell deepClone() {
     byte[] copy = new byte[this.length];
     ByteBufferUtils.copyFromBufferToArray(copy, this.buf, this.offset, 0, this.length);
     KeyValue kv = new NoTagsKeyValue(copy, 0, copy.length);
