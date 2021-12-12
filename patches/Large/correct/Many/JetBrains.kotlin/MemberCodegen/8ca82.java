diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/MemberCodegen.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/MemberCodegen.java
index 0dc64fe..e97fa53 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/MemberCodegen.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/MemberCodegen.java
@@ -300,7 +300,7 @@
 
         Type classType = state.getTypeMapper().mapClass(descriptor);
         ClassBuilder classBuilder = state.getFactory().newVisitor(
-                JvmDeclarationOriginKt.OtherOrigin(aClass, descriptor),
+                JvmDeclarationOriginKt.OtherOriginFromPure(aClass, descriptor),
                 classType, aClass.getContainingKtFile());
         ClassContext classContext = parentContext.intoClass(descriptor, OwnerKind.IMPLEMENTATION, state);
         new ImplementationBodyCodegen(aClass, classContext, classBuilder, state, parentCodegen, false).generate();
@@ -683,7 +683,7 @@
 
     protected void generateConstInstance(@NotNull Type thisAsmType, @NotNull Type fieldAsmType) {
         v.newField(
-                JvmDeclarationOriginKt.OtherOrigin(element), ACC_STATIC | ACC_FINAL | ACC_PUBLIC, JvmAbi.INSTANCE_FIELD,
+                JvmDeclarationOriginKt.OtherOriginFromPure(element), ACC_STATIC | ACC_FINAL | ACC_PUBLIC, JvmAbi.INSTANCE_FIELD,
                 fieldAsmType.getDescriptor(), null, null
         );
 
