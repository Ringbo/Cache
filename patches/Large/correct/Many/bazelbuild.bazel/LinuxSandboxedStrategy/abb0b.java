diff --git a/src/main/java/com/google/devtools/build/lib/sandbox/LinuxSandboxedStrategy.java b/src/main/java/com/google/devtools/build/lib/sandbox/LinuxSandboxedStrategy.java
index 0e141e9..b4ed542 100644
--- a/src/main/java/com/google/devtools/build/lib/sandbox/LinuxSandboxedStrategy.java
+++ b/src/main/java/com/google/devtools/build/lib/sandbox/LinuxSandboxedStrategy.java
@@ -139,7 +139,7 @@
           executor
               .getEventHandler()
               .handle(
-                  Event.error(
+                  Event.warn(
                       String.format(
                           "Cannot delete sandbox directory after action execution: %s (%s)",
                           sandboxPath.getPathString(), e)));
