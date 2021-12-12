diff --git a/parceler/src/main/java/org/parceler/internal/generator/ParcelableReadWriteGenerator.java b/parceler/src/main/java/org/parceler/internal/generator/ParcelableReadWriteGenerator.java
index e253f33..a98125a 100644
--- a/parceler/src/main/java/org/parceler/internal/generator/ParcelableReadWriteGenerator.java
+++ b/parceler/src/main/java/org/parceler/internal/generator/ParcelableReadWriteGenerator.java
@@ -29,7 +29,7 @@
 
     @Override
     public JExpression generateReader(JBlock body, JVar parcelParam, ASTType type, JClass returnJClassRef, JDefinedClass parcelableClass, JVar identity, JVar readIdentityMap) {
-        return JExpr.cast(returnJClassRef, parcelParam.invoke(getReadMethod()).arg(returnJClassRef.dotclass().invoke("getClassLoader")));
+        return JExpr.cast(returnJClassRef, parcelParam.invoke(getReadMethod()).arg(parcelableClass.dotclass().invoke("getClassLoader")));
     }
 
     @Override
