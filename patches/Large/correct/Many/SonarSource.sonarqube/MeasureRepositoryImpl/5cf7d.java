diff --git a/server/sonar-server/src/main/java/org/sonar/server/computation/measure/MeasureRepositoryImpl.java b/server/sonar-server/src/main/java/org/sonar/server/computation/measure/MeasureRepositoryImpl.java
index ed9f648..8e7dd40 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/computation/measure/MeasureRepositoryImpl.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/computation/measure/MeasureRepositoryImpl.java
@@ -59,6 +59,6 @@
             return input.getMetricKey().equals(metric.getKey());
           }
         }
-    ));
+      , null));
   }
 }
