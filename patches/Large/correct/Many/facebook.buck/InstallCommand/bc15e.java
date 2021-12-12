diff --git a/src/com/facebook/buck/cli/InstallCommand.java b/src/com/facebook/buck/cli/InstallCommand.java
index 6c0b585..efcd946 100644
--- a/src/com/facebook/buck/cli/InstallCommand.java
+++ b/src/com/facebook/buck/cli/InstallCommand.java
@@ -398,9 +398,10 @@
           projectFilesystem,
           appleSimulator.get());
     } else {
-      params.getConsole().printSuccess(
-          String.format(
-              "Successfully installed %s. (Use `buck install -r %s` to run.)",
+      params.getBuckEventBus().post(
+          ConsoleEvent.info(
+              params.getConsole().getAnsi().asHighlightedSuccessText(
+                  "Successfully installed %s. (Use `buck install -r %s` to run.)"),
               getArguments().get(0),
               getArguments().get(0)));
       return 0;
@@ -445,9 +446,10 @@
       return 1;
     }
 
-    params.getConsole().printSuccess(
-        String.format(
-            "Successfully launched %s%s. To debug, run: lldb -p %d",
+    params.getBuckEventBus().post(
+        ConsoleEvent.info(
+            params.getConsole().getAnsi().asHighlightedSuccessText(
+                "Successfully launched %s%s. To debug, run: lldb -p %d"),
             getArguments().get(0),
             waitForDebugger ? " (waiting for debugger)" : "",
             launchedPid.get()));
