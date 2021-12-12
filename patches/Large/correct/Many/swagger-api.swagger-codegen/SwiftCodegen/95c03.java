diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/SwiftCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/SwiftCodegen.java
index 4359905..7bad177 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/SwiftCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/languages/SwiftCodegen.java
@@ -77,7 +77,8 @@
         "Bool",
         "Void",
         "String",
-        "Character")
+        "Character",
+        "AnyObject")
     );
     defaultIncludes = new HashSet<String>(
       Arrays.asList(
@@ -118,7 +119,7 @@
     typeMapping.put("float", "Float");
     typeMapping.put("number", "Double");
     typeMapping.put("double", "Double");
-    typeMapping.put("object", "String");
+    typeMapping.put("object", "AnyObject");
     typeMapping.put("file", "NSURL");
     //TODO binary should be mapped to byte array
     // mapped to String as a workaround
