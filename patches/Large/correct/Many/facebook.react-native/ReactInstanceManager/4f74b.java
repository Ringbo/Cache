diff --git a/ReactAndroid/src/main/java/com/facebook/react/ReactInstanceManager.java b/ReactAndroid/src/main/java/com/facebook/react/ReactInstanceManager.java
index 3b6e467..ee72e9a 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/ReactInstanceManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/ReactInstanceManager.java
@@ -960,7 +960,7 @@
         mBackBtnHandler,
         mUIImplementationProvider,
         mLazyViewManagersEnabled);
-    mPackages.add(coreModulesPackage);
+    mPackages.add(0,coreModulesPackage);
     NativeModuleRegistry nativeModuleRegistry = processPackages(reactContext, mPackages, false);
 
     NativeModuleCallExceptionHandler exceptionHandler = mNativeModuleCallExceptionHandler != null
