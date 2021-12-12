diff --git a/python/src/com/jetbrains/python/inspections/PyNonAsciiCharInspection.java b/python/src/com/jetbrains/python/inspections/PyNonAsciiCharInspection.java
index 1ea1aae..f24d4e6 100644
--- a/python/src/com/jetbrains/python/inspections/PyNonAsciiCharInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyNonAsciiCharInspection.java
@@ -76,7 +76,7 @@
 
     @Override
     public void visitPyStringLiteralExpression(PyStringLiteralExpression node) {
-      checkString(node, node.getStringValue());
+      checkString(node, node.getText());
     }
   }
 
