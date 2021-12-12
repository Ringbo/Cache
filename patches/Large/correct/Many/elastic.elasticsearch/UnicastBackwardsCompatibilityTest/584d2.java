diff --git a/src/test/java/org/elasticsearch/bwcompat/UnicastBackwardsCompatibilityTest.java b/src/test/java/org/elasticsearch/bwcompat/UnicastBackwardsCompatibilityTest.java
index 985102e..ed01291 100644
--- a/src/test/java/org/elasticsearch/bwcompat/UnicastBackwardsCompatibilityTest.java
+++ b/src/test/java/org/elasticsearch/bwcompat/UnicastBackwardsCompatibilityTest.java
@@ -34,7 +34,7 @@
         return ImmutableSettings.builder()
                 .put("transport.tcp.port", 9380 + nodeOrdinal)
                 .put("discovery.zen.ping.multicast.enabled", false)
-                .put("discovery.zen.ping.unicast.hosts", "localhost:9390,localhost:9391")
+                .put("discovery.zen.ping.unicast.hosts", "localhost:9380,localhost:9381,localhost:9390,localhost:9391")
                 .put(super.nodeSettings(nodeOrdinal))
                 .build();
     }
@@ -44,13 +44,13 @@
         return ImmutableSettings.settingsBuilder()
                 .put("transport.tcp.port", 9390 + nodeOrdinal)
                 .put("discovery.zen.ping.multicast.enabled", false)
-                .put("discovery.zen.ping.unicast.hosts", "localhost:9380,localhost:9381")
+                .put("discovery.zen.ping.unicast.hosts", "localhost:9380,localhost:9381,localhost:9390,localhost:9391")
                 .put(super.nodeSettings(nodeOrdinal))
                 .build();
     }
 
     @Test
-    public void testUnicastDiscovery() throws Exception {
+    public void testUnicastDiscovery() {
         ClusterHealthResponse healthResponse = client().admin().cluster().prepareHealth().get();
         assertThat(healthResponse.getNumberOfDataNodes(), equalTo(cluster().numDataNodes()));
     }
