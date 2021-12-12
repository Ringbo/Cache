diff --git a/antlr4-maven-plugin/src/main/java/org/antlr/mojo/antlr4/Antlr4Mojo.java b/antlr4-maven-plugin/src/main/java/org/antlr/mojo/antlr4/Antlr4Mojo.java
index dcdc0a2..0a81f51 100644
--- a/antlr4-maven-plugin/src/main/java/org/antlr/mojo/antlr4/Antlr4Mojo.java
+++ b/antlr4-maven-plugin/src/main/java/org/antlr/mojo/antlr4/Antlr4Mojo.java
@@ -395,7 +395,7 @@
             String tokensFileName = grammarFile.getName().split("\\.")[0] + ".tokens";
             File outputFile = new File(outputDirectory, tokensFileName);
             if ( (! outputFile.exists()) ||
-                 outputFile.lastModified() < grammarFile.lastModified() ||
+                 outputFile.lastModified() <= grammarFile.lastModified() ||
                  dependencies.isDependencyChanged(grammarFile)) {
                 grammarFilesToProcess.add(grammarFile);
             }
