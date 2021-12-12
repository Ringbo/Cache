diff --git a/python/src/com/jetbrains/python/psi/impl/PyCallExpressionHelper.java b/python/src/com/jetbrains/python/psi/impl/PyCallExpressionHelper.java
index 9d009b3..5801f0c 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyCallExpressionHelper.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyCallExpressionHelper.java
@@ -152,7 +152,7 @@
       final Callable callable = (Callable)resolved;
       int implicitOffset = getImplicitArgumentCount(callable, wrappedFlag, flags, is_by_instance);
       if (!isConstructorCall && PyNames.NEW.equals(callable.getName())) {
-        implicitOffset = Math.min(implicitOffset - 1, 0); // case of Class.__new__
+        implicitOffset = Math.max(implicitOffset - 1, 0); // case of Class.__new__
       }
       return new PyCallExpression.PyMarkedCallee(callable, flags, implicitOffset,
                                                  resolveResult != null ? resolveResult.isImplicit() : false);
