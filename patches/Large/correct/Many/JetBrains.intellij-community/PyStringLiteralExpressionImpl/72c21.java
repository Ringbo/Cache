diff --git a/python/src/com/jetbrains/python/psi/impl/PyStringLiteralExpressionImpl.java b/python/src/com/jetbrains/python/psi/impl/PyStringLiteralExpressionImpl.java
index 1e79fa2..56b35bb 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyStringLiteralExpressionImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyStringLiteralExpressionImpl.java
@@ -436,7 +436,7 @@
 
     @Override
     public boolean isOneLine() {
-      return false;
+      return true;
     }
   }
 
