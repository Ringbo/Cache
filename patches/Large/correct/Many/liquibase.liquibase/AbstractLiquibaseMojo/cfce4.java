diff --git a/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/AbstractLiquibaseMojo.java b/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/AbstractLiquibaseMojo.java
index 045e85b..f139e84 100644
--- a/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/AbstractLiquibaseMojo.java
+++ b/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/AbstractLiquibaseMojo.java
@@ -273,7 +273,8 @@
                     dbPassword,
                     driver,
                     defaultSchemaName,
-                    databaseClass);
+                    databaseClass,
+                    null); // TODO: should we pass propertyFile here?
             liquibase = createLiquibase(getFileOpener(artifactClassLoader), database);
 
             getLog().debug("expressionVars = " + String.valueOf(expressionVars));
