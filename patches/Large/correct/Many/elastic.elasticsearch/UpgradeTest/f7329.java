diff --git a/src/test/java/org/elasticsearch/rest/action/admin/indices/upgrade/UpgradeTest.java b/src/test/java/org/elasticsearch/rest/action/admin/indices/upgrade/UpgradeTest.java
index ddf4bbe..3b9f8c1 100644
--- a/src/test/java/org/elasticsearch/rest/action/admin/indices/upgrade/UpgradeTest.java
+++ b/src/test/java/org/elasticsearch/rest/action/admin/indices/upgrade/UpgradeTest.java
@@ -134,7 +134,7 @@
         logger.info("--> Nodes upgrade complete");
         logSegmentsState();
         
-        assertNotUpgraded(client(), null);
+        assertNotUpgraded(client());
         final String indexToUpgrade = "test" + randomInt(numIndexes - 1);
 
         // This test fires up another node running an older version of ES, but because wire protocol changes across major ES versions, it
@@ -159,10 +159,10 @@
         assertNoFailures(client().admin().indices().prepareUpgrade().get());
         logSegmentsState();
         logger.info("--> Full upgrade complete");
-        assertUpgraded(client(), null);
+        assertUpgraded(client());
     }
 
-    public static void assertNotUpgraded(Client client, String index) throws Exception {
+    public static void assertNotUpgraded(Client client, String... index) throws Exception {
         for (IndexUpgradeStatus status : getUpgradeStatus(client, index)) {
             assertTrue("index " + status.getIndex() + " should not be zero sized", status.getTotalBytes() != 0);
             // TODO: it would be better for this to be strictly greater, but sometimes an extra flush
@@ -173,7 +173,7 @@
         }
     }
 
-    public static void assertNoAncientSegments(Client client, String index) throws Exception {
+    public static void assertNoAncientSegments(Client client, String... index) throws Exception {
         for (IndexUpgradeStatus status : getUpgradeStatus(client, index)) {
             assertTrue("index " + status.getIndex() + " should not be zero sized", status.getTotalBytes() != 0);
             // TODO: it would be better for this to be strictly greater, but sometimes an extra flush
@@ -206,7 +206,7 @@
         return false;
     }
 
-    public static void assertUpgraded(Client client, String index) throws Exception {
+    public static void assertUpgraded(Client client, String... index) throws Exception {
         for (IndexUpgradeStatus status : getUpgradeStatus(client, index)) {
             assertTrue("index " + status.getIndex() + " should not be zero sized", status.getTotalBytes() != 0);
             assertEquals("index " + status.getIndex() + " should be upgraded",
