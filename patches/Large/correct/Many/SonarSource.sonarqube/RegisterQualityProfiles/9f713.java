diff --git a/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/RegisterQualityProfiles.java b/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/RegisterQualityProfiles.java
index 3d24807..df17778 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/RegisterQualityProfiles.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/RegisterQualityProfiles.java
@@ -240,7 +240,7 @@
   }
 
   private void registerPerQualityProfile(DbSession session, QualityProfile qualityProfile, List<ActiveRuleChange> changes) {
-    LOGGER.debug("Register profile {}", qualityProfile.getQProfileName());
+    LOGGER.info("Register profile {}", qualityProfile.getQProfileName());
 
     List<OrganizationDto> organizationDtos;
     while (!(organizationDtos = getOrganizationsWithoutQP(session, qualityProfile)).isEmpty()) {
@@ -254,7 +254,7 @@
   }
 
   private void registerPerQualityProfileAndOrganization(DbSession session, QualityProfile qualityProfile, OrganizationDto organization, List<ActiveRuleChange> changes) {
-    LOGGER.info("Register profile {} for organization {}", qualityProfile.getQProfileName(), organization.getKey());
+    LOGGER.debug("Register profile {} for organization {}", qualityProfile.getQProfileName(), organization.getKey());
 
     QualityProfileDto profileDto = dbClient.qualityProfileDao().selectByNameAndLanguage(organization, qualityProfile.getName(), qualityProfile.getLanguage(), session);
     if (profileDto != null) {
