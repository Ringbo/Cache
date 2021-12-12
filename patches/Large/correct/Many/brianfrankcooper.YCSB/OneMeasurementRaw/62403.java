diff --git a/core/src/main/java/com/yahoo/ycsb/measurements/OneMeasurementRaw.java b/core/src/main/java/com/yahoo/ycsb/measurements/OneMeasurementRaw.java
index 132952d..15c3f18 100644
--- a/core/src/main/java/com/yahoo/ycsb/measurements/OneMeasurementRaw.java
+++ b/core/src/main/java/com/yahoo/ycsb/measurements/OneMeasurementRaw.java
@@ -189,7 +189,7 @@
           measurements.get((int)(totalOps*0.9999)).value());
     }
 
-    exportReturnCodes(exporter);
+    exportStatusCounts(exporter);
   }
 
   @Override
