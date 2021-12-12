diff --git a/tests/src/test/java/tachyon/client/keyvalue/hadoop/KeyValueStoreMapReduceIntegrationTest.java b/tests/src/test/java/tachyon/client/keyvalue/hadoop/KeyValueStoreMapReduceIntegrationTest.java
index 9bd8778..b34b8aa 100644
--- a/tests/src/test/java/tachyon/client/keyvalue/hadoop/KeyValueStoreMapReduceIntegrationTest.java
+++ b/tests/src/test/java/tachyon/client/keyvalue/hadoop/KeyValueStoreMapReduceIntegrationTest.java
@@ -50,7 +50,7 @@
 
   @ClassRule
   public static LocalTachyonClusterResource sLocalTachyonClusterResource =
-      new LocalTachyonClusterResource(Constants.GB, Constants.KB, BLOCK_SIZE,
+      new LocalTachyonClusterResource(Constants.GB, BLOCK_SIZE,
           /* ensure key-value service is turned on */
           Constants.KEY_VALUE_ENABLED, "true",
           Constants.KEY_VALUE_PARTITION_SIZE_BYTES_MAX, Integer.toString(KEY_VALUE_PARTITION_SIZE));
