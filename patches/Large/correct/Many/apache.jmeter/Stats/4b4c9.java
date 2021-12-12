diff --git a/src/monitor/components/org/apache/jmeter/monitor/util/Stats.java b/src/monitor/components/org/apache/jmeter/monitor/util/Stats.java
index 88b6cdc..0637354 100644
--- a/src/monitor/components/org/apache/jmeter/monitor/util/Stats.java
+++ b/src/monitor/components/org/apache/jmeter/monitor/util/Stats.java
@@ -118,7 +118,7 @@
                 return WARNING;
             } else if (per >= ACTIVE_PER && per <= WARNING_PER) {
                 return ACTIVE;
-            } else if (per < ACTIVE_PER && per > HEALTHY_PER) {
+            } else if (per < ACTIVE_PER && per >= HEALTHY_PER) {
                 return HEALTHY;
             } else {
                 return DEAD;
