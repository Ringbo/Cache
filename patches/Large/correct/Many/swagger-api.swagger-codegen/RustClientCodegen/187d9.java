diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/RustClientCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/RustClientCodegen.java
index 15caa76..5ac6121 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/RustClientCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/RustClientCodegen.java
@@ -174,11 +174,11 @@
 
     @Override
     public String apiFileFolder() {
-        return (outputFolder + File.separator + apiFolder).replaceAll("/", File.separator);
+        return (outputFolder + File.separator + apiFolder).replace("/", File.separator);
     }
 
     public String modelFileFolder() {
-        return (outputFolder + File.separator + modelFolder).replaceAll("/", File.separator);
+        return (outputFolder + File.separator + modelFolder).replace("/", File.separator);
     }
 
     @Override
