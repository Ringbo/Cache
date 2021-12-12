diff --git a/storage/src/test/java/com/kylinolap/storage/hbase/coprocessor/endpoint/TableRecordInfoTest.java b/storage/src/test/java/com/kylinolap/storage/hbase/coprocessor/endpoint/TableRecordInfoTest.java
index 7aef11d..12706a9 100644
--- a/storage/src/test/java/com/kylinolap/storage/hbase/coprocessor/endpoint/TableRecordInfoTest.java
+++ b/storage/src/test/java/com/kylinolap/storage/hbase/coprocessor/endpoint/TableRecordInfoTest.java
@@ -31,7 +31,7 @@
     public void testSerialize() {
         byte[] x = TableRecordInfoDigest.serialize(this.tableRecordInfo.getDigest());
         TableRecordInfoDigest d = TableRecordInfoDigest.deserialize(x);
-        assertEquals(d.getColumnCount(), 9);
+        assertEquals(d.getColumnCount(), 25);
     }
 
     @After
