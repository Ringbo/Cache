diff --git a/platform/lang-impl/src/com/intellij/codeInsight/hint/ParameterInfoController.java b/platform/lang-impl/src/com/intellij/codeInsight/hint/ParameterInfoController.java
index da3a94f..dac8c22 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/hint/ParameterInfoController.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/hint/ParameterInfoController.java
@@ -126,7 +126,7 @@
 
   public static boolean isAlreadyShown(Editor editor, int lbraceOffset, boolean singleParameterInfo) {
     ParameterInfoController controller = findControllerAtOffset(editor, lbraceOffset);
-    return controller != null && controller.myHint.isVisible() && (!controller.mySingleParameterInfo || !singleParameterInfo);
+    return controller != null && controller.myHint.isVisible() && (!controller.mySingleParameterInfo || singleParameterInfo);
   }
 
   public ParameterInfoController(@NotNull Project project,
