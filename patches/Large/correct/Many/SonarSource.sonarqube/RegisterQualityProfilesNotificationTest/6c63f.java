diff --git a/server/sonar-server/src/test/java/org/sonar/server/qualityprofile/RegisterQualityProfilesNotificationTest.java b/server/sonar-server/src/test/java/org/sonar/server/qualityprofile/RegisterQualityProfilesNotificationTest.java
index c55583f..2d59934 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/qualityprofile/RegisterQualityProfilesNotificationTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/qualityprofile/RegisterQualityProfilesNotificationTest.java
@@ -229,7 +229,7 @@
     OrganizationDto organization = db.organizations().insert();
 
     QProfileDto builtInProfile = insertProfile(organization, orgQProfile -> orgQProfile.setIsBuiltIn(true).setLanguage(language));
-    db.qualityProfiles().activateRule(builtInProfile, rule);
+    db.qualityProfiles().activateRule(builtInProfile, rule, ar -> ar.setSeverity(Severity.MINOR));
     QProfileDto childProfile = insertProfile(organization, orgQProfile -> orgQProfile.setIsBuiltIn(false).setLanguage(language).setParentKee(builtInProfile.getKee()));
     db.qualityProfiles().activateRule(childProfile, rule, ar -> ar.setInheritance(ActiveRuleDto.INHERITED).setSeverity(Severity.MINOR));
     addPluginProfile(builtInProfile, rule);
