diff --git a/server/src/test/java/org/elasticsearch/nodesinfo/NodeInfoStreamingTests.java b/server/src/test/java/org/elasticsearch/nodesinfo/NodeInfoStreamingTests.java
index 107ac38..291a6b5 100644
--- a/server/src/test/java/org/elasticsearch/nodesinfo/NodeInfoStreamingTests.java
+++ b/server/src/test/java/org/elasticsearch/nodesinfo/NodeInfoStreamingTests.java
@@ -137,7 +137,7 @@
                 new TransportAddress[]{buildNewFakeTransportAddress()}, buildNewFakeTransportAddress());
         profileAddresses.put("test_address", dummyBoundTransportAddress);
         TransportInfo transport = randomBoolean() ? null : new TransportInfo(dummyBoundTransportAddress, profileAddresses);
-        HttpInfo httpInfo = randomBoolean() ? null : new HttpInfo(dummyBoundTransportAddress, randomLong());
+        HttpInfo httpInfo = randomBoolean() ? null : new HttpInfo(dummyBoundTransportAddress, randomNonNegativeLong());
 
         PluginsAndModules pluginsAndModules = null;
         if (randomBoolean()) {
