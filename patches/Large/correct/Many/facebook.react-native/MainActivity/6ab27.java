diff --git a/local-cli/generator-android/templates/package/MainActivity.java b/local-cli/generator-android/templates/package/MainActivity.java
index a79b26c..1e2b912 100644
--- a/local-cli/generator-android/templates/package/MainActivity.java
+++ b/local-cli/generator-android/templates/package/MainActivity.java
@@ -72,7 +72,7 @@
         super.onResume();
 
         if (mReactInstanceManager != null) {
-            mReactInstanceManager.onResume(this);
+            mReactInstanceManager.onResume(this, this);
         }
     }
 }
