diff --git a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/ContentProviderDefinition.java b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/ContentProviderDefinition.java
index 0541274..22e5ef4 100644
--- a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/ContentProviderDefinition.java
+++ b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/ContentProviderDefinition.java
@@ -130,7 +130,7 @@
         typeBuilder.addMethod(MethodSpec.methodBuilder("getDatabaseName")
                 .addAnnotation(Override.class)
                 .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
-                .addStatement("return $S", databaseName)
+                .addStatement("return $S", databaseNameString)
                 .returns(ClassName.get(String.class)).build());
 
         MethodSpec.Builder getTypeBuilder = MethodSpec.methodBuilder("getType")
