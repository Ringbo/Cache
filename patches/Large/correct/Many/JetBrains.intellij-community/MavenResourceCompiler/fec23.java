diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/compiler/MavenResourceCompiler.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/compiler/MavenResourceCompiler.java
index 6448129..8eaa2cc 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/compiler/MavenResourceCompiler.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/compiler/MavenResourceCompiler.java
@@ -391,7 +391,7 @@
         outputFile.getParentFile().mkdirs();
 
         boolean shouldFilter = eachItem.isFiltered();
-        if (sourceFile.length() > 10 * 1024 * 1024) {
+        if (shouldFilter && sourceFile.length() > 10 * 1024 * 1024) {
           context.addMessage(CompilerMessageCategory.WARNING,
                              "Maven: File is too big to be filtered. Most likely it is a binary file and should be excluded from filtering.",
                              sourceVirtualFile.getUrl(), -1, -1);
