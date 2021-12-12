diff --git a/plugins/android/src/org/jetbrains/android/compiler/AndroidCompileUtil.java b/plugins/android/src/org/jetbrains/android/compiler/AndroidCompileUtil.java
index 019e0fe..2eb73a3 100644
--- a/plugins/android/src/org/jetbrains/android/compiler/AndroidCompileUtil.java
+++ b/plugins/android/src/org/jetbrains/android/compiler/AndroidCompileUtil.java
@@ -376,7 +376,7 @@
       result.add(resourcesDir.getPath());
     }
     for (AndroidFacet depFacet : AndroidUtils.getAllAndroidDependencies(module, true)) {
-      VirtualFile depResourceDir = AndroidAptCompiler.getResourceDirForApkCompiler(depFacet.getModule(), facet);
+      VirtualFile depResourceDir = AndroidAptCompiler.getResourceDirForApkCompiler(depFacet.getModule(), depFacet);
       if (depResourceDir != null) {
         result.add(depResourceDir.getPath());
       }
