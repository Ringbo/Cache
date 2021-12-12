diff --git a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/BindToContentValuesMethod.java b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/BindToContentValuesMethod.java
index 69bbeb0..6241d6e 100644
--- a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/BindToContentValuesMethod.java
+++ b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/method/BindToContentValuesMethod.java
@@ -43,7 +43,7 @@
 
         List<ColumnDefinition> columnDefinitionList = baseTableDefinition.getColumnDefinitions();
         for (ColumnDefinition columnDefinition : columnDefinitionList) {
-            methodBuilder.addCode(columnDefinition.getContentValuesStatement());
+            methodBuilder.addCode(columnDefinition.getContentValuesStatement(isModelContainerAdapter));
         }
 
         if (implementsContentValuesListener) {
