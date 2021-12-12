diff --git a/compiler/backend/src/org/jetbrains/jet/codegen/ImplementationBodyCodegen.java b/compiler/backend/src/org/jetbrains/jet/codegen/ImplementationBodyCodegen.java
index 6ec6e1f..c03ef9a 100644
--- a/compiler/backend/src/org/jetbrains/jet/codegen/ImplementationBodyCodegen.java
+++ b/compiler/backend/src/org/jetbrains/jet/codegen/ImplementationBodyCodegen.java
@@ -344,7 +344,7 @@
                 Method method = typeMapper.mapGetterSignature(bridge, OwnerKind.IMPLEMENTATION).getJvmMethodSignature().getAsmMethod();
                 JvmPropertyAccessorSignature originalSignature = typeMapper.mapGetterSignature(original, OwnerKind.IMPLEMENTATION);
                 Method originalMethod = originalSignature.getJvmMethodSignature().getAsmMethod();
-                MethodVisitor mv = v.newMethod(null, ACC_BRIDGE | ACC_STATIC, method.getName(), method.getDescriptor(), null, null);
+                MethodVisitor mv = v.newMethod(null, ACC_BRIDGE | ACC_SYNTHETIC | ACC_STATIC, method.getName(), method.getDescriptor(), null, null);
                 PropertyCodegen.generateJetPropertyAnnotation(mv, originalSignature.getPropertyTypeKotlinSignature(),
                                                               originalSignature.getJvmMethodSignature().getKotlinTypeParameter(),
                                                               original, ((PropertyDescriptor) entry.getValue()).getGetter().getVisibility());
