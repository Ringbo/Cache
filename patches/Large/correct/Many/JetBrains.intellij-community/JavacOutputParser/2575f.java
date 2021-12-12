diff --git a/java/compiler/impl/src/com/intellij/compiler/impl/javaCompiler/javac/JavacOutputParser.java b/java/compiler/impl/src/com/intellij/compiler/impl/javaCompiler/javac/JavacOutputParser.java
index f5d106e..ba12e69 100644
--- a/java/compiler/impl/src/com/intellij/compiler/impl/javaCompiler/javac/JavacOutputParser.java
+++ b/java/compiler/impl/src/com/intellij/compiler/impl/javaCompiler/javac/JavacOutputParser.java
@@ -80,7 +80,7 @@
 
     if (colonIndex1 >= 0){ // looks like found something like file path
       @NonNls String part1 = line.substring(0, colonIndex1).trim();
-      if(part1.equalsIgnoreCase("error")) { // jikes
+      if(part1.equalsIgnoreCase("error") /*jikes*/ || part1.equalsIgnoreCase("Caused by")) {
         addMessage(callback, CompilerMessageCategory.ERROR, line.substring(colonIndex1));
         return true;
       }
