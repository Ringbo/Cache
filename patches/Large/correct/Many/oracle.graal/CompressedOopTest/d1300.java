diff --git a/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/test/CompressedOopTest.java b/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/test/CompressedOopTest.java
index b1dfc7c..fa996a1 100644
--- a/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/test/CompressedOopTest.java
+++ b/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/test/CompressedOopTest.java
@@ -200,7 +200,7 @@
         while (j < objects.length) {
             if (!installedBenchmarkCode.isValid()) {
                 // This can get invalidated due to lack of MDO update
-                installedBenchmarkCode = getInstalledCode("queueTest");
+                installedBenchmarkCode = getInstalledCode("queueTest", Object.class, Object.class);
             }
             installedBenchmarkCode.executeVarargs(q, objects[j]);
             j++;
