diff --git a/sonar-server/src/main/java/org/sonar/server/rules/DeprecatedProfiles.java b/sonar-server/src/main/java/org/sonar/server/rules/DeprecatedProfiles.java
index 40ed187..7d61dc8 100644
--- a/sonar-server/src/main/java/org/sonar/server/rules/DeprecatedProfiles.java
+++ b/sonar-server/src/main/java/org/sonar/server/rules/DeprecatedProfiles.java
@@ -103,7 +103,7 @@
     for (int index = 0; index < repository.getProvidedProfiles().size(); index++) {
       RulesProfile deprecated = (RulesProfile) repository.getProvidedProfiles().get(index);
       DefaultProfileDefinition providedProfile = DefaultProfileDefinition.create(deprecated.getName(), repository.getLanguage().getKey());
-      for (ActiveRule deprecatedActiveRule : deprecated.getActiveRules()) {
+      for (ActiveRule deprecatedActiveRule : deprecated.getActiveRules(true)) {
         String repositoryKey = deprecatedActiveRule.getRepositoryKey();
         if (StringUtils.isBlank(repositoryKey)) {
           repositoryKey = getPluginKey(repository);
@@ -161,7 +161,7 @@
     }
 
     public List<ActiveRule> getRules() {
-      return profile.getActiveRules();
+      return profile.getActiveRules(true);
     }
 
     public List<ActiveRule> getRulesByRepositoryKey(String repositoryKey) {
