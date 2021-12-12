diff --git a/astrid/src/com/todoroo/astrid/ui/EditNotesControlSet.java b/astrid/src/com/todoroo/astrid/ui/EditNotesControlSet.java
index 40666bf..0d8d2e6 100644
--- a/astrid/src/com/todoroo/astrid/ui/EditNotesControlSet.java
+++ b/astrid/src/com/todoroo/astrid/ui/EditNotesControlSet.java
@@ -33,9 +33,9 @@
 
     @Override
     protected void refreshDisplayView() {
-        CharSequence textToUse;
+        String textToUse;
         if (initialized)
-            textToUse = editText.getText();
+            textToUse = editText.getText().toString();
         else
             textToUse = model.getValue(Task.NOTES);
 
