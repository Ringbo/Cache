diff --git a/python/src/com/jetbrains/python/inspections/PyMissingConstructorInspection.java b/python/src/com/jetbrains/python/inspections/PyMissingConstructorInspection.java
index 1e91168..1c6702a 100644
--- a/python/src/com/jetbrains/python/inspections/PyMissingConstructorInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyMissingConstructorInspection.java
@@ -47,7 +47,7 @@
       if (initMethod != null) {
         if (hasConstructorCall(node, initMethod))
           return;
-        if (superClasses.length == 1)
+        if (superClasses.length == 1 || node.isNewStyleClass())
           registerProblem(initMethod.getNameIdentifier(), "Call to constructor of super class is missed",
                           new AddCallSuperQuickFix(node.getSuperClasses()[0], superClasses[0].getText()));
         else
