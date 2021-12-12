diff --git a/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDbTester.java b/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDbTester.java
index cf985e4..69997d7 100644
--- a/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDbTester.java
+++ b/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDbTester.java
@@ -90,7 +90,7 @@
 
   @SafeVarargs
   public final ComponentDto insertPublicProject(OrganizationDto organizationDto, Consumer<ComponentDto>... dtoPopulators) {
-    return insertComponentImpl(newPublicProjectDto(organizationDto), true, dtoPopulators);
+    return insertComponentImpl(newPublicProjectDto(organizationDto), false, dtoPopulators);
   }
 
   public ComponentDto insertPrivateProject(OrganizationDto organizationDto) {
