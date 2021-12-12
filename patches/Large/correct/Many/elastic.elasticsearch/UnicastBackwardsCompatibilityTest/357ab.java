diff --git a/src/test/java/org/elasticsearch/bwcompat/UnicastBackwardsCompatibilityTest.java b/src/test/java/org/elasticsearch/bwcompat/UnicastBackwardsCompatibilityTest.java
index ed01291..75a40bd 100644
--- a/src/test/java/org/elasticsearch/bwcompat/UnicastBackwardsCompatibilityTest.java
+++ b/src/test/java/org/elasticsearch/bwcompat/UnicastBackwardsCompatibilityTest.java
@@ -45,7 +45,7 @@
                 .put("transport.tcp.port", 9390 + nodeOrdinal)
                 .put("discovery.zen.ping.multicast.enabled", false)
                 .put("discovery.zen.ping.unicast.hosts", "localhost:9380,localhost:9381,localhost:9390,localhost:9391")
-                .put(super.nodeSettings(nodeOrdinal))
+                .put(super.externalNodeSettings(nodeOrdinal))
                 .build();
     }
 
