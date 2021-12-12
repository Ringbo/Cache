diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/ImplementationBodyCodegen.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/ImplementationBodyCodegen.java
index 0eb2e3b..fcd6a23 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/ImplementationBodyCodegen.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/ImplementationBodyCodegen.java
@@ -678,7 +678,7 @@
         ) {
             Type thisDescriptorType = typeMapper.mapType(descriptor);
 
-            functionCodegen.generateMethod(JvmDeclarationOriginKt.OtherOrigin(myClass, function), function, new FunctionGenerationStrategy() {
+            functionCodegen.generateMethod(JvmDeclarationOriginKt.OtherOriginFromPure(myClass, function), function, new FunctionGenerationStrategy() {
                 @Override
                 public void generateBody(
                         @NotNull MethodVisitor mv,
@@ -778,7 +778,7 @@
         FunctionDescriptor valuesFunction =
                 CollectionsKt.single(descriptor.getStaticScope().getContributedFunctions(ENUM_VALUES, NoLookupLocation.FROM_BACKEND));
         MethodVisitor mv = v.newMethod(
-                JvmDeclarationOriginKt.OtherOrigin(myClass, valuesFunction), ACC_PUBLIC | ACC_STATIC, ENUM_VALUES.asString(),
+                JvmDeclarationOriginKt.OtherOriginFromPure(myClass, valuesFunction), ACC_PUBLIC | ACC_STATIC, ENUM_VALUES.asString(),
                 "()" + type.getDescriptor(), null, null
         );
         if (!state.getClassBuilderMode().generateBodies) return;
@@ -796,7 +796,7 @@
                 CollectionsKt.single(descriptor.getStaticScope().getContributedFunctions(ENUM_VALUE_OF, NoLookupLocation.FROM_BACKEND),
                                      DescriptorUtilsKt::isEnumValueOfMethod);
         MethodVisitor mv =
-                v.newMethod(JvmDeclarationOriginKt.OtherOrigin(myClass, valueOfFunction), ACC_PUBLIC | ACC_STATIC, ENUM_VALUE_OF.asString(),
+                v.newMethod(JvmDeclarationOriginKt.OtherOriginFromPure(myClass, valueOfFunction), ACC_PUBLIC | ACC_STATIC, ENUM_VALUE_OF.asString(),
                             "(Ljava/lang/String;)" + classAsmType.getDescriptor(), null, null);
         if (!state.getClassBuilderMode().generateBodies) return;
 
@@ -814,7 +814,7 @@
 
         if (isNonCompanionObject(descriptor)) {
             StackValue.Field field = StackValue.singletonViaInstance(descriptor, typeMapper);
-            v.newField(JvmDeclarationOriginKt.OtherOrigin(myClass),
+            v.newField(JvmDeclarationOriginKt.OtherOriginFromPure(myClass),
                        ACC_PUBLIC | ACC_STATIC | ACC_FINAL,
                        field.name, field.type.getDescriptor(), null, null);
 
@@ -1560,7 +1560,7 @@
         InstructionAdapter iv = codegen.v;
 
         Type arrayAsmType = typeMapper.mapType(DescriptorUtilsKt.getBuiltIns(descriptor).getArrayType(INVARIANT, descriptor.getDefaultType()));
-        v.newField(JvmDeclarationOriginKt.OtherOrigin(myClass), ACC_PRIVATE | ACC_STATIC | ACC_FINAL | ACC_SYNTHETIC, ENUM_VALUES_FIELD_NAME,
+        v.newField(JvmDeclarationOriginKt.OtherOriginFromPure(myClass), ACC_PRIVATE | ACC_STATIC | ACC_FINAL | ACC_SYNTHETIC, ENUM_VALUES_FIELD_NAME,
                    arrayAsmType.getDescriptor(), null, null);
 
         iv.iconst(enumEntries.size());
