diff --git a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/HookFactory.java b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/HookFactory.java
index 57c1f9a..e198725 100644
--- a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/HookFactory.java
+++ b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/HookFactory.java
@@ -123,7 +123,7 @@
         installHook(new IAudioServiceBinderHook(context), classLoader);
         installHook(new IContentServiceBinderHook(context), classLoader);
         installHook(new IWindowManagerBinderHook(context), classLoader);
-        if (VERSION.SDK_INT >= VERSION_CODES.LOLLIPOP_MR1) {
+        if (VERSION.SDK_INT > VERSION_CODES.LOLLIPOP_MR1) {
             installHook(new IGraphicsStatsBinderHook(context), classLoader);
         }
 //        if (VERSION.SDK_INT >= VERSION_CODES.KITKAT) {
