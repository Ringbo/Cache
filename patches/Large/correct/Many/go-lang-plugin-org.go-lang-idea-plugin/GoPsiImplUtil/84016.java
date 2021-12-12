diff --git a/src/com/goide/psi/impl/GoPsiImplUtil.java b/src/com/goide/psi/impl/GoPsiImplUtil.java
index 29f1d37..6fe55fd 100644
--- a/src/com/goide/psi/impl/GoPsiImplUtil.java
+++ b/src/com/goide/psi/impl/GoPsiImplUtil.java
@@ -416,7 +416,7 @@
     else if (o instanceof GoLiteral) {
       GoLiteral l = (GoLiteral)o;
       if (l.getChar() != null) return getBuiltinType(o, "rune");
-      if (l.getInt() != null) return getBuiltinType(o, "int");
+      if (l.getInt() != null || l.getHex() != null) return getBuiltinType(o, "int");
       if (l.getFloat() != null) return getBuiltinType(o, "float64");
       if (l.getFloati() != null) return getBuiltinType(o, "complex64");
       if (l.getDecimali() != null) return getBuiltinType(o, "complex128");
