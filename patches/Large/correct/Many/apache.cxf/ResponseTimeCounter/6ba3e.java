diff --git a/rt/management/src/main/java/org/apache/cxf/management/counters/ResponseTimeCounter.java b/rt/management/src/main/java/org/apache/cxf/management/counters/ResponseTimeCounter.java
index 4d051cf..ee35a34 100644
--- a/rt/management/src/main/java/org/apache/cxf/management/counters/ResponseTimeCounter.java
+++ b/rt/management/src/main/java/org/apache/cxf/management/counters/ResponseTimeCounter.java
@@ -84,7 +84,7 @@
         if (maxHandlingTime < handlingTime) {
             maxHandlingTime = handlingTime;
         }
-        if (minHandlingTime == 0 | minHandlingTime > handlingTime) {
+        if (minHandlingTime == 0 || minHandlingTime > handlingTime) {
             minHandlingTime = handlingTime;
         }
     }
