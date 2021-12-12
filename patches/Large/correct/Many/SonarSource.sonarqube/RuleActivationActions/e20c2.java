diff --git a/sonar-server/src/main/java/org/sonar/server/qualityprofile/ws/RuleActivationActions.java b/sonar-server/src/main/java/org/sonar/server/qualityprofile/ws/RuleActivationActions.java
index efa0e1b..f5488b2 100644
--- a/sonar-server/src/main/java/org/sonar/server/qualityprofile/ws/RuleActivationActions.java
+++ b/sonar-server/src/main/java/org/sonar/server/qualityprofile/ws/RuleActivationActions.java
@@ -109,7 +109,7 @@
       .setExampleValue("squid:AvoidCycles");
   }
 
-  private void activate(Request request, Response response) throws Exception {
+  private void activate(Request request, Response response) {
     RuleKey ruleKey = readRuleKey(request);
     RuleActivation activation = new RuleActivation(ruleKey);
     activation.setSeverity(request.param(SEVERITY));
@@ -121,7 +121,7 @@
     service.activate(request.mandatoryParam(PROFILE_KEY), activation);
   }
 
-  private void deactivate(Request request, Response response) throws Exception {
+  private void deactivate(Request request, Response response) {
     RuleKey ruleKey = readRuleKey(request);
     service.deactivate(ActiveRuleKey.of(request.mandatoryParam(PROFILE_KEY), ruleKey));
   }
