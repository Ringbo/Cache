diff --git a/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java b/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
index 3d46ff9..2ddb7b4 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
@@ -232,7 +232,7 @@
               return Ref.<PyType>create(PyBuiltinCache.getInstance(pyClass).getObjectType(PyNames.PROPERTY));
             }
             final Maybe<PyFunction> accessor = property.getByDirection(AccessDirection.of(this));
-            final PyFunction function = accessor.value();
+            final PyFunction function = accessor.valueOrNull();
             final PyType type = (function != null) ? function.getReturnType(context, this) : null;
             return Ref.create(type);
           }
