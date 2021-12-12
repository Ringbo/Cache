diff --git a/flyway-gradle-plugin/src/main/java/org/flywaydb/gradle/task/AbstractFlywayTask.java b/flyway-gradle-plugin/src/main/java/org/flywaydb/gradle/task/AbstractFlywayTask.java
index 026d17d..61d5864 100644
--- a/flyway-gradle-plugin/src/main/java/org/flywaydb/gradle/task/AbstractFlywayTask.java
+++ b/flyway-gradle-plugin/src/main/java/org/flywaydb/gradle/task/AbstractFlywayTask.java
@@ -464,9 +464,9 @@
                     extraURLs.toArray(new URL[0]),
                     getProject().getBuildscript().getClassLoader());
 
-            Flyway flyway = Flyway.configure(classLoader).configure(createFlywayConfig(envVars)).load();
+            Flyway flyway = Flyway.configure(classLoader).configuration(createFlywayConfig(envVars)).load();
             Object result = run(flyway);
-            ((DriverDataSource) flyway.getDataSource()).shutdownDatabase();
+            ((DriverDataSource) flyway.getConfiguration().getDataSource()).shutdownDatabase();
             return result;
         } catch (Exception e) {
             throw new FlywayException(collectMessages(e, "Error occurred while executing " + getName()), e);
