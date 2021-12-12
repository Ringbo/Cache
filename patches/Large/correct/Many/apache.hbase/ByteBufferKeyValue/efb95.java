diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/ByteBufferKeyValue.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/ByteBufferKeyValue.java
index f906681..c59b947 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/ByteBufferKeyValue.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/ByteBufferKeyValue.java
@@ -302,7 +302,7 @@
   }
 
   @Override
-  public Cell deepClone() {
+  public ExtendedCell deepClone() {
     byte[] copy = new byte[this.length];
     ByteBufferUtils.copyFromBufferToArray(copy, this.buf, this.offset, 0, this.length);
     KeyValue kv = new KeyValue(copy, 0, copy.length);
