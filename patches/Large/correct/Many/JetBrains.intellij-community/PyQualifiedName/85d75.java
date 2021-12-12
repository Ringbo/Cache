diff --git a/python/psi-api/src/com/jetbrains/python/psi/impl/PyQualifiedName.java b/python/psi-api/src/com/jetbrains/python/psi/impl/PyQualifiedName.java
index 0b9cb4a..7e92748 100644
--- a/python/psi-api/src/com/jetbrains/python/psi/impl/PyQualifiedName.java
+++ b/python/psi-api/src/com/jetbrains/python/psi/impl/PyQualifiedName.java
@@ -61,7 +61,7 @@
   public PyQualifiedName append(PyQualifiedName qName) {
     PyQualifiedName result = new PyQualifiedName(myComponents.size()+qName.getComponentCount());
     result.myComponents.addAll(myComponents);
-    result.myComponents.addAll(result.getComponents());
+    result.myComponents.addAll(qName.getComponents());
     return result;
   }
 
