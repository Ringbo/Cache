diff --git a/ButtonClicker/src/com/google/example/games/bc/MainActivity.java b/ButtonClicker/src/com/google/example/games/bc/MainActivity.java
index 4351136..7872b7a 100644
--- a/ButtonClicker/src/com/google/example/games/bc/MainActivity.java
+++ b/ButtonClicker/src/com/google/example/games/bc/MainActivity.java
@@ -814,7 +814,7 @@
      * they were supposed to in order for the sample to work.
      */
     boolean verifyPlaceholderIdsReplaced() {
-        final boolean CHECK_PKGNAME = false; // set to false to disable check
+        final boolean CHECK_PKGNAME = true; // set to false to disable check
                                              // (not recommended!)
 
         // Did the developer forget to change the package name?
