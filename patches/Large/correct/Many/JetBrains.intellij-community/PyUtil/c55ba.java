diff --git a/python/src/com/jetbrains/python/psi/PyUtil.java b/python/src/com/jetbrains/python/psi/PyUtil.java
index 4c9b75b..8c4c286 100644
--- a/python/src/com/jetbrains/python/psi/PyUtil.java
+++ b/python/src/com/jetbrains/python/psi/PyUtil.java
@@ -1064,7 +1064,7 @@
 
   @Nullable
   public static PyClass getMetaClass(@NotNull final PyClass pyClass) {
-    final PyTargetExpression metaClassAttribute = pyClass.findClassAttribute(PyNames.DUNDER_METACLASS, true);
+    final PyTargetExpression metaClassAttribute = pyClass.findClassAttribute(PyNames.DUNDER_METACLASS, false);
     if (metaClassAttribute != null) {
       final PyExpression expression = metaClassAttribute.findAssignedValue();
       final PyClass metaclass = getMetaFromExpression(expression);
