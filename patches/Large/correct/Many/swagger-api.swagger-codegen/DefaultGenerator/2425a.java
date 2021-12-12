diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultGenerator.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultGenerator.java
index a2e7f59..c12d406 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultGenerator.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultGenerator.java
@@ -840,7 +840,7 @@
         operations.put("package", config.apiPackage());
 
 
-        Set<String> allImports = new LinkedHashSet<String>();
+        Set<String> allImports = new TreeSet<String>();
         for (CodegenOperation op : ops) {
             allImports.addAll(op.imports);
         }
