diff --git a/plugin/rollup/src/test/java/org/elasticsearch/xpack/rollup/job/RollupJobTaskTests.java b/plugin/rollup/src/test/java/org/elasticsearch/xpack/rollup/job/RollupJobTaskTests.java
index 633f7d1..1ca5dd7 100644
--- a/plugin/rollup/src/test/java/org/elasticsearch/xpack/rollup/job/RollupJobTaskTests.java
+++ b/plugin/rollup/src/test/java/org/elasticsearch/xpack/rollup/job/RollupJobTaskTests.java
@@ -590,7 +590,7 @@
             @Override
             public void onResponse(StopRollupJobAction.Response response) {
                 assertTrue(response.isStopped());
-                latch.countDown();
+                latch2.countDown();
             }
 
             @Override
