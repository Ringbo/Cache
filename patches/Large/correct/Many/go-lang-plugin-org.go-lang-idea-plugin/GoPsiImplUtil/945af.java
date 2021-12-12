diff --git a/src/com/goide/psi/impl/GoPsiImplUtil.java b/src/com/goide/psi/impl/GoPsiImplUtil.java
index 276621a..4882dfa 100644
--- a/src/com/goide/psi/impl/GoPsiImplUtil.java
+++ b/src/com/goide/psi/impl/GoPsiImplUtil.java
@@ -343,7 +343,7 @@
       GoType type = ((GoCompositeLit)o).getType();
       if (type != null) return type;
       GoTypeReferenceExpression expression = ((GoCompositeLit)o).getTypeReferenceExpression();
-      return findTypeFromRef(expression);
+      return findTypeFromRefInner(expression);
     }
     else if (o instanceof GoFunctionLit) {
       return new MyFunType((GoFunctionLit)o);
