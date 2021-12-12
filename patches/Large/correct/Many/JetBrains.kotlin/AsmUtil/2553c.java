diff --git a/compiler/backend/src/org/jetbrains/jet/codegen/AsmUtil.java b/compiler/backend/src/org/jetbrains/jet/codegen/AsmUtil.java
index 9f4ad62..f964f1c 100644
--- a/compiler/backend/src/org/jetbrains/jet/codegen/AsmUtil.java
+++ b/compiler/backend/src/org/jetbrains/jet/codegen/AsmUtil.java
@@ -491,7 +491,7 @@
             if (type == null || isNullableType(type)) continue;
 
             int index = frameMap.getIndex(parameter);
-            Type asmType = state.getTypeMapper().mapReturnType(type);
+            Type asmType = state.getTypeMapper().mapType(type);
             if (asmType.getSort() == Type.OBJECT || asmType.getSort() == Type.ARRAY) {
                 v.load(index, asmType);
                 v.visitLdcInsn(parameter.getName().asString());
