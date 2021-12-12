diff --git a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/core/PluginProcessManager.java b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/core/PluginProcessManager.java
index 367e1f4..16a6242 100644
--- a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/core/PluginProcessManager.java
+++ b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/core/PluginProcessManager.java
@@ -206,12 +206,12 @@
                     if (apk != null) {
                         ClassLoader classloader = null;
                         try {
-                            classloader = new PluginClassLoader(apk, optimizedDirectory, libraryPath, ClassLoader.getSystemClassLoader());
+                            classloader = new PluginClassLoader(apk, optimizedDirectory, libraryPath, hostContext.getClassLoader().getParent());
                         } catch (Exception e) {
                         }
                         if(classloader==null){
                             PluginDirHelper.cleanOptimizedDirectory(optimizedDirectory);
-                            classloader = new PluginClassLoader(apk, optimizedDirectory, libraryPath, ClassLoader.getSystemClassLoader());
+                            classloader = new PluginClassLoader(apk, optimizedDirectory, libraryPath, hostContext.getClassLoader().getParent());
                         }
                         synchronized (loadedApk) {
                             FieldUtils.writeDeclaredField(loadedApk, "mClassLoader", classloader);
@@ -397,7 +397,7 @@
             try {
                 SYSTEM_SERVICE_MAP = FieldUtils.readStaticField(baseContext.getClass(), "SYSTEM_SERVICE_MAP");
             } catch (Exception e) {
-                Log.e(TAG, "readStaticField(SYSTEM_SERVICE_MAP) from %s fail", e, baseContext.getClass());
+                Log.w(TAG, "readStaticField(SYSTEM_SERVICE_MAP) from %s fail", e, baseContext.getClass());
             }
             if (SYSTEM_SERVICE_MAP == null) {
                 try {
