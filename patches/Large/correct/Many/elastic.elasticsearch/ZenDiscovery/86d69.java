diff --git a/src/main/java/org/elasticsearch/discovery/zen/ZenDiscovery.java b/src/main/java/org/elasticsearch/discovery/zen/ZenDiscovery.java
index 3bef69e..cef1915 100644
--- a/src/main/java/org/elasticsearch/discovery/zen/ZenDiscovery.java
+++ b/src/main/java/org/elasticsearch/discovery/zen/ZenDiscovery.java
@@ -893,7 +893,7 @@
     private final String getNodeUUID(Settings settings) {
         String seed = settings.get("discovery.id.seed");
         if (seed != null) {
-            logger.warn("using stable discover node UUIDs with seed: [{}]", seed);
+            logger.trace("using stable discover node UUIDs with seed: [{}]", seed);
             Strings.randomBase64UUID(new Random(Long.parseLong(seed)));
         }
         return Strings.randomBase64UUID();
