diff --git a/sonar-server/src/main/java/org/sonar/server/qualityprofile/ws/BulkRuleActivationActions.java b/sonar-server/src/main/java/org/sonar/server/qualityprofile/ws/BulkRuleActivationActions.java
index 2a9fe39..89a5959 100644
--- a/sonar-server/src/main/java/org/sonar/server/qualityprofile/ws/BulkRuleActivationActions.java
+++ b/sonar-server/src/main/java/org/sonar/server/qualityprofile/ws/BulkRuleActivationActions.java
@@ -101,7 +101,7 @@
       .setExampleValue("java:MyProfile");
   }
 
-  private void bulkActivate(Request request, Response response) throws Exception {
+  private void bulkActivate(Request request, Response response) {
     BulkChangeResult result = profileService.bulkActivate(
       SearchAction.createRuleQuery(ruleService.newRuleQuery(), request),
       request.mandatoryParam(PROFILE_KEY),
@@ -109,7 +109,7 @@
     writeResponse(result, response);
   }
 
-  private void bulkDeactivate(Request request, Response response) throws Exception {
+  private void bulkDeactivate(Request request, Response response) {
     BulkChangeResult result = profileService.bulkDeactivate(
       SearchAction.createRuleQuery(ruleService.newRuleQuery(), request),
       request.mandatoryParam(PROFILE_KEY));
