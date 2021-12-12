diff --git a/buildSrc/src/main/groovy/org/gradle/build/docs/dsl/source/GenerateDefaultImportsTask.java b/buildSrc/src/main/groovy/org/gradle/build/docs/dsl/source/GenerateDefaultImportsTask.java
index f72528d..6924172 100644
--- a/buildSrc/src/main/groovy/org/gradle/build/docs/dsl/source/GenerateDefaultImportsTask.java
+++ b/buildSrc/src/main/groovy/org/gradle/build/docs/dsl/source/GenerateDefaultImportsTask.java
@@ -60,11 +60,11 @@
 
     @OutputFile
     public File getMappingDestFile() {
-        return importsDestFile;
+        return mappingDestFile;
     }
 
     public void setMappingDestFile(File destFile) {
-        this.importsDestFile = destFile;
+        this.mappingDestFile = destFile;
     }
 
     @Input
