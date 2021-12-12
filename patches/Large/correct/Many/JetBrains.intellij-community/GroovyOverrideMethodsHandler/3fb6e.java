diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/overrideImplement/GroovyOverrideMethodsHandler.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/overrideImplement/GroovyOverrideMethodsHandler.java
index 6c36e20..0bf4dc2 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/overrideImplement/GroovyOverrideMethodsHandler.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/overrideImplement/GroovyOverrideMethodsHandler.java
@@ -38,7 +38,7 @@
     PsiClass aClass = OverrideImplementUtil.getContextClass(project, editor, file, true);
     if (aClass == null) return;
 
-    if (OverrideImplementUtil.getMethodSignaturesToImplement(aClass).isEmpty()) {
+    if (OverrideImplementUtil.getMethodSignaturesToOverride(aClass).isEmpty()) {
       HintManager.getInstance().showErrorHint(editor, "No methods to override have been found");
       return;
     }
