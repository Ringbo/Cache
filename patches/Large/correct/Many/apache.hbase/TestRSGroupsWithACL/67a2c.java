diff --git a/hbase-rsgroup/src/test/java/org/apache/hadoop/hbase/rsgroup/TestRSGroupsWithACL.java b/hbase-rsgroup/src/test/java/org/apache/hadoop/hbase/rsgroup/TestRSGroupsWithACL.java
index a428cfc..c5e4619 100644
--- a/hbase-rsgroup/src/test/java/org/apache/hadoop/hbase/rsgroup/TestRSGroupsWithACL.java
+++ b/hbase-rsgroup/src/test/java/org/apache/hadoop/hbase/rsgroup/TestRSGroupsWithACL.java
@@ -166,9 +166,9 @@
     grantGlobal(TEST_UTIL, toGroupEntry(GROUP_READ), Permission.Action.READ);
     grantGlobal(TEST_UTIL, toGroupEntry(GROUP_WRITE), Permission.Action.WRITE);
 
-    assertEquals(5, AccessControlLists.getTablePermissions(conf, TEST_TABLE).size());
+    assertEquals(4, AccessControlLists.getTablePermissions(conf, TEST_TABLE).size());
     try {
-      assertEquals(5, AccessControlClient.getUserPermissions(systemUserConnection,
+      assertEquals(4, AccessControlClient.getUserPermissions(systemUserConnection,
           TEST_TABLE.toString()).size());
     } catch (Throwable e) {
       LOG.error("error during call of AccessControlClient.getUserPermissions. ", e);
