diff --git a/app/src/processing/app/Editor.java b/app/src/processing/app/Editor.java
index 4b89f0e..8e4d70a 100644
--- a/app/src/processing/app/Editor.java
+++ b/app/src/processing/app/Editor.java
@@ -1877,7 +1877,8 @@
       } else if (result == JOptionPane.NO_OPTION) {
         return true;  // ok to continue
 
-      } else if (result == JOptionPane.CANCEL_OPTION) {
+      } else if (result == JOptionPane.CANCEL_OPTION ||
+                 result == JOptionPane.CLOSED_OPTION) {
         return false;
 
       } else {
