diff --git a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/timemachine/ViolationTrackingDecorator.java b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/timemachine/ViolationTrackingDecorator.java
index ad06764..a01d02f 100644
--- a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/timemachine/ViolationTrackingDecorator.java
+++ b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/timemachine/ViolationTrackingDecorator.java
@@ -54,7 +54,7 @@
     referenceViolationsMap.clear();
 
     ViolationQuery violationQuery = ViolationQuery.create().forResource(resource).setSwitchMode(ViolationQuery.SwitchMode.BOTH);
-    if (!context.getViolations(violationQuery).isEmpty()) {
+    if (context.getViolations(violationQuery).isEmpty()) {
       return;
     }
 
