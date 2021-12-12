diff --git a/sonar-server/src/main/java/org/sonar/server/configuration/ProfilesBackup.java b/sonar-server/src/main/java/org/sonar/server/configuration/ProfilesBackup.java
index 143427d..4dcd6e1 100644
--- a/sonar-server/src/main/java/org/sonar/server/configuration/ProfilesBackup.java
+++ b/sonar-server/src/main/java/org/sonar/server/configuration/ProfilesBackup.java
@@ -113,7 +113,7 @@
   }
 
   private void importActiveRules(RulesDao rulesDao, RulesProfile profile) {
-    for (Iterator<ActiveRule> iar = profile.getActiveRules().iterator(); iar.hasNext();) {
+    for (Iterator<ActiveRule> iar = profile.getActiveRules(true).iterator(); iar.hasNext();) {
       ActiveRule activeRule = iar.next();
       Rule unMarshalledRule = activeRule.getRule();
       Rule matchingRuleInDb = rulesDao.getRuleByKey(unMarshalledRule.getRepositoryKey(), unMarshalledRule.getKey());
