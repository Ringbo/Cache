diff --git a/python/src/com/jetbrains/python/psi/types/PyTypeChecker.java b/python/src/com/jetbrains/python/psi/types/PyTypeChecker.java
index 4879b14..761b57b 100644
--- a/python/src/com/jetbrains/python/psi/types/PyTypeChecker.java
+++ b/python/src/com/jetbrains/python/psi/types/PyTypeChecker.java
@@ -336,7 +336,7 @@
           final PyExpression arg = isRight ? expr.getLeftExpression() : expr.getRightExpression();
           final PyExpression receiver = isRight ? expr.getRightExpression() : expr.getLeftExpression();
           final PyParameter[] parameters = function.getParameterList().getParameters();
-          if (parameters.length == 2) {
+          if (parameters.length >= 2) {
             final PyNamedParameter param = parameters[1].getAsNamed();
             if (arg != null && param != null) {
               final Map<PyExpression, PyNamedParameter> arguments = new LinkedHashMap<PyExpression, PyNamedParameter>();
