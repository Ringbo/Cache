diff --git a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/handle/PluginCallback.java b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/handle/PluginCallback.java
index 81ecca7..b59187b 100644
--- a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/handle/PluginCallback.java
+++ b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/hook/handle/PluginCallback.java
@@ -359,7 +359,7 @@
             // 这里多加一个isNotShortcutProxyActivity的判断，因为ShortcutProxyActivity的很特殊，启动它的时候，
             // 也会带上一个EXTRA_TARGET_INTENT的数据，就会导致这里误以为是启动插件Activity，所以这里要先做一个判断。
             // 之前ShortcutProxyActivity错误复用了key，但是为了兼容，所以这里就先这么判断吧。
-            if (targetIntent != null && !isShortcutProxyActivity(targetIntent)) {
+            if (targetIntent != null && !isShortcutProxyActivity(stubIntent)) {
                 IPackageManagerHook.fixContextPackageManager(mHostContext);
                 ComponentName targetComponentName = targetIntent.resolveActivity(mHostContext.getPackageManager());
                 ActivityInfo targetActivityInfo = PluginManager.getInstance().getActivityInfo(targetComponentName, 0);
