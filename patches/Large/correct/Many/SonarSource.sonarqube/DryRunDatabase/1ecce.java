diff --git a/sonar-batch/src/main/java/org/sonar/batch/local/DryRunDatabase.java b/sonar-batch/src/main/java/org/sonar/batch/local/DryRunDatabase.java
index 8a5bf92..c2f6970 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/local/DryRunDatabase.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/local/DryRunDatabase.java
@@ -86,9 +86,9 @@
     } catch (SonarException e) {
       Throwable rootCause = Throwables.getRootCause(e);
       if (rootCause instanceof FileNotFoundException) {
-        throw new SonarException(String.format("Project [%s] doesn't exist on server", projectKey));
+        throw new SonarException(String.format("Project [%s] doesn't exist on server", projectKey), e);
       } else if ((rootCause instanceof IOException) && (StringUtils.contains(rootCause.getMessage(), "401"))) {
-        throw new SonarException(String.format("You don't have access rights to project [%s]", projectKey));
+        throw new SonarException(String.format("You don't have access rights to project [%s]", projectKey), e);
       }
       throw e;
     }
