diff --git a/clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractCoordinator.java b/clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractCoordinator.java
index 6eea045..2fdf802 100644
--- a/clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractCoordinator.java
+++ b/clients/src/main/java/org/apache/kafka/clients/consumer/internals/AbstractCoordinator.java
@@ -794,7 +794,7 @@
                     "The average time taken for a group rejoin"), new Avg());
             this.joinLatency.add(metrics.metricName("join-time-max",
                     this.metricGrpName,
-                    "The max time taken for a group rejoin"), new Avg());
+                    "The max time taken for a group rejoin"), new Max());
             this.joinLatency.add(metrics.metricName("join-rate",
                     this.metricGrpName,
                     "The number of group joins per second"), new Rate(new Count()));
@@ -805,7 +805,7 @@
                     "The average time taken for a group sync"), new Avg());
             this.syncLatency.add(metrics.metricName("sync-time-max",
                     this.metricGrpName,
-                    "The max time taken for a group sync"), new Avg());
+                    "The max time taken for a group sync"), new Max());
             this.syncLatency.add(metrics.metricName("sync-rate",
                     this.metricGrpName,
                     "The number of group syncs per second"), new Rate(new Count()));
