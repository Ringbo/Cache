diff --git a/src/main/org/codehaus/groovy/classgen/asm/sc/StaticTypesTypeChooser.java b/src/main/org/codehaus/groovy/classgen/asm/sc/StaticTypesTypeChooser.java
index 409ba25..ba5b482 100644
--- a/src/main/org/codehaus/groovy/classgen/asm/sc/StaticTypesTypeChooser.java
+++ b/src/main/org/codehaus/groovy/classgen/asm/sc/StaticTypesTypeChooser.java
@@ -33,7 +33,7 @@
     @Override
     public ClassNode resolveType(final Expression exp, final ClassNode current) {
         Expression target = exp instanceof VariableExpression ? getTarget((VariableExpression) exp) : exp;
-        ClassNode dif = (ClassNode) exp.getNodeMetaData(StaticTypesMarker.DECLARATION_INFERRED_TYPE);
+        ClassNode dif = (ClassNode) target.getNodeMetaData(StaticTypesMarker.DECLARATION_INFERRED_TYPE);
         if (dif != null) return dif;
         ClassNode inferredType = (ClassNode) target.getNodeMetaData(StaticTypesMarker.INFERRED_TYPE);
         if (inferredType != null) {
