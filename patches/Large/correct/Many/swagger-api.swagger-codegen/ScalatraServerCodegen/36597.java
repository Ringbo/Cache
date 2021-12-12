diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/ScalatraServerCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/ScalatraServerCodegen.java
index b148a4d..63f43df 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/ScalatraServerCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/ScalatraServerCodegen.java
@@ -42,7 +42,7 @@
                         "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
                         "catch", "extends", "int", "short", "try", "char", "final", "interface", "static",
                         "void", "class", "finally", "long", "strictfp", "volatile", "const", "float",
-                        "native", "super", "while")
+                        "native", "super", "while", "type")
         );
 
         defaultIncludes = new HashSet<String>(
