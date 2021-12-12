diff --git a/compiler/backend/src/org/jetbrains/jet/codegen/binding/MutableClosure.java b/compiler/backend/src/org/jetbrains/jet/codegen/binding/MutableClosure.java
index 9dbbe37..47d78e9 100644
--- a/compiler/backend/src/org/jetbrains/jet/codegen/binding/MutableClosure.java
+++ b/compiler/backend/src/org/jetbrains/jet/codegen/binding/MutableClosure.java
@@ -121,7 +121,7 @@
 
     public void captureVariable(EnclosedValueDescriptor value) {
         if (captureVariables == null) {
-            captureVariables = new HashMap<DeclarationDescriptor, EnclosedValueDescriptor>();
+            captureVariables = new LinkedHashMap<DeclarationDescriptor, EnclosedValueDescriptor>();
         }
         captureVariables.put(value.getDescriptor(), value);
     }
