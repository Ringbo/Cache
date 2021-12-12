diff --git a/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerCommonServicesTest.java b/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerCommonServicesTest.java
index 182df79..969e07c 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerCommonServicesTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerCommonServicesTest.java
@@ -97,7 +97,7 @@
     replay(metaInfoDao, actionMetadata);
 
     StackManager stackManager = new StackManager(new File(stackRoot), new File(
-        commonServicesRoot), osFamily, true, metaInfoDao, actionMetadata, stackDao);
+        commonServicesRoot), osFamily, false, metaInfoDao, actionMetadata, stackDao);
 
     EasyMock.verify( config, stackDao );
 
