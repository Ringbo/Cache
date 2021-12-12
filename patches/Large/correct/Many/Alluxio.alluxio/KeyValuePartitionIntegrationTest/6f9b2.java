diff --git a/integration-tests/src/test/java/tachyon/client/keyvalue/KeyValuePartitionIntegrationTest.java b/integration-tests/src/test/java/tachyon/client/keyvalue/KeyValuePartitionIntegrationTest.java
index f810995..261f120 100644
--- a/integration-tests/src/test/java/tachyon/client/keyvalue/KeyValuePartitionIntegrationTest.java
+++ b/integration-tests/src/test/java/tachyon/client/keyvalue/KeyValuePartitionIntegrationTest.java
@@ -44,7 +44,9 @@
 
   @ClassRule
   public static LocalTachyonClusterResource sLocalTachyonClusterResource =
-      new LocalTachyonClusterResource(Constants.GB, Constants.KB, BLOCK_SIZE);
+      new LocalTachyonClusterResource(Constants.GB, Constants.KB, BLOCK_SIZE,
+          /* ensure key-value service is turned on */
+          Constants.KEYVALUE_ENABLED, "true");
 
   @BeforeClass
   public static void beforeClass() throws Exception {
