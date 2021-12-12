diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/CodegenOperation.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/CodegenOperation.java
index 71597b6..d62aca3 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/CodegenOperation.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/CodegenOperation.java
@@ -111,7 +111,7 @@
      * @return true if act as Restful index method, false otherwise
      */
     public boolean isRestfulIndex() {
-        return "GET".equals(httpMethod) && "".equals(pathWithoutBaseName());
+        return "GET".equalsIgnoreCase(httpMethod) && "".equals(pathWithoutBaseName());
     }
 
     /**
