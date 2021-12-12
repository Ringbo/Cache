diff --git a/src/org/zaproxy/zap/extension/autoupdate/CheckForUpdates.java b/src/org/zaproxy/zap/extension/autoupdate/CheckForUpdates.java
index 61d00e2..3257d4c 100644
--- a/src/org/zaproxy/zap/extension/autoupdate/CheckForUpdates.java
+++ b/src/org/zaproxy/zap/extension/autoupdate/CheckForUpdates.java
@@ -64,7 +64,7 @@
 		boolean newerVersion = false;
 		if (Constant.isDevBuild(progVersionStr)) {
 			return false;
-		} else if (checkDaily && Constant.isDailyBuild()) {
+		} else if (checkDaily && Constant.isDailyBuild(progVersionStr)) {
         	// Will just be a 'dated' version, which we can just use a string compare on
 			return progVersionStr.compareTo(latestVersionStr) < 0;
         } else if (latestVersionStr != null && latestVersionStr.length() > 0) {
