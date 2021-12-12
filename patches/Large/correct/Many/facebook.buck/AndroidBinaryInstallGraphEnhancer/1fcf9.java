diff --git a/src/com/facebook/buck/android/AndroidBinaryInstallGraphEnhancer.java b/src/com/facebook/buck/android/AndroidBinaryInstallGraphEnhancer.java
index 31f7ec1..a68826d 100644
--- a/src/com/facebook/buck/android/AndroidBinaryInstallGraphEnhancer.java
+++ b/src/com/facebook/buck/android/AndroidBinaryInstallGraphEnhancer.java
@@ -47,17 +47,17 @@
 
   private ProjectFilesystem projectFilesystem;
   private BuildTarget buildTarget;
-  private HasInstallableApk androidBinary;
+  private HasInstallableApk installableApk;
   private AndroidInstallConfig androidInstallConfig;
 
   AndroidBinaryInstallGraphEnhancer(
       AndroidInstallConfig androidInstallConfig,
       ProjectFilesystem projectFilesystem,
       BuildTarget buildTarget,
-      HasInstallableApk androidBinary) {
+      HasInstallableApk installableApk) {
     this.projectFilesystem = projectFilesystem;
     this.buildTarget = buildTarget.withFlavors(INSTALL_FLAVOR);
-    this.androidBinary = androidBinary;
+    this.installableApk = installableApk;
     this.androidInstallConfig = androidInstallConfig;
   }
 
@@ -74,11 +74,11 @@
   }
 
   private boolean exopackageEnabled() {
-    return androidBinary.getApkInfo().getExopackageInfo().isPresent();
+    return installableApk.getApkInfo().getExopackageInfo().isPresent();
   }
 
   private void enhanceForConcurrentExopackageInstall(ActionGraphBuilder graphBuilder) {
-    ApkInfo apkInfo = androidBinary.getApkInfo();
+    ApkInfo apkInfo = installableApk.getApkInfo();
     Preconditions.checkState(apkInfo.getExopackageInfo().isPresent());
 
     ExopackageDeviceDirectoryLister directoryLister =
@@ -169,7 +169,7 @@
 
   private void enhanceForConcurrentInstall(ActionGraphBuilder graphBuilder) {
     graphBuilder.addToIndex(
-        new AndroidBinaryNonExoInstaller(buildTarget, projectFilesystem, androidBinary));
+        new AndroidBinaryNonExoInstaller(buildTarget, projectFilesystem, installableApk));
   }
 
   private void enhanceForLegacyInstall(ActionGraphBuilder graphBuilder) {
