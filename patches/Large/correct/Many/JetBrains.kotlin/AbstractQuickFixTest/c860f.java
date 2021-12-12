diff --git a/idea/tests/org/jetbrains/kotlin/idea/quickfix/AbstractQuickFixTest.java b/idea/tests/org/jetbrains/kotlin/idea/quickfix/AbstractQuickFixTest.java
index 86f049e..64c819e 100644
--- a/idea/tests/org/jetbrains/kotlin/idea/quickfix/AbstractQuickFixTest.java
+++ b/idea/tests/org/jetbrains/kotlin/idea/quickfix/AbstractQuickFixTest.java
@@ -90,7 +90,7 @@
         }
     }
 
-    private static void unConfigureRuntimeIfNeeded(@NotNull String beforeFileName) {
+    private void unConfigureRuntimeIfNeeded(@NotNull String beforeFileName) {
         if (beforeFileName.endsWith("JsRuntime.kt")) {
             ConfigLibraryUtil.unConfigureKotlinJsRuntimeAndSdk(getModule(), getProjectJDK());
         }
