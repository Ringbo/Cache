diff --git a/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerMiscTest.java b/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerMiscTest.java
index b1f7cd1..55a3c46 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerMiscTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerMiscTest.java
@@ -62,7 +62,7 @@
       String stacksCycle1 = ClassLoader.getSystemClassLoader().getResource("stacks_with_cycle").getPath();
 
       StackManager stackManager = new StackManager(new File(stacksCycle1),
-          null, osFamily, true, metaInfoDao, actionMetadata, stackDao);
+          null, osFamily, false, metaInfoDao, actionMetadata, stackDao);
 
       fail("Expected exception due to cyclic stack");
     } catch (AmbariException e) {
@@ -108,7 +108,7 @@
 
     StackManager stackManager = new StackManager(new File(singleStack.replace(
         StackManager.PATH_DELIMITER, File.separator)),
-        null, osFamily, true, metaInfoDao, actionMetadata, stackDao);
+        null, osFamily, false, metaInfoDao, actionMetadata, stackDao);
 
 
     Collection<StackInfo> stacks = stackManager.getStacks();
@@ -140,7 +140,7 @@
       String upgradeCycle = ClassLoader.getSystemClassLoader().getResource("stacks_with_upgrade_cycle").getPath();
 
       StackManager stackManager = new StackManager(new File(upgradeCycle),
-          null, osFamily, true, metaInfoDao, actionMetadata, stackDao);
+          null, osFamily, false, metaInfoDao, actionMetadata, stackDao);
 
       fail("Expected exception due to cyclic service upgrade xml");
     } catch (AmbariException e) {
