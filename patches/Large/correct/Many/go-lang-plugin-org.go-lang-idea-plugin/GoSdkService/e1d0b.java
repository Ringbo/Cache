diff --git a/src/com/goide/sdk/GoSdkService.java b/src/com/goide/sdk/GoSdkService.java
index d7d238f..6d6ca4e 100644
--- a/src/com/goide/sdk/GoSdkService.java
+++ b/src/com/goide/sdk/GoSdkService.java
@@ -75,7 +75,7 @@
         
         boolean gcloudInstallation = sdkHomePath.endsWith(GoConstants.GCLOUD_APP_ENGINE_DIRECTORY_PATH);
         if (gcloudInstallation) {
-          goExecutablePath = FileUtil.join(StringUtil.trimEnd(sdkHomePath, GoConstants.GCLOUD_APP_ENGINE_DIRECTORY_PATH), "bin");
+          goExecutablePath = FileUtil.join(StringUtil.trimEnd(goExecutablePath, GoConstants.GCLOUD_APP_ENGINE_DIRECTORY_PATH), "bin");
         }
         return FileUtil.join(goExecutablePath, GoEnvironmentUtil.getGaeExecutableFileName(gcloudInstallation));
       }
