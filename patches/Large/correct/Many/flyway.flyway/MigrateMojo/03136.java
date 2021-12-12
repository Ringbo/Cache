diff --git a/flyway-maven-plugin/src/main/java/org/flywaydb/maven/MigrateMojo.java b/flyway-maven-plugin/src/main/java/org/flywaydb/maven/MigrateMojo.java
index 1530cd2..9e5bca2 100644
--- a/flyway-maven-plugin/src/main/java/org/flywaydb/maven/MigrateMojo.java
+++ b/flyway-maven-plugin/src/main/java/org/flywaydb/maven/MigrateMojo.java
@@ -30,7 +30,7 @@
         flyway.migrate();
 
         MigrationInfo current = flyway.info().current();
-        if (current != null) {
+        if (current != null && current.getVersion() != null) {
             mavenProject.getProperties().setProperty("flyway.current", current.getVersion().toString());
         }
     }
