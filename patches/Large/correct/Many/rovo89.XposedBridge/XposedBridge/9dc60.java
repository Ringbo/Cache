diff --git a/src/de/robv/android/xposed/XposedBridge.java b/src/de/robv/android/xposed/XposedBridge.java
index 262425a..69bb5c2 100644
--- a/src/de/robv/android/xposed/XposedBridge.java
+++ b/src/de/robv/android/xposed/XposedBridge.java
@@ -176,7 +176,7 @@
 	/**
 	 * Hook some methods which we want to create an easier interface for developers.
 	 */
-	private static void initXbridgeZygote() throws Exception {
+	private static void initXbridgeZygote() throws Throwable {
 		final HashSet<String> loadedPackagesInProcess = new HashSet<String>(1);
 		
 		// normal process initialization (for new Activity, Service, BroadcastReceiver etc.) 
@@ -266,7 +266,7 @@
 		if (!new File(BASE_DIR + "conf/disable_resources").exists()) {
 			try {
 				hookResources();
-			} catch (Exception e) {
+			} catch (Throwable e) {
 				log("Errors during resources initialization");
 				logResourcesDebugInfo();
 				throw e;
@@ -276,7 +276,7 @@
 		}
 	}
 
-	private static void hookResources() throws Exception {
+	private static void hookResources() throws Throwable {
 		// lots of different variants due to theming engines
 		if (Build.VERSION.SDK_INT <= 16) {
 			GET_TOP_LEVEL_RES_PARAM_COMP_INFO = 1;
@@ -366,14 +366,13 @@
 		if (Build.VERSION.SDK_INT >= 19) {
 			try {
 				logClassMethods(findClass("android.app.ResourcesManager", null), "getTopLevelResources");
-			} catch (Exception e) {
-			}
+			} catch (Throwable ignored) {}
 		}
 	}
 
 	private static void logClassMethods(Class<?> cls, String pattern) {
 		for (Method m : cls.getDeclaredMethods()) {
-			if (pattern == null || pattern.length() == 0 || m.getName().matches(pattern))
+			if (pattern == null || pattern.isEmpty() || m.getName().matches(pattern))
 				log(" - " + m.toString());
 		}
 	}
