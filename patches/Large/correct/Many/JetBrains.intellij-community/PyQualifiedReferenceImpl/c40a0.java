diff --git a/python/src/com/jetbrains/python/psi/impl/PyQualifiedReferenceImpl.java b/python/src/com/jetbrains/python/psi/impl/PyQualifiedReferenceImpl.java
index 07ae89a..e4c4884 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyQualifiedReferenceImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyQualifiedReferenceImpl.java
@@ -100,7 +100,7 @@
     PyExpression qualifier = myElement.getQualifier();
     assert qualifier != null;
 
-    PyType qualifierType = qualifier.getType(TypeEvalContext.fast());
+    PyType qualifierType = qualifier.getType(TypeEvalContext.slow());
     ProcessingContext ctx = new ProcessingContext();
     final Set<String> names_already = new HashSet<String>();
     ctx.put(PyType.CTX_NAMES, names_already);
