diff --git a/src/test/java/org/apache/hadoop/hbase/rest/TestTransform.java b/src/test/java/org/apache/hadoop/hbase/rest/TestTransform.java
index 548f909..a65a924 100644
--- a/src/test/java/org/apache/hadoop/hbase/rest/TestTransform.java
+++ b/src/test/java/org/apache/hadoop/hbase/rest/TestTransform.java
@@ -91,7 +91,7 @@
     assertEquals(response.getCode(), 200);
 
     // get the table contents directly
-    HTable table = new HTable(TABLE);
+    HTable table = new HTable(TEST_UTIL.getConfiguration(), TABLE);
     Get get = new Get(Bytes.toBytes(ROW_1));
     get.addFamily(Bytes.toBytes(CFA));
     get.addFamily(Bytes.toBytes(CFB));
