diff --git a/test/unit/org/apache/cassandra/locator/DynamicEndpointSnitchTest.java b/test/unit/org/apache/cassandra/locator/DynamicEndpointSnitchTest.java
index 3ac9ecb..298f1c7 100644
--- a/test/unit/org/apache/cassandra/locator/DynamicEndpointSnitchTest.java
+++ b/test/unit/org/apache/cassandra/locator/DynamicEndpointSnitchTest.java
@@ -35,7 +35,7 @@
     public void testSnitch() throws InterruptedException, IOException, ConfigurationException
     {
         // do this because SS needs to be initialized before DES can work properly.
-        StorageService.instance.initClient();
+        StorageService.instance.initClient(0);
         int sleeptime = 150;
         SimpleSnitch ss = new SimpleSnitch();
         DynamicEndpointSnitch dsnitch = new DynamicEndpointSnitch(ss, String.valueOf(ss.hashCode()));
