diff --git a/astrid/src/com/todoroo/astrid/ui/EditTextControlSet.java b/astrid/src/com/todoroo/astrid/ui/EditTextControlSet.java
index 321cd36..06aca2d 100644
--- a/astrid/src/com/todoroo/astrid/ui/EditTextControlSet.java
+++ b/astrid/src/com/todoroo/astrid/ui/EditTextControlSet.java
@@ -23,7 +23,7 @@
 
     @Override
     public void readFromTask(Task task) {
-        editText.setText(task.getValue(property));
+        editText.setTextKeepState(task.getValue(property));
     }
 
     @Override
