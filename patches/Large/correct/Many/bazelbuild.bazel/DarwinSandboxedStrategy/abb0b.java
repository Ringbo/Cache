diff --git a/src/main/java/com/google/devtools/build/lib/sandbox/DarwinSandboxedStrategy.java b/src/main/java/com/google/devtools/build/lib/sandbox/DarwinSandboxedStrategy.java
index bb4a82f..5a76c65 100644
--- a/src/main/java/com/google/devtools/build/lib/sandbox/DarwinSandboxedStrategy.java
+++ b/src/main/java/com/google/devtools/build/lib/sandbox/DarwinSandboxedStrategy.java
@@ -226,7 +226,7 @@
           executor
               .getEventHandler()
               .handle(
-                  Event.error(
+                  Event.warn(
                       String.format(
                           "Cannot delete sandbox directory after action execution: %s (%s)",
                           sandboxPath.getPathString(), e)));
