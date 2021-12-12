diff --git a/contrib/stress/src/org/apache/cassandra/contrib/stress/operations/IndexedRangeSlicer.java b/contrib/stress/src/org/apache/cassandra/contrib/stress/operations/IndexedRangeSlicer.java
index 7de9ffe..1c1b889 100644
--- a/contrib/stress/src/org/apache/cassandra/contrib/stress/operations/IndexedRangeSlicer.java
+++ b/contrib/stress/src/org/apache/cassandra/contrib/stress/operations/IndexedRangeSlicer.java
@@ -40,7 +40,7 @@
                                                                                       ByteBuffer.wrap(new byte[] {}),
                                                                                       false, session.getColumnsPerKey()));
 
-        List<String> values = super.generateValues();
+        List<ByteBuffer> values = super.generateValues();
         ColumnParent parent = new ColumnParent("Standard1");
         int expectedPerValue = session.getNumKeys() / values.size();
 
@@ -49,7 +49,7 @@
         int received = 0;
 
         String startOffset = "0";
-        ByteBuffer value = ByteBufferUtil.bytes(values.get(index % values.size()));
+        ByteBuffer value = values.get(index % values.size());
 
         IndexExpression expression = new IndexExpression(columnName, IndexOperator.EQ, value);
 
