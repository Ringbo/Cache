diff --git a/test/unit/voldemort/store/stats/StatsTest.java b/test/unit/voldemort/store/stats/StatsTest.java
index 1971d08..b444264 100644
--- a/test/unit/voldemort/store/stats/StatsTest.java
+++ b/test/unit/voldemort/store/stats/StatsTest.java
@@ -125,7 +125,7 @@
         Time mockTime = mock(Time.class);
 
         when(mockTime.getMilliseconds()).thenReturn(startTime);
-        RequestCounter rc = new RequestCounter(resetDurationMs, mockTime);
+        RequestCounter rc = new RequestCounter("tests.StatsTest.statsShowSpuriousValues", resetDurationMs, mockTime);
 
         // Add some new stats and verify they were calculated correctly
         rc.addRequest(100 * NS_PER_MS, 0, 1000, 100, 1);
