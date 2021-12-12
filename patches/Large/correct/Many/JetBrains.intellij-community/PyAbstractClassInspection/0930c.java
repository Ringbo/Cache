diff --git a/python/src/com/jetbrains/python/inspections/PyAbstractClassInspection.java b/python/src/com/jetbrains/python/inspections/PyAbstractClassInspection.java
index 22f241d..eabe00f 100644
--- a/python/src/com/jetbrains/python/inspections/PyAbstractClassInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyAbstractClassInspection.java
@@ -50,7 +50,7 @@
       final Collection<PyFunction> functions = PyOverrideImplementUtil.getAllSuperFunctions(node);
       for (PyFunction method : functions) {
         final PyDecoratorList list = method.getDecoratorList();
-        if (list != null) {
+        if (list != null && node.findMethodByName(method.getName(), false) == null) {
           if (list.findDecorator(PyNames.ABSTRACTMETHOD) != null || list.findDecorator(PyNames.ABSTRACTPROPERTY) != null) {
             toBeImplemented.add(method);
           }
@@ -58,7 +58,7 @@
       }
       final ASTNode nameNode = node.getNameNode();
       if (!toBeImplemented.isEmpty() && nameNode != null) {
-        registerProblem(nameNode.getPsi(), PyBundle.message("INSP.NAME.abstract.class.$0.must.implement", node),
+        registerProblem(nameNode.getPsi(), PyBundle.message("INSP.NAME.abstract.class.$0.must.implement", node.getName()),
                         ProblemHighlightType.INFO, null, new PyImplementMethodsQuickFix(node, toBeImplemented));
       }
     }
