diff --git a/sonar-plugin-api/src/test/java/org/sonar/api/utils/command/CommandExecutorTest.java b/sonar-plugin-api/src/test/java/org/sonar/api/utils/command/CommandExecutorTest.java
index 391573f..b3f15c2 100644
--- a/sonar-plugin-api/src/test/java/org/sonar/api/utils/command/CommandExecutorTest.java
+++ b/sonar-plugin-api/src/test/java/org/sonar/api/utils/command/CommandExecutorTest.java
@@ -117,7 +117,7 @@
     File logFile = new File(workDir, "echo.log");
     assertThat(logFile).exists();
     String log = FileUtils.readFileToString(logFile);
-    assertThat(log).contains(workDir.getCanonicalPath());
+    assertThat(log).contains(workDir.getAbsolutePath());
     assertThat(log).contains("Parameter: 1");
     assertThat(log).contains("Environment variable: 2");
   }
