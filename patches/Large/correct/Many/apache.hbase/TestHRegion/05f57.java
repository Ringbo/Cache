diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestHRegion.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestHRegion.java
index 9e130eb..6856aad 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestHRegion.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestHRegion.java
@@ -244,7 +244,7 @@
     dir = TEST_UTIL.getDataTestDir("TestHRegion").toString();
     method = name.getMethodName();
     tableName = TableName.valueOf(method);
-    CONF.set(CompactingMemStore.IN_MEMORY_FLUSH_THRESHOLD_FACTOR_KEY, String.valueOf(0.02));
+    CONF.set(CompactingMemStore.IN_MEMORY_FLUSH_THRESHOLD_FACTOR_KEY, String.valueOf(0.09));
   }
 
   @After
