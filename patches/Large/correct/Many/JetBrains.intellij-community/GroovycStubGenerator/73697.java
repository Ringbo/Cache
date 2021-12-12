diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/compiler/generator/GroovycStubGenerator.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/compiler/generator/GroovycStubGenerator.java
index 71ab0d6..5d30147 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/compiler/generator/GroovycStubGenerator.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/compiler/generator/GroovycStubGenerator.java
@@ -136,7 +136,7 @@
       private void deleteChildrenRecursively(final VirtualFile dir) throws IOException {
         for (final VirtualFile child : dir.getChildren()) {
           if (child.isDirectory()) {
-            deleteChildrenRecursively(dir);
+            deleteChildrenRecursively(child);
           }
           TranslatingCompilerFilesMonitor.removeSourceInfo(child);
           child.delete(this);
