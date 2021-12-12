diff --git a/services/java/com/android/server/am/ActivityStack.java b/services/java/com/android/server/am/ActivityStack.java
index b9f63cf..78ddb51 100755
--- a/services/java/com/android/server/am/ActivityStack.java
+++ b/services/java/com/android/server/am/ActivityStack.java
@@ -3543,7 +3543,7 @@
         }
         ActivityRecord r = mHistory.get(index);
 
-        while (index > 0) {
+        while (index >= 0) {
             ActivityRecord cur = mHistory.get(index);
             if (cur.task != r.task) {
                 break;
