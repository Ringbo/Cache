diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/compiler/generator/GroovyToJavaGenerator.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/compiler/generator/GroovyToJavaGenerator.java
index 69b28b7f..48664db 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/compiler/generator/GroovyToJavaGenerator.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/compiler/generator/GroovyToJavaGenerator.java
@@ -151,7 +151,7 @@
   }
 
   protected VirtualFile[] getGroovyFilesToGenerate(CompileContext context) {
-    return context.getCompileScope().getFiles(GroovyFileType.GROOVY_FILE_TYPE, true);
+    return context.getProjectCompileScope().getFiles(GroovyFileType.GROOVY_FILE_TYPE, true);
   }
 
   public GenerationItem[] generate(CompileContext context, GenerationItem[] itemsToGenerate, VirtualFile outputRootDirectory) {
