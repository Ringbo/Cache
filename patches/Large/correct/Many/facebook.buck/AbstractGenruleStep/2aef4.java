diff --git a/src/com/facebook/buck/shell/AbstractGenruleStep.java b/src/com/facebook/buck/shell/AbstractGenruleStep.java
index d35f47b..2d66a7b 100644
--- a/src/com/facebook/buck/shell/AbstractGenruleStep.java
+++ b/src/com/facebook/buck/shell/AbstractGenruleStep.java
@@ -103,7 +103,7 @@
   protected ImmutableList<String> getShellCommandInternal(ExecutionContext context) {
     // The priority sequence is
     //   "cmd.exe /c winCommand" (Windows Only)
-    //   "/bin/bash -c shCommand" (Non-windows Only)
+    //   "/bin/bash -e -c shCommand" (Non-windows Only)
     //   "(/bin/bash -c) or (cmd.exe /c) cmd" (All platforms)
     String command;
     if (context.getPlatform() == Platform.WINDOWS) {
@@ -129,7 +129,7 @@
             getFullyQualifiedName());
       }
       command = replaceMatches(context.getProjectFilesystem(), commandInUse);
-      return ImmutableList.of("/bin/bash", "-c", command);
+      return ImmutableList.of("/bin/bash", "-e", "-c", command);
     }
   }
 
