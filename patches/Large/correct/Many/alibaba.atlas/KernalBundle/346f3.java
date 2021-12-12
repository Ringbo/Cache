diff --git a/atlas-core/src/main/java/android/taobao/atlas/startup/patch/KernalBundle.java b/atlas-core/src/main/java/android/taobao/atlas/startup/patch/KernalBundle.java
index 371b2e8..145c6c4 100644
--- a/atlas-core/src/main/java/android/taobao/atlas/startup/patch/KernalBundle.java
+++ b/atlas-core/src/main/java/android/taobao/atlas/startup/patch/KernalBundle.java
@@ -403,7 +403,7 @@
             }
             //临时处理方案，需要替换为dexopt时传入classsLoader以兼容8.0
             patchWithApk = dexPatch &&
-                    (TextUtils.isEmpty(KernalVersionManager.instance().currentVersionName()) || !KernalVersionManager.instance().currentVersionName().equals(KernalConstants.INSTALLED_VERSIONNAME));
+                    (TextUtils.isEmpty(KernalVersionManager.instance().currentVersionName()) || KernalVersionManager.instance().currentVersionName().equals(KernalConstants.INSTALLED_VERSIONNAME));
             if (!needReplaceClassLoader) {
                 FrameworkPropertiesClazz = archive.getOdexFile()[newFrameworkPropertiesDexIndex].loadClass("android.taobao.atlas.framework.FrameworkProperties", application.getClassLoader());
             }else if(patchWithApk){
