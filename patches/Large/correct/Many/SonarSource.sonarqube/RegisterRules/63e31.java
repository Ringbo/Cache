diff --git a/server/sonar-server/src/main/java/org/sonar/server/rule/RegisterRules.java b/server/sonar-server/src/main/java/org/sonar/server/rule/RegisterRules.java
index 94f0781..8c6e6c5 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/rule/RegisterRules.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/rule/RegisterRules.java
@@ -342,7 +342,7 @@
     return changed;
   }
 
-  private boolean mergeTags(RulesDefinition.Rule ruleDef, RuleDto dto) {
+  private static boolean mergeTags(RulesDefinition.Rule ruleDef, RuleDto dto) {
     boolean changed = false;
 
     if (RuleStatus.REMOVED == ruleDef.status()) {
