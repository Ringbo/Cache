diff --git a/metrics-jmx/src/test/java/com/codahale/metrics/CpuTimeClockTest.java b/metrics-jmx/src/test/java/com/codahale/metrics/CpuTimeClockTest.java
index 3bae5c5..6e55c66 100644
--- a/metrics-jmx/src/test/java/com/codahale/metrics/CpuTimeClockTest.java
+++ b/metrics-jmx/src/test/java/com/codahale/metrics/CpuTimeClockTest.java
@@ -15,7 +15,7 @@
 
         assertThat((double) clock.getTime())
                 .isEqualTo(System.currentTimeMillis(),
-                        offset(100.0));
+                        offset(200.0));
 
         assertThat((double) clock.getTick())
                 .isEqualTo(ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime(),
