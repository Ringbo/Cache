diff --git a/server/sonar-server/src/test/java/org/sonar/server/db/migrations/MigrationStepModuleTest.java b/server/sonar-server/src/test/java/org/sonar/server/db/migrations/MigrationStepModuleTest.java
index abc50e7..107509d 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/db/migrations/MigrationStepModuleTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/db/migrations/MigrationStepModuleTest.java
@@ -26,7 +26,7 @@
 
 public class MigrationStepModuleTest {
   @Test
-  public void verify_count_of_added_MigrationStep_types() throws Exception {
+  public void verify_count_of_added_MigrationStep_types() {
     ComponentContainer container = new ComponentContainer();
     new MigrationStepModule().configure(container);
     assertThat(container.size()).isEqualTo(55);
