diff --git a/shield/src/test/java/org/elasticsearch/shield/transport/ServerTransportFilterIntegrationTests.java b/shield/src/test/java/org/elasticsearch/shield/transport/ServerTransportFilterIntegrationTests.java
index 8e48980..f528f83 100644
--- a/shield/src/test/java/org/elasticsearch/shield/transport/ServerTransportFilterIntegrationTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/transport/ServerTransportFilterIntegrationTests.java
@@ -106,7 +106,7 @@
                 .put(InternalCryptoService.FILE_SETTING, systemKeyFile)
                 .put("node.client", true)
                 .build();
-        try (Node node = new MockNode(nodeSettings, true, Version.CURRENT, Arrays.asList(ShieldPlugin.class, licensePluginClass()))) {
+        try (Node node = new MockNode(nodeSettings, Version.CURRENT, Arrays.asList(ShieldPlugin.class, licensePluginClass()))) {
             node.start();
             assertGreenClusterState(node.client());
         }
