diff --git a/src/main/org/codehaus/groovy/classgen/asm/sc/StaticTypesBinaryExpressionMultiTypeDispatcher.java b/src/main/org/codehaus/groovy/classgen/asm/sc/StaticTypesBinaryExpressionMultiTypeDispatcher.java
index 60e5966..a1088c4 100644
--- a/src/main/org/codehaus/groovy/classgen/asm/sc/StaticTypesBinaryExpressionMultiTypeDispatcher.java
+++ b/src/main/org/codehaus/groovy/classgen/asm/sc/StaticTypesBinaryExpressionMultiTypeDispatcher.java
@@ -262,7 +262,7 @@
         }
         if (!isAttribute) {
             String setter = "set" + MetaClassHelper.capitalize(property);
-            MethodNode setterMethod = receiverType.getSetterMethod(setter);
+            MethodNode setterMethod = receiverType.getSetterMethod(setter, false);
             ClassNode declaringClass = setterMethod!=null?setterMethod.getDeclaringClass():null;
             if (isThisExpression && declaringClass!=null && declaringClass.equals(controller.getClassNode())) {
                 // this.x = ... shouldn't use a setter if in the same class
