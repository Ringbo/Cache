diff --git a/src/com/facebook/buck/android/DefaultAndroidDirectoryResolver.java b/src/com/facebook/buck/android/DefaultAndroidDirectoryResolver.java
index 9252044..5d837a6 100644
--- a/src/com/facebook/buck/android/DefaultAndroidDirectoryResolver.java
+++ b/src/com/facebook/buck/android/DefaultAndroidDirectoryResolver.java
@@ -438,7 +438,7 @@
         targetNdkVersion,
         propertyFinder,
         (sdk.isPresent()) ? (sdk.get()) : "SDK not available",
-        (sdk.isPresent()) ? (buildTools.get()) : "Build tools not available",
+        (buildTools.isPresent()) ? (buildTools.get()) : "Build tools not available",
         (ndk.isPresent()) ? (ndk.get()) : "NDK not available");
   }
 
