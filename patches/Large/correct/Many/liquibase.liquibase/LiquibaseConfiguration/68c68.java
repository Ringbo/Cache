diff --git a/liquibase-core/src/main/java/liquibase/configuration/LiquibaseConfiguration.java b/liquibase-core/src/main/java/liquibase/configuration/LiquibaseConfiguration.java
index 647c776..517fb24 100644
--- a/liquibase-core/src/main/java/liquibase/configuration/LiquibaseConfiguration.java
+++ b/liquibase-core/src/main/java/liquibase/configuration/LiquibaseConfiguration.java
@@ -95,7 +95,7 @@
         try {
             Class typeClass = Class.forName(typeName);
             configurations.put(typeClass, createConfiguration(typeClass));
-            return configurations.get(typeName);
+            return configurations.get(typeClass);
         } catch (Exception e) {
             throw new UnexpectedLiquibaseException(e);
         }
