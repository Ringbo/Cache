diff --git a/src/com/facebook/buck/android/NdkCxxPlatforms.java b/src/com/facebook/buck/android/NdkCxxPlatforms.java
index fcb2e38..480a394 100644
--- a/src/com/facebook/buck/android/NdkCxxPlatforms.java
+++ b/src/com/facebook/buck/android/NdkCxxPlatforms.java
@@ -141,7 +141,7 @@
               platform,
               ndkRoot,
               NdkCxxPlatformTargetConfiguration.builder()
-                  .setToolchain(Toolchain.ARM_LINUX_ADNROIDEABI)
+                  .setToolchain(Toolchain.ARM_LINUX_ANDROIDEABI)
                   .setTargetArch(TargetArch.ARM)
                   .setTargetArchAbi(TargetArchAbi.ARMEABI)
                   .setTargetAppPlatform(androidPlatform)
@@ -197,7 +197,7 @@
               platform,
               ndkRoot,
               NdkCxxPlatformTargetConfiguration.builder()
-                  .setToolchain(Toolchain.ARM_LINUX_ADNROIDEABI)
+                  .setToolchain(Toolchain.ARM_LINUX_ANDROIDEABI)
                   .setTargetArch(TargetArch.ARM)
                   .setTargetArchAbi(TargetArchAbi.ARMEABI_V7A)
                   .setTargetAppPlatform(androidPlatform)
@@ -973,7 +973,7 @@
 
     X86("x86"),
     X86_64("x86_64"),
-    ARM_LINUX_ADNROIDEABI("arm-linux-androideabi"),
+    ARM_LINUX_ANDROIDEABI("arm-linux-androideabi"),
     ;
 
     private final String value;
