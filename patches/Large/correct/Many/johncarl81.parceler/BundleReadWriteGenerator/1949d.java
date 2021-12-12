diff --git a/parceler/src/main/java/org/parceler/internal/generator/BundleReadWriteGenerator.java b/parceler/src/main/java/org/parceler/internal/generator/BundleReadWriteGenerator.java
index a0680f4..b721057 100644
--- a/parceler/src/main/java/org/parceler/internal/generator/BundleReadWriteGenerator.java
+++ b/parceler/src/main/java/org/parceler/internal/generator/BundleReadWriteGenerator.java
@@ -29,7 +29,7 @@
 
     @Override
     public JExpression generateReader(JBlock body, JVar parcelParam, ASTType type, JClass returnJClassRef, JDefinedClass parcelableClass, JVar identity, JVar readIdentityMap) {
-        return JExpr.cast(returnJClassRef, parcelParam.invoke(getReadMethod()).arg(returnJClassRef.dotclass().invoke("getClassLoader")));
+        return JExpr.cast(returnJClassRef, parcelParam.invoke(getReadMethod()).arg(parcelableClass.dotclass().invoke("getClassLoader")));
     }
 
     @Override
