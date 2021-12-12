diff --git a/test/unit/org/apache/cassandra/service/InitClientTest.java b/test/unit/org/apache/cassandra/service/InitClientTest.java
index 23c4b1c..7d44cd8 100644
--- a/test/unit/org/apache/cassandra/service/InitClientTest.java
+++ b/test/unit/org/apache/cassandra/service/InitClientTest.java
@@ -30,6 +30,6 @@
     @Test
     public void testInitClientStartup() throws IOException, ConfigurationException
     {
-        StorageService.instance.initClient();
+        StorageService.instance.initClient(0);
     }
 }
