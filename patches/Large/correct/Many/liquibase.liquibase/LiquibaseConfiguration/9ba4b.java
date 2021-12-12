diff --git a/liquibase-core/src/main/java/liquibase/configuration/LiquibaseConfiguration.java b/liquibase-core/src/main/java/liquibase/configuration/LiquibaseConfiguration.java
index ecaa2a5..7d8464a 100644
--- a/liquibase-core/src/main/java/liquibase/configuration/LiquibaseConfiguration.java
+++ b/liquibase-core/src/main/java/liquibase/configuration/LiquibaseConfiguration.java
@@ -28,7 +28,7 @@
     /**
      * Returns the singleton instance, creating it if necessary. On creation, the configuration is initialized with {@link liquibase.configuration.SystemPropertyProvider}
      */
-    public static LiquibaseConfiguration getInstance() {
+    public static synchronized LiquibaseConfiguration getInstance() {
         if (instance == null) {
             instance = new LiquibaseConfiguration();
             instance.init(new SystemPropertyProvider());
