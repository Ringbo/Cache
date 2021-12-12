diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/client/TestUpdateConfiguration.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/client/TestUpdateConfiguration.java
index 731e02f..d54cb53 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/client/TestUpdateConfiguration.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/client/TestUpdateConfiguration.java
@@ -49,7 +49,7 @@
   @Test
   public void testOnlineConfigChange() throws IOException {
     LOG.debug("Starting the test");
-    Admin admin = TEST_UTIL.getHBaseAdmin();
+    Admin admin = TEST_UTIL.getAdmin();
     ServerName server = TEST_UTIL.getHBaseCluster().getRegionServer(0).getServerName();
     admin.updateConfiguration(server);
   }
@@ -65,7 +65,7 @@
     // update hbase-site.xml by overwriting it
     Files.copy(cnf2Path, cnfPath, StandardCopyOption.REPLACE_EXISTING);
 
-    Admin admin = TEST_UTIL.getHBaseAdmin();
+    Admin admin = TEST_UTIL.getAdmin();
     ServerName server = TEST_UTIL.getHBaseCluster().getMaster().getServerName();
     admin.updateConfiguration(server);
     Configuration conf = TEST_UTIL.getMiniHBaseCluster().getMaster().getConfiguration();
