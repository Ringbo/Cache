diff --git a/Examples/Movies/android/app/src/main/java/com/facebook/react/movies/MoviesActivity.java b/Examples/Movies/android/app/src/main/java/com/facebook/react/movies/MoviesActivity.java
index 6499cea..3b26266 100644
--- a/Examples/Movies/android/app/src/main/java/com/facebook/react/movies/MoviesActivity.java
+++ b/Examples/Movies/android/app/src/main/java/com/facebook/react/movies/MoviesActivity.java
@@ -69,7 +69,7 @@
     super.onResume();
 
     if (mReactInstanceManager != null) {
-      mReactInstanceManager.onResume(this);
+      mReactInstanceManager.onResume(this, this);
     }
   }
 
