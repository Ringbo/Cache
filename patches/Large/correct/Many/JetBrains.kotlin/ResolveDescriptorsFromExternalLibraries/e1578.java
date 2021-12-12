diff --git a/compiler/tests/org/jetbrains/jet/cli/jvm/compiler/longTest/ResolveDescriptorsFromExternalLibraries.java b/compiler/tests/org/jetbrains/jet/cli/jvm/compiler/longTest/ResolveDescriptorsFromExternalLibraries.java
index 9c29dbe..9b44525 100644
--- a/compiler/tests/org/jetbrains/jet/cli/jvm/compiler/longTest/ResolveDescriptorsFromExternalLibraries.java
+++ b/compiler/tests/org/jetbrains/jet/cli/jvm/compiler/longTest/ResolveDescriptorsFromExternalLibraries.java
@@ -128,7 +128,7 @@
             ZipInputStream zip = new ZipInputStream(is);
 
             while (zip.available() > 0) {
-                hasErrors |= parseLibraryFileChunk(jar, libDescription, zip);
+                hasErrors |= parseLibraryFileChunk(jar, libDescription, zip, classesPerChunk);
             }
         } finally {
             try {
