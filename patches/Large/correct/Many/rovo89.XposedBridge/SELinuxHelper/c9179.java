diff --git a/src/de/robv/android/xposed/SELinuxHelper.java b/src/de/robv/android/xposed/SELinuxHelper.java
index 23c21b6..58319d8 100644
--- a/src/de/robv/android/xposed/SELinuxHelper.java
+++ b/src/de/robv/android/xposed/SELinuxHelper.java
@@ -73,7 +73,7 @@
 		if (sIsSELinuxEnabled)
 			sContext = (String) callStaticMethod(sClassSELinux, "getContext");
 
-		if (sIsSELinuxEnforced) {
+		if (sIsSELinuxEnabled) {
 			if (packageName == null) {  // Zygote
 				sServiceAppDataFile = new ZygoteService();
 			} else if (packageName.equals("android")) {  //system_server
