diff --git a/platform/platform-api/src/com/intellij/execution/util/ExecutableValidator.java b/platform/platform-api/src/com/intellij/execution/util/ExecutableValidator.java
index 24eb052..e0b0c15 100644
--- a/platform/platform-api/src/com/intellij/execution/util/ExecutableValidator.java
+++ b/platform/platform-api/src/com/intellij/execution/util/ExecutableValidator.java
@@ -109,7 +109,7 @@
       commandLine.setExePath(executable);
       CapturingProcessHandler handler = new CapturingProcessHandler(commandLine.createProcess(), CharsetToolkit.getDefaultSystemCharset());
       ProcessOutput result = handler.runProcess(60 * 1000);
-      return !result.isTimeout() && (result.getExitCode() != 0) && result.getStderr().isEmpty();
+      return !result.isTimeout() && (result.getExitCode() == 0) && result.getStderr().isEmpty();
     } catch (Throwable e) {
       return false;
     }
