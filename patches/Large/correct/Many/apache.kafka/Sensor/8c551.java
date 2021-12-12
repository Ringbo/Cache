diff --git a/clients/src/main/java/org/apache/kafka/common/metrics/Sensor.java b/clients/src/main/java/org/apache/kafka/common/metrics/Sensor.java
index 098bfa8..3e500d5 100644
--- a/clients/src/main/java/org/apache/kafka/common/metrics/Sensor.java
+++ b/clients/src/main/java/org/apache/kafka/common/metrics/Sensor.java
@@ -121,10 +121,10 @@
                     double value = metric.value(timeMs);
                     if (!quota.acceptable(value)) {
                         throw new QuotaViolationException(String.format(
-                            "(%s) violated quota. Actual: (%f), Threshold: (%f)",
+                            "'%s' violated quota. Actual: %f, Threshold: %f",
                             metric.metricName(),
-                            quota.bound(),
-                            value));
+                            value,
+                            quota.bound()));
                     }
                 }
             }
