diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index 8226d8e..b792c65 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -789,7 +789,7 @@
         List<ClassNode> tests = new LinkedList<ClassNode>();
         tests.add(objectExpressionType);
         if (objectExpressionType.equals(CLASS_Type) && objectExpressionType.getGenericsTypes() != null) {
-            tests.add(objectExpressionType.getGenericsTypes()[0].getType());
+            tests.add(0,objectExpressionType.getGenericsTypes()[0].getType());
             staticProperty = true;
         }
         if (!typeCheckingContext.temporaryIfBranchTypeInformation.empty()) {
@@ -967,7 +967,7 @@
         List<ClassNode> tests = new LinkedList<ClassNode>();
         tests.add(clazz);
         if (clazz.equals(CLASS_Type) && clazz.getGenericsTypes() != null) {
-            tests.add(clazz.getGenericsTypes()[0].getType());
+            tests.add(0,clazz.getGenericsTypes()[0].getType());
         }
         if (!typeCheckingContext.temporaryIfBranchTypeInformation.empty()) {
             List<ClassNode> classNodes = getTemporaryTypesForExpression(objectExpression);
@@ -2032,7 +2032,7 @@
         owners.add(Receiver.<String>make(receiver));
         if (receiver.equals(CLASS_Type) && receiver.getGenericsTypes() != null) {
             GenericsType clazzGT = receiver.getGenericsTypes()[0];
-            owners.add(Receiver.<String>make(clazzGT.getType()));
+            owners.add(0,Receiver.<String>make(clazzGT.getType()));
         }
         if (receiver.isInterface()) {
             // GROOVY-xxxx
