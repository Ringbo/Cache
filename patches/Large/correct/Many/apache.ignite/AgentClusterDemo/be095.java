diff --git a/modules/web-console/web-agent/src/main/java/org/apache/ignite/console/demo/AgentClusterDemo.java b/modules/web-console/web-agent/src/main/java/org/apache/ignite/console/demo/AgentClusterDemo.java
index 80c8c0c..cf7ae55 100644
--- a/modules/web-console/web-agent/src/main/java/org/apache/ignite/console/demo/AgentClusterDemo.java
+++ b/modules/web-console/web-agent/src/main/java/org/apache/ignite/console/demo/AgentClusterDemo.java
@@ -177,7 +177,7 @@
                     int port = basePort.get();
 
                     try {
-                        IgniteEx ignite = (IgniteEx)Ignition.start(igniteConfiguration(port, idx, idx == NODE_CNT));
+                        IgniteEx ignite = (IgniteEx)Ignition.start(igniteConfiguration(port, idx, false));
 
                         if (idx == 0) {
                             Collection<String> jettyAddrs = ignite.localNode().attribute(ATTR_REST_JETTY_ADDRS);
@@ -201,7 +201,7 @@
 
                             initLatch.countDown();
 
-                            deployServices(ignite.services());
+                            deployServices(ignite.services(ignite.cluster().forServers()));
                         }
                     }
                     catch (Throwable e) {
