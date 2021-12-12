diff --git a/src/main/org/codehaus/groovy/transform/DelegateASTTransformation.java b/src/main/org/codehaus/groovy/transform/DelegateASTTransformation.java
index 7bc5756..45e6f18 100644
--- a/src/main/org/codehaus/groovy/transform/DelegateASTTransformation.java
+++ b/src/main/org/codehaus/groovy/transform/DelegateASTTransformation.java
@@ -91,7 +91,7 @@
 
     private void addSetterIfNeeded(FieldNode fieldNode, ClassNode owner, PropertyNode prop, String name) {
         String setterName = "set" + Verifier.capitalize(name);
-        if ((prop.getModifiers() & ACC_FINAL) != 0 && owner.getSetterMethod(setterName) == null) {
+        if ((prop.getModifiers() & ACC_FINAL) == 0 && owner.getSetterMethod(setterName) == null) {
             owner.addMethod(setterName,
                     ACC_PUBLIC,
                     ClassHelper.VOID_TYPE,
