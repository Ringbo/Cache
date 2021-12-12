diff --git a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/LoadFromCursorMethod.java b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/LoadFromCursorMethod.java
index 7da69b3..1487a66 100644
--- a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/LoadFromCursorMethod.java
+++ b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/LoadFromCursorMethod.java
@@ -72,7 +72,7 @@
 
         List<ColumnDefinition> columnDefinitionList = baseTableDefinition.getColumnDefinitions();
         for (ColumnDefinition columnDefinition : columnDefinitionList) {
-            methodBuilder.addCode(columnDefinition.getLoadFromCursorMethod());
+            methodBuilder.addCode(columnDefinition.getLoadFromCursorMethod(isModelContainerAdapter));
         }
 
         return methodBuilder.build();
