diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/JavascriptClientCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/JavascriptClientCodegen.java
index c20a70d..d80afd1 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/JavascriptClientCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/JavascriptClientCodegen.java
@@ -762,9 +762,11 @@
             + (StringUtils.isEmpty(modelPackage) ? "" : (modelPackage + "/")) + dataType;
     }
 
+    /*
     private String getJSDocTypeWithBraces(CodegenModel cm, CodegenProperty cp) {
         return "{" + getJSDocType(cm, cp) + "}";
     }
+    */
 
     private String getJSDocType(CodegenModel cm, CodegenProperty cp) {
         if (Boolean.TRUE.equals(cp.isContainer)) {
@@ -787,9 +789,11 @@
         return cp.isEnum || !languageSpecificPrimitives.contains(cp.baseType == null ? cp.datatype : cp.baseType);
     }
 
+    /*
     private String getJSDocTypeWithBraces(CodegenParameter cp) {
         return "{" + getJSDocType(cp) + "}";
     }
+    */
 
     private String getJSDocType(CodegenParameter cp) {
         String dataType = trimBrackets(cp.dataType);
@@ -808,10 +812,12 @@
         return cp.isEnum || !languageSpecificPrimitives.contains(cp.baseType == null ? cp.dataType : cp.baseType);
     }
 
+    /*
     private String getJSDocTypeWithBraces(CodegenOperation co) {
         String jsDocType = getJSDocType(co);
         return jsDocType == null ? null : "{" + jsDocType + "}";
     }
+    */
 
     private String getJSDocType(CodegenOperation co) {
         String returnType = trimBrackets(co.returnType);
@@ -860,10 +866,10 @@
 
                 // Store JSDoc type specification into vendor-extension: x-jsdoc-type.
                 for (CodegenParameter cp : operation.allParams) {
-                    String jsdocType = getJSDocTypeWithBraces(cp);
+                    String jsdocType = getJSDocType(cp);
                     cp.vendorExtensions.put("x-jsdoc-type", jsdocType);
                 }
-                String jsdocType = getJSDocTypeWithBraces(operation);
+                String jsdocType = getJSDocType(operation);
                 operation.vendorExtensions.put("x-jsdoc-type", jsdocType);
             }
         }
@@ -889,7 +895,7 @@
 
             for (CodegenProperty var : cm.vars) {
                 // Add JSDoc @type value for this property.
-                String jsDocType = getJSDocTypeWithBraces(cm, var);
+                String jsDocType = getJSDocType(cm, var);
                 var.vendorExtensions.put("x-jsdoc-type", jsDocType);
 
                 if (Boolean.TRUE.equals(var.required)) {
