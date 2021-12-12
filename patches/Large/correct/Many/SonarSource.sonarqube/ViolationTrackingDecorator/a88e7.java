diff --git a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/timemachine/ViolationTrackingDecorator.java b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/timemachine/ViolationTrackingDecorator.java
index 9cd1e10..430e707 100644
--- a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/timemachine/ViolationTrackingDecorator.java
+++ b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/timemachine/ViolationTrackingDecorator.java
@@ -280,7 +280,7 @@
   private Multimap<Integer, RuleFailureModel> lastViolationsByLines(Collection<RuleFailureModel> lastViolations, ViolationTrackingBlocksRecognizer rec) {
     Multimap<Integer, RuleFailureModel> lastViolationsByLines = LinkedHashMultimap.create();
     for (RuleFailureModel pastViolation : lastViolations) {
-      if (rec.isValidLineInSource(pastViolation.getLine())) {
+      if (rec.isValidLineInReference(pastViolation.getLine())) {
         lastViolationsByLines.put(pastViolation.getLine(), pastViolation);
       }
     }
