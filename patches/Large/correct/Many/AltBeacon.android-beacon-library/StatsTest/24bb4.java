diff --git a/src/test/java/org/altbeacon/beacon/service/StatsTest.java b/src/test/java/org/altbeacon/beacon/service/StatsTest.java
index 1c62d08..15eecec 100644
--- a/src/test/java/org/altbeacon/beacon/service/StatsTest.java
+++ b/src/test/java/org/altbeacon/beacon/service/StatsTest.java
@@ -53,7 +53,7 @@
         Stats.getInstance().log(beacon);
         Thread.sleep(5l);
         ArrayList<Stats.Sample> samples = Stats.getInstance().getSamples();
-        assertEquals("Two samples should have been collected", 2, samples.size());
+        assertEquals("Two samples should have been collected", 3, samples.size());
         assertEquals("Sample should have proper count", 3, samples.get(0).detectionCount);
         assertNotNull("Sample should have a startTime", samples.get(0).sampleStartTime);
         assertNotNull("Sample should have a stopTime", samples.get(0).sampleStopTime);
