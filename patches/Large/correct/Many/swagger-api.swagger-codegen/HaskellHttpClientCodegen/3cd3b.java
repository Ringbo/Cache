diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/HaskellHttpClientCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/HaskellHttpClientCodegen.java
index cd60a22..5f57e10 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/HaskellHttpClientCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/HaskellHttpClientCodegen.java
@@ -128,7 +128,7 @@
         supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
         supportingFiles.add(new SupportingFile("stack.mustache", "", "stack.yaml"));
         supportingFiles.add(new SupportingFile("Setup.mustache", "", "Setup.hs"));
-        supportingFiles.add(new SupportingFile(".gitignore", "", ".gitignore"));
+        supportingFiles.add(new SupportingFile("gitignore.mustache", "", ".gitignore"));
         supportingFiles.add(new SupportingFile(".travis.yml", "", ".travis.yml"));
         supportingFiles.add(new SupportingFile("git_push.sh.mustache", "", "git_push.sh"));
 
@@ -241,7 +241,7 @@
 
     public void setDateFormat(String value) {
         if (StringUtils.isBlank(value)) {
-            additionalProperties.remove(DATE_FORMAT);
+            additionalProperties.put(DATE_FORMAT, defaultDateFormat);
         } else {
             additionalProperties.put(DATE_FORMAT, value);
         }
