diff --git a/server/sonar-db-migration/src/test/java/org/sonar/server/platform/db/migration/version/v64/SupportPrivateProjectInDefaultPermissionTemplateTest.java b/server/sonar-db-migration/src/test/java/org/sonar/server/platform/db/migration/version/v64/SupportPrivateProjectInDefaultPermissionTemplateTest.java
index 639f8c3..daac2f0 100644
--- a/server/sonar-db-migration/src/test/java/org/sonar/server/platform/db/migration/version/v64/SupportPrivateProjectInDefaultPermissionTemplateTest.java
+++ b/server/sonar-db-migration/src/test/java/org/sonar/server/platform/db/migration/version/v64/SupportPrivateProjectInDefaultPermissionTemplateTest.java
@@ -251,7 +251,7 @@
   }
 
   private IdAndUuid insertPermissionTemplate(String organizationUuid) {
-    String random = RandomStringUtils.randomAscii(20);
+    String random = RandomStringUtils.randomAlphanumeric(20);
     String uuid = "ptUuid" + random;
     db.executeInsert(
       "PERMISSION_TEMPLATES",
