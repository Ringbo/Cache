diff --git a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/TableDefinition.java b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/TableDefinition.java
index 7d0d093..e50fa86 100644
--- a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/TableDefinition.java
+++ b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/TableDefinition.java
@@ -356,7 +356,7 @@
             typeBuilder.addMethod(MethodSpec.methodBuilder("getAutoIncrementingColumnName")
                     .addAnnotation(Override.class)
                     .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
-                    .addStatement("return $S", QueryBuilder.quote(autoIncrementDefinition.columnName))
+                    .addStatement("return $S", QueryBuilder.stripQuotes(autoIncrementDefinition.columnName))
                     .returns(ClassName.get(String.class)).build());
         }
 
