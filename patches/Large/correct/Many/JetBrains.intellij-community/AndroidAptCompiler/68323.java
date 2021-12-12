diff --git a/plugins/android/src/org/jetbrains/android/compiler/AndroidAptCompiler.java b/plugins/android/src/org/jetbrains/android/compiler/AndroidAptCompiler.java
index 435f695..1838e15 100644
--- a/plugins/android/src/org/jetbrains/android/compiler/AndroidAptCompiler.java
+++ b/plugins/android/src/org/jetbrains/android/compiler/AndroidAptCompiler.java
@@ -126,7 +126,7 @@
           if (aptItem.myGeneratedFile.exists()) {
             ApplicationManager.getApplication().runReadAction(new Runnable() {
               public void run() {
-                if (context.getProject().isDisposed()) {
+                if (context.getProject().isDisposed() || aptItem.myModule.isDisposed()) {
                   return;
                 }
                 String className = FileUtil.getNameWithoutExtension(aptItem.myGeneratedFile);
