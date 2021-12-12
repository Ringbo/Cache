diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/JaxRSServerCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/JaxRSServerCodegen.java
index ae22656..1cf57b8 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/JaxRSServerCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/JaxRSServerCodegen.java
@@ -171,7 +171,7 @@
         String port = "8080";
         if(host != null) {
             String[] parts = host.split(":");
-            if(parts.length > 0) {
+            if(parts.length > 1) {
                 port = parts[1];
             }
         }
