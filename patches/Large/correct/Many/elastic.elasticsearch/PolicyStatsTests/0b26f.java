diff --git a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/PolicyStatsTests.java b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/PolicyStatsTests.java
index 0a9ac85..590e3d6 100644
--- a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/PolicyStatsTests.java
+++ b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/PolicyStatsTests.java
@@ -38,10 +38,10 @@
         switch (between(0, 1)) {
         case 0:
             phaseStats = new HashMap<>(instance.getPhaseStats());
-            phaseStats.put(randomAlphaOfLengthBetween(1, 20), PhaseStatsTests.createRandomInstance());
+            phaseStats.put(randomAlphaOfLengthBetween(21, 25), PhaseStatsTests.createRandomInstance());
             break;
         case 1:
-            indicesManaged = randomIntBetween(1, 50);
+            indicesManaged = randomIntBetween(11, 50);
             break;
         default:
             throw new AssertionError("Illegal randomisation branch");
