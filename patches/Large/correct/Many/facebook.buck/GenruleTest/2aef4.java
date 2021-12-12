diff --git a/test/com/facebook/buck/shell/GenruleTest.java b/test/com/facebook/buck/shell/GenruleTest.java
index 5a90327..2391fed 100644
--- a/test/com/facebook/buck/shell/GenruleTest.java
+++ b/test/com/facebook/buck/shell/GenruleTest.java
@@ -233,7 +233,7 @@
         .build(),
         genruleCommand.getEnvironmentVariables(executionContext));
     assertEquals(
-        ImmutableList.of("/bin/bash", "-c", "python convert_to_katana.py AndroidManifest.xml > $OUT"),
+        ImmutableList.of("/bin/bash", "-e", "-c", "python convert_to_katana.py AndroidManifest.xml > $OUT"),
         genruleCommand.getShellCommand(executionContext));
   }
 
@@ -511,7 +511,7 @@
         .build(new BuildRuleResolver());
 
     ImmutableList<String> command = rule.createGenruleStep().getShellCommand(linuxExecutionContext);
-    assertEquals(ImmutableList.of("/bin/bash", "-c", bash), command);
+    assertEquals(ImmutableList.of("/bin/bash", "-e", "-c", bash), command);
 
     command = rule.createGenruleStep().getShellCommand(windowsExecutionContext);
     assertEquals(ImmutableList.of("cmd.exe", "/c", cmdExe), command);
@@ -523,7 +523,7 @@
         .setOut("out.txt")
         .build(new BuildRuleResolver());
     command = rule.createGenruleStep().getShellCommand(linuxExecutionContext);
-    assertEquals(ImmutableList.of("/bin/bash", "-c", cmd), command);
+    assertEquals(ImmutableList.of("/bin/bash", "-e", "-c", cmd), command);
 
     command = rule.createGenruleStep().getShellCommand(windowsExecutionContext);
     assertEquals(ImmutableList.of("cmd.exe", "/c", cmd), command);
