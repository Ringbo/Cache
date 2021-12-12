diff --git a/server/sonar-server/src/main/java/org/sonar/server/qualitygate/QualityGates.java b/server/sonar-server/src/main/java/org/sonar/server/qualitygate/QualityGates.java
index 764452c..9925fb6 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/qualitygate/QualityGates.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/qualitygate/QualityGates.java
@@ -277,7 +277,7 @@
     return from(conditionDao.selectForQualityGate(qGateId)).filter(new MatchConditionId(conditionId)).toList();
   }
 
-  private void validateCondition(Metric metric, String operator, @Nullable String warningThreshold, @Nullable String errorThreshold, @Nullable Integer period) {
+  private static void validateCondition(Metric metric, String operator, @Nullable String warningThreshold, @Nullable String errorThreshold, @Nullable Integer period) {
     Errors errors = new Errors();
     validateMetric(metric, errors);
     checkOperator(metric, operator, errors);
