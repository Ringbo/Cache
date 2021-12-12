diff --git a/core/java/android/text/TextLine.java b/core/java/android/text/TextLine.java
index 8ab481b..4aeabf3 100644
--- a/core/java/android/text/TextLine.java
+++ b/core/java/android/text/TextLine.java
@@ -295,10 +295,10 @@
 
         if (!mHasTabs) {
             if (mDirections == Layout.DIRS_ALL_LEFT_TO_RIGHT) {
-                return measureRun( 0, 0, target, mLen, false, fmi);
+                return measureRun( 0, 0, offset, mLen, false, fmi);
             }
             if (mDirections == Layout.DIRS_ALL_RIGHT_TO_LEFT) {
-                return measureRun(0, 0, target, mLen, true, fmi);
+                return measureRun(0, 0, offset, mLen, true, fmi);
             }
         }
 
