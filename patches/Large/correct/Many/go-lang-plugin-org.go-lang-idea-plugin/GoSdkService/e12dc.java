diff --git a/src/com/goide/sdk/GoSdkService.java b/src/com/goide/sdk/GoSdkService.java
index 70d0446..cd311d4 100644
--- a/src/com/goide/sdk/GoSdkService.java
+++ b/src/com/goide/sdk/GoSdkService.java
@@ -69,7 +69,7 @@
     if (sdkHomePath != null) {
       return isAppEngineSdkPath(sdkHomePath)
              ? FileUtil.join(StringUtil.trimEnd(sdkHomePath, GoConstants.APP_ENGINE_GO_ROOT_DIRECTORY_PATH), GoConstants.GAE_EXECUTABLE_NAME)
-             : FileUtil.join(sdkHomePath, GoConstants.GO_EXECUTABLE_NAME);
+             : FileUtil.join(sdkHomePath, "bin", GoConstants.GO_EXECUTABLE_NAME);
     }
     return null;
   }
