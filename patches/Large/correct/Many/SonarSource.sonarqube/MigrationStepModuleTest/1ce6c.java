diff --git a/sonar-db/src/test/java/org/sonar/db/version/MigrationStepModuleTest.java b/sonar-db/src/test/java/org/sonar/db/version/MigrationStepModuleTest.java
index 933def5..bbb1432 100644
--- a/sonar-db/src/test/java/org/sonar/db/version/MigrationStepModuleTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/version/MigrationStepModuleTest.java
@@ -29,6 +29,6 @@
   public void verify_count_of_added_MigrationStep_types() {
     ComponentContainer container = new ComponentContainer();
     new MigrationStepModule().configure(container);
-    assertThat(container.size()).isEqualTo(39);
+    assertThat(container.size()).isEqualTo(40);
   }
 }
