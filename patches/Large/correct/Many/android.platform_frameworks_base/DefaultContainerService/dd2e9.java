diff --git a/packages/DefaultContainerService/src/com/android/defcontainer/DefaultContainerService.java b/packages/DefaultContainerService/src/com/android/defcontainer/DefaultContainerService.java
index e4de641..ec87c6e 100644
--- a/packages/DefaultContainerService/src/com/android/defcontainer/DefaultContainerService.java
+++ b/packages/DefaultContainerService/src/com/android/defcontainer/DefaultContainerService.java
@@ -345,7 +345,7 @@
         NativeLibraryHelper.ApkHandle handle = new NativeLibraryHelper.ApkHandle(codePath);
         String[] abiList = Build.SUPPORTED_ABIS;
         if (abiOverride != null) {
-            abiList = new String[] { abiList };
+            abiList = new String[] { abiOverride };
         } else {
             try {
                 if (Build.SUPPORTED_64_BIT_ABIS.length > 0 &&
