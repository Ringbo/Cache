diff --git a/python/src/com/jetbrains/python/psi/impl/PyFunctionImpl.java b/python/src/com/jetbrains/python/psi/impl/PyFunctionImpl.java
index c61693c..81392e3 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyFunctionImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyFunctionImpl.java
@@ -252,7 +252,7 @@
     final PyBuiltinCache cache = PyBuiltinCache.getInstance(this);
     final PyClass listClass = cache.getClass("list");
     final PyStatementList statements = getStatementList();
-    final Set<PyType> types = new HashSet<PyType>();
+    final Set<PyType> types = new LinkedHashSet<PyType>();
     if (statements != null && listClass != null) {
       statements.accept(new PyRecursiveElementVisitor() {
         @Override
