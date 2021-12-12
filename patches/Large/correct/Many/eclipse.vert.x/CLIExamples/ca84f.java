diff --git a/src/main/java/examples/cli/CLIExamples.java b/src/main/java/examples/cli/CLIExamples.java
index 2a16a17..3aabd20 100644
--- a/src/main/java/examples/cli/CLIExamples.java
+++ b/src/main/java/examples/cli/CLIExamples.java
@@ -43,7 +43,7 @@
             .setDescription("The source")
             .setArgName("source"))
         .addArgument(new Argument()
-            .setIndex(0)
+            .setIndex(1)
             .setDescription("The destination")
             .setArgName("target"));
   }
