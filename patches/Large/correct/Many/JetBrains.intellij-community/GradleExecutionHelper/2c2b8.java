diff --git a/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/GradleExecutionHelper.java b/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/GradleExecutionHelper.java
index b3198c7..190d737 100644
--- a/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/GradleExecutionHelper.java
+++ b/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/GradleExecutionHelper.java
@@ -201,7 +201,7 @@
       return f.fun(connection);
     }
     catch (Throwable e) {
-      LOG.warn("Gradle execution error", e);
+      LOG.debug("Gradle execution error", e);
       Throwable rootCause = ExceptionUtil.getRootCause(e);
       throw new ExternalSystemException(ExceptionUtil.getMessage(rootCause));
     }
