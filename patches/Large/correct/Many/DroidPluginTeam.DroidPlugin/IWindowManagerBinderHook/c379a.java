diff --git a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/binder/IWindowManagerBinderHook.java b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/binder/IWindowManagerBinderHook.java
index c81f94a..8d532c0 100644
--- a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/binder/IWindowManagerBinderHook.java
+++ b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/binder/IWindowManagerBinderHook.java
@@ -83,7 +83,7 @@
             Class WindowManagerHolder = Class.forName(clazz.getName() + "$WindowManagerHolder");
             Object obj = FieldUtils.readStaticField(WindowManagerHolder, "sWindowManager");
             Object proxiedObj = MyServiceManager.getProxiedObj(SERVICE_NAME);
-            if (obj != proxiedObj) {
+            if (obj == proxiedObj) {
                 return;
             }
             FieldUtils.writeStaticField(WindowManagerHolder, "sWindowManager", proxiedObj);
