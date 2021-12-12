diff --git a/sdks/java/nexmark/src/main/java/org/apache/beam/sdk/nexmark/NexmarkSuite.java b/sdks/java/nexmark/src/main/java/org/apache/beam/sdk/nexmark/NexmarkSuite.java
index 7a6d08a..48423dc 100644
--- a/sdks/java/nexmark/src/main/java/org/apache/beam/sdk/nexmark/NexmarkSuite.java
+++ b/sdks/java/nexmark/src/main/java/org/apache/beam/sdk/nexmark/NexmarkSuite.java
@@ -69,7 +69,7 @@
     List<NexmarkConfiguration> configurations = smoke();
     for (NexmarkConfiguration configuration : configurations) {
       if (configuration.numEvents >= 0) {
-        configuration.numEvents *= 1000;
+        configuration.numEvents *= 100;
       }
     }
     return configurations;
@@ -79,7 +79,7 @@
     List<NexmarkConfiguration> configurations = smoke();
     for (NexmarkConfiguration configuration : configurations) {
       if (configuration.numEvents >= 0) {
-        configuration.numEvents *= 1000;
+        configuration.numEvents *= 10000;
       }
     }
     return configurations;
