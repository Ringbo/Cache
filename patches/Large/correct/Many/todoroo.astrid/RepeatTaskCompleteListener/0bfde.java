diff --git a/astrid/plugin-src/com/todoroo/astrid/repeats/RepeatTaskCompleteListener.java b/astrid/plugin-src/com/todoroo/astrid/repeats/RepeatTaskCompleteListener.java
index 4e97b4c..ac17ffb 100644
--- a/astrid/plugin-src/com/todoroo/astrid/repeats/RepeatTaskCompleteListener.java
+++ b/astrid/plugin-src/com/todoroo/astrid/repeats/RepeatTaskCompleteListener.java
@@ -45,7 +45,7 @@
             return;
 
         String recurrence = task.getValue(Task.RECURRENCE);
-        if(recurrence.length() > 0) {
+        if(recurrence != null && recurrence.length() > 0) {
             DateValue repeatFrom;
             Date repeatFromDate = new Date();
 
