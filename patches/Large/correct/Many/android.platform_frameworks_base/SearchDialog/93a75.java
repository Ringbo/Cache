diff --git a/core/java/android/app/SearchDialog.java b/core/java/android/app/SearchDialog.java
index f776452..f474f06 100644
--- a/core/java/android/app/SearchDialog.java
+++ b/core/java/android/app/SearchDialog.java
@@ -745,7 +745,7 @@
             return true;
         }
         
-        if (keyCode == KeyEvent.KEYCODE_SEARCH) {
+        if (keyCode == KeyEvent.KEYCODE_SEARCH && event.getRepeatCount() < 1) {
             // If the search key is pressed, toggle between global and in-app search. If we are
             // currently doing global search and there is no in-app search context to toggle to,
             // just don't do anything.
