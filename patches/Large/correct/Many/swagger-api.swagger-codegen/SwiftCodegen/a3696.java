diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/SwiftCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/SwiftCodegen.java
index 7bad177..2d7a424 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/SwiftCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/SwiftCodegen.java
@@ -189,7 +189,7 @@
 
   @Override
   public String escapeReservedWord(String name) {
-    return "Swagger" + name;  // add an underscore to the name
+    return "_" + name;  // add an underscore to the name
   }
 
   @Override
@@ -264,7 +264,11 @@
       codegenProperty.allowableValues.put("values", swiftEnums);
       codegenProperty.datatypeWithEnum =
               StringUtils.left(codegenProperty.datatypeWithEnum, codegenProperty.datatypeWithEnum.length() - "Enum".length());
-      if (reservedWords.contains(codegenProperty.datatypeWithEnum)) {
+      // Ensure that the enum type doesn't match a reserved word or
+      // the variable name doesn't match the generated enum type or the
+      // Swift compiler will generate an error
+      if (reservedWords.contains(codegenProperty.datatypeWithEnum) ||
+          name.equals(codegenProperty.datatypeWithEnum)) {
         codegenProperty.datatypeWithEnum = escapeReservedWord(codegenProperty.datatypeWithEnum);
       }
     }
