diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/Qt5CPPGenerator.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/Qt5CPPGenerator.java
index ff58dbd..13efbc3 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/Qt5CPPGenerator.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/Qt5CPPGenerator.java
@@ -97,7 +97,9 @@
                 Arrays.asList(
                         "bool",
                         "qint32",
-                        "qint64")
+                        "qint64",
+                        "float",
+                        "double")
         );
 
         supportingFiles.add(new SupportingFile("helpers-header.mustache", sourceFolder, PREFIX + "Helpers.h"));
