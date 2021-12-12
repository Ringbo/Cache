diff --git a/plugins/android/src/org/jetbrains/android/compiler/AndroidPackagingCompiler.java b/plugins/android/src/org/jetbrains/android/compiler/AndroidPackagingCompiler.java
index affe243..254ec41 100644
--- a/plugins/android/src/org/jetbrains/android/compiler/AndroidPackagingCompiler.java
+++ b/plugins/android/src/org/jetbrains/android/compiler/AndroidPackagingCompiler.java
@@ -226,14 +226,9 @@
                                : item.getFinalPath();
 
       final Map<CompilerMessageCategory, List<String>> messages = AndroidApkBuilder
-        .execute(item.mySdkPath,
-                 resPackagePath,
-                 item.getClassesDexPath(),
-                 item.getSourceRoots(),
-                 externalLibPaths,
-                 item.getNativeLibsFolders(),
-                 finalPath,
-                 unsigned);
+        .execute(context.getProject(), resPackagePath, item.getClassesDexPath(), item.getSourceRoots(), externalLibPaths, item.getNativeLibsFolders(),
+                 finalPath, unsigned, item.mySdkPath
+        );
       AndroidCompileUtil.addMessages(context, messages);
     }
     catch (final IOException e) {
