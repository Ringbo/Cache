diff --git a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/handle/IMountServiceHookHandle.java b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/handle/IMountServiceHookHandle.java
index 46d4ef2..4cce3b9 100644
--- a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/handle/IMountServiceHookHandle.java
+++ b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/handle/IMountServiceHookHandle.java
@@ -76,7 +76,7 @@
                 if (args != null && args.length > index1 && args[index1] instanceof String) {
                     String path = (String) args[index1];
 //                    String path1 = new File(Environment.getExternalStorageDirectory(), "Android/data/").getPath();
-                    if (path != null) {
+                    if (path != null && path.indexOf(mHostContext.getPackageName()) < 0) {
                         String[] dirs = path.split("/");
                         if (dirs != null && dirs.length > 0) {
                             String pluginPackageName = null;
@@ -106,7 +106,7 @@
                 if (args != null && args.length > index1 && args[index1] instanceof String) {
                     String path = (String) args[index1];
 //                    String path1 = new File(Environment.getExternalStorageDirectory(), "Android/data/").getPath();
-                    if (path != null) {
+                    if (path != null && path.indexOf(mHostContext.getPackageName()) < 0) {
                         String[] dirs = path.split("/");
                         if (dirs != null && dirs.length > 0) {
                             String pluginPackageName = null;
