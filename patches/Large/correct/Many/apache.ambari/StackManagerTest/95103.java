diff --git a/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerTest.java b/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerTest.java
index 2f2a5e5..0f39b06 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/stack/StackManagerTest.java
@@ -191,7 +191,7 @@
     Collection<ServiceInfo> services = stack.getServices();
 
     //should include all stacks in hierarchy
-    assertEquals(15, services.size());
+    assertEquals(16, services.size());
     HashSet<String> expectedServices = new HashSet<String>();
     expectedServices.add("GANGLIA");
     expectedServices.add("HBASE");
