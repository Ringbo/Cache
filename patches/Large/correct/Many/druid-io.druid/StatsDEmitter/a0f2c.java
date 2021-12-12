diff --git a/extensions-contrib/statsd-emitter/src/main/java/io/druid/emitter/statsd/StatsDEmitter.java b/extensions-contrib/statsd-emitter/src/main/java/io/druid/emitter/statsd/StatsDEmitter.java
index 416f28f..d1b3200 100644
--- a/extensions-contrib/statsd-emitter/src/main/java/io/druid/emitter/statsd/StatsDEmitter.java
+++ b/extensions-contrib/statsd-emitter/src/main/java/io/druid/emitter/statsd/StatsDEmitter.java
@@ -120,7 +120,7 @@
             break;
         }
       } else {
-        log.error("Metric=[%s] has no StatsD type mapping", statsDMetric);
+        log.debug("Metric=[%s] has no StatsD type mapping", statsDMetric);
       }
     }
   }
