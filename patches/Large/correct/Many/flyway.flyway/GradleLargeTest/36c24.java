diff --git a/flyway-gradle-plugin-largetest/src/test/java/org/flywaydb/gradle/largetest/GradleLargeTest.java b/flyway-gradle-plugin-largetest/src/test/java/org/flywaydb/gradle/largetest/GradleLargeTest.java
index 9402e35..06b0d4a 100644
--- a/flyway-gradle-plugin-largetest/src/test/java/org/flywaydb/gradle/largetest/GradleLargeTest.java
+++ b/flyway-gradle-plugin-largetest/src/test/java/org/flywaydb/gradle/largetest/GradleLargeTest.java
@@ -48,7 +48,7 @@
 
     @Test
     public void error() throws Exception {
-        String stdOut = runGradle(1, "error", "clean", "flywayMigrate");
+        String stdOut = runGradle(0, "error", "clean", "flywayMigrate");
         assertTrue(stdOut.contains("Unable to determine URL for classpath location"));
     }
 
