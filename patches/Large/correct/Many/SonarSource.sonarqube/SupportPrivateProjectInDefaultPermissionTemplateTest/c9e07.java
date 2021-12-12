diff --git a/server/sonar-db-migration/src/test/java/org/sonar/server/platform/db/migration/version/v64/SupportPrivateProjectInDefaultPermissionTemplateTest.java b/server/sonar-db-migration/src/test/java/org/sonar/server/platform/db/migration/version/v64/SupportPrivateProjectInDefaultPermissionTemplateTest.java
index 24fd17e..639f8c3 100644
--- a/server/sonar-db-migration/src/test/java/org/sonar/server/platform/db/migration/version/v64/SupportPrivateProjectInDefaultPermissionTemplateTest.java
+++ b/server/sonar-db-migration/src/test/java/org/sonar/server/platform/db/migration/version/v64/SupportPrivateProjectInDefaultPermissionTemplateTest.java
@@ -251,7 +251,7 @@
   }
 
   private IdAndUuid insertPermissionTemplate(String organizationUuid) {
-    String random = RandomStringUtils.random(20);
+    String random = RandomStringUtils.randomAscii(20);
     String uuid = "ptUuid" + random;
     db.executeInsert(
       "PERMISSION_TEMPLATES",
