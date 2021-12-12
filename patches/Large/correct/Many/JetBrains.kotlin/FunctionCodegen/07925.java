diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/FunctionCodegen.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/FunctionCodegen.java
index 675358a..8ba0bd8 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/FunctionCodegen.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/FunctionCodegen.java
@@ -504,7 +504,7 @@
             if (destructuringVariables == null) continue;
 
             for (VariableDescriptor entry : destructuringVariables) {
-                Type type = typeMapper.mapType(parameter.getType());
+                Type type = typeMapper.mapType(entry.getType());
                 mv.visitLocalVariable(entry.getName().asString(), type.getDescriptor(), null, methodBegin, methodEnd, shift);
                 shift += type.getSize();
             }
