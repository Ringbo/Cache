diff --git a/Examples/UIExplorer/android/app/src/main/java/UIExplorerActivity.java b/Examples/UIExplorer/android/app/src/main/java/UIExplorerActivity.java
index 04c8e25..c1dd73f 100644
--- a/Examples/UIExplorer/android/app/src/main/java/UIExplorerActivity.java
+++ b/Examples/UIExplorer/android/app/src/main/java/UIExplorerActivity.java
@@ -69,7 +69,7 @@
     super.onResume();
 
     if (mReactInstanceManager != null) {
-      mReactInstanceManager.onResume(this);
+      mReactInstanceManager.onResume(this, this);
     }
   }
 
