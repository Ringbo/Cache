diff --git a/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerTest.java b/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerTest.java
index 3919fec..3a16418 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerTest.java
@@ -101,7 +101,7 @@
     osFamily = new OsFamily(config);
 
     StackManager stackManager = new StackManager(new File(stackRoot), null,
-        osFamily, true, metaInfoDao, actionMetadata, stackDao);
+        osFamily, false, metaInfoDao, actionMetadata, stackDao);
 
     verify(config, metaInfoDao, stackDao, actionMetadata);
 
@@ -667,7 +667,7 @@
     OsFamily osFamily = new OsFamily(config);
 
     StackManager stackManager = new StackManager(stackRoot, commonServices,
-            osFamily, true, metaInfoDao, actionMetadata, stackDao);
+            osFamily, false, metaInfoDao, actionMetadata, stackDao);
 
     for (StackInfo stackInfo : stackManager.getStacks()) {
       for (ServiceInfo serviceInfo : stackInfo.getServices()) {
@@ -710,7 +710,7 @@
 
     OsFamily osFamily = new OsFamily(config);
 
-    StackManager stackManager = new StackManager(stackRoot, commonServices, osFamily, true, metaInfoDao, actionMetadata, stackDao);
+    StackManager stackManager = new StackManager(stackRoot, commonServices, osFamily, false, metaInfoDao, actionMetadata, stackDao);
 
     String rangerUserSyncRoleCommand = Role.RANGER_USERSYNC + "-" + RoleCommand.START;
     String rangerAdminRoleCommand = Role.RANGER_ADMIN + "-" + RoleCommand.START;
@@ -817,7 +817,7 @@
 
     OsFamily osFamily = new OsFamily(config);
 
-    StackManager stackManager = new StackManager(stackRoot, commonServices, osFamily, true, metaInfoDao, actionMetadata, stackDao);
+    StackManager stackManager = new StackManager(stackRoot, commonServices, osFamily, false, metaInfoDao, actionMetadata, stackDao);
 
     String zookeeperServerRoleCommand = Role.ZOOKEEPER_SERVER + "-" + RoleCommand.START;
     String logsearchServerRoleCommand = Role.LOGSEARCH_SERVER + "-" + RoleCommand.START;
