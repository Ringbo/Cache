diff --git a/src/be/ibridge/kettle/spoon/Spoon.java b/src/be/ibridge/kettle/spoon/Spoon.java
index b13b68f..5b93833 100644
--- a/src/be/ibridge/kettle/spoon/Spoon.java
+++ b/src/be/ibridge/kettle/spoon/Spoon.java
@@ -4913,7 +4913,7 @@
         if (stepPartitioningMeta==null) stepPartitioningMeta = new StepPartitioningMeta();
         
         String[] options = StepPartitioningMeta.methodDescriptions;
-        EnterSelectionDialog dialog = new EnterSelectionDialog(shell, props, options, "Partioning method", "Select the partitioning method");
+        EnterSelectionDialog dialog = new EnterSelectionDialog(shell, options, "Partioning method", "Select the partitioning method");
         String methodDescription = dialog.open(stepPartitioningMeta.getMethod());
         if (methodDescription!=null)
         {
@@ -4946,7 +4946,7 @@
                     {
                         idx = Const.indexOfString(partitionSchema.getName(), schemaNames);
                     }
-                    EnterSelectionDialog askSchema = new EnterSelectionDialog(shell, props, schemaNames, "Select a partition schema", "Select the partition schema to use:");
+                    EnterSelectionDialog askSchema = new EnterSelectionDialog(shell, schemaNames, "Select a partition schema", "Select the partition schema to use:");
                     String schemaName = askSchema.open(idx);
                     if (schemaName!=null)
                     {
