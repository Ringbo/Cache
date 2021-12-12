diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/MetricsSystemImpl.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/MetricsSystemImpl.java
index a94d814..a1d258d 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/MetricsSystemImpl.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/metrics2/impl/MetricsSystemImpl.java
@@ -367,7 +367,7 @@
             try {
               onTimerEvent();
             } catch (Exception e) {
-              LOG.warn(e);
+              LOG.warn("Error invoking metrics timer", e);
             }
           }
         }, millis, millis);
