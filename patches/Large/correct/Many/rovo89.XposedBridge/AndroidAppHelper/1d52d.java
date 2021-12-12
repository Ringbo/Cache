diff --git a/src/android/app/AndroidAppHelper.java b/src/android/app/AndroidAppHelper.java
index 6eab827..90e6d05 100644
--- a/src/android/app/AndroidAppHelper.java
+++ b/src/android/app/AndroidAppHelper.java
@@ -112,7 +112,7 @@
 		try {
 			Class<?> classResourcesKey = Class.forName("android.content.res.ResourcesKey");
 			if (hasIsThemeable)
-				return newInstance(classResourcesKey, resDir, displayId, config, scale, token, isThemeable);
+				return newInstance(classResourcesKey, resDir, displayId, config, scale, isThemeable, token);
 			else
 				return newInstance(classResourcesKey, resDir, displayId, config, scale, token);
 		} catch (Throwable t) {
