diff --git a/python/src/com/jetbrains/python/psi/impl/PyImportElementImpl.java b/python/src/com/jetbrains/python/psi/impl/PyImportElementImpl.java
index 3fa1c9b..7e2b47f 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyImportElementImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyImportElementImpl.java
@@ -72,7 +72,7 @@
   }
 
   public PyTargetExpression getAsNameElement() {
-    return getStubOrPsiChild(PyElementTypes.TARGET_EXPRESSION);
+    return findChildByType(PyElementTypes.TARGET_EXPRESSION);
   }
 
   public String getAsName() {
