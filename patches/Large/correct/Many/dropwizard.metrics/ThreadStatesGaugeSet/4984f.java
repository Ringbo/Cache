diff --git a/metrics-jvm/src/main/java/com/codahale/metrics/jvm/ThreadStatesGaugeSet.java b/metrics-jvm/src/main/java/com/codahale/metrics/jvm/ThreadStatesGaugeSet.java
index a79d6bc..a28515a 100644
--- a/metrics-jvm/src/main/java/com/codahale/metrics/jvm/ThreadStatesGaugeSet.java
+++ b/metrics-jvm/src/main/java/com/codahale/metrics/jvm/ThreadStatesGaugeSet.java
@@ -50,9 +50,9 @@
 
         for (final Thread.State state : Thread.State.values()) {
             gauges.put(name(state.toString().toLowerCase(), "count"),
-                       new Gauge<Object>() {
+                       new Gauge<Integer>() {
                            @Override
-                           public Object getValue() {
+                           public Integer getValue() {
                                return getThreadCount(state);
                            }
                        });
