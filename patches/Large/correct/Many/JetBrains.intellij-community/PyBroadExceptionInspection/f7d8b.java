diff --git a/python/src/com/jetbrains/python/inspections/PyBroadExceptionInspection.java b/python/src/com/jetbrains/python/inspections/PyBroadExceptionInspection.java
index b6fcb9a..184b7f9 100644
--- a/python/src/com/jetbrains/python/inspections/PyBroadExceptionInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyBroadExceptionInspection.java
@@ -38,14 +38,14 @@
     public void visitPyExceptBlock(final PyExceptPart node){
       PyExpression exceptClass= node.getExceptClass();
       if (exceptClass == null) {
-        registerProblem(node, "Too broad exception clause");
+        registerProblem(node.getFirstChild(), "Too broad exception clause");
       }
       if (exceptClass instanceof PyReferenceExpression) {
         PyReferenceExpression exceptClassRef = (PyReferenceExpression)exceptClass;
         PyType classRefType = myTypeEvalContext.getType(exceptClassRef);
         if (classRefType != null) {
           if (classRefType.isBuiltin())
-            registerProblem(node, "Too broad exception clause");
+            registerProblem(exceptClassRef, "Too broad exception clause");
         }
       }
 
