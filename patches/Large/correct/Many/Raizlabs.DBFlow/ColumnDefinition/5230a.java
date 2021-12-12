diff --git a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/column/ColumnDefinition.java b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/column/ColumnDefinition.java
index 6f09a03..8da750a 100644
--- a/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/column/ColumnDefinition.java
+++ b/dbflow-processor/src/main/java/com/raizlabs/android/dbflow/processor/definition/column/ColumnDefinition.java
@@ -119,7 +119,7 @@
         if (containerKey != null) {
             containerKeyName = containerKey.value();
         } else {
-            containerKeyName = columnName;
+            containerKeyName = elementName;
         }
 
         TypeElement typeElement = manager.getElements().getTypeElement(element.asType().toString());
