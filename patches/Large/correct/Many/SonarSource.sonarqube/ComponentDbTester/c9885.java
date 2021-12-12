diff --git a/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDbTester.java b/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDbTester.java
index f806b5f..e3091f0 100644
--- a/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDbTester.java
+++ b/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDbTester.java
@@ -71,11 +71,13 @@
     return insertComponentImpl(newProjectDto(db.getDefaultOrganization()), noExtraConfiguration());
   }
 
-  public ComponentDto insertProject(Consumer<ComponentDto>... dtoPopulators) {
+  @SafeVarargs
+  public final ComponentDto insertProject(Consumer<ComponentDto>... dtoPopulators) {
     return insertComponentImpl(newProjectDto(db.getDefaultOrganization()), dtoPopulators);
   }
 
-  public ComponentDto insertProject(OrganizationDto organizationDto, Consumer<ComponentDto>... dtoPopulators) {
+  @SafeVarargs
+  public final ComponentDto insertProject(OrganizationDto organizationDto, Consumer<ComponentDto>... dtoPopulators) {
     return insertComponentImpl(newProjectDto(organizationDto), dtoPopulators);
   }
 
@@ -128,7 +130,8 @@
     };
   }
 
-  private ComponentDto insertComponentImpl(ComponentDto component, Consumer<ComponentDto>... dtoPopulators) {
+  @SafeVarargs
+  private final ComponentDto insertComponentImpl(ComponentDto component, Consumer<ComponentDto>... dtoPopulators) {
     Arrays.stream(dtoPopulators)
       .forEach(dtoPopulator -> dtoPopulator.accept(component));
     dbClient.componentDao().insert(dbSession, component);
