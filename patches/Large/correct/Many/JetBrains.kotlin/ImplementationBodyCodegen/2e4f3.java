diff --git a/compiler/backend/src/org/jetbrains/kotlin/codegen/ImplementationBodyCodegen.java b/compiler/backend/src/org/jetbrains/kotlin/codegen/ImplementationBodyCodegen.java
index efec316..5d4fa4e 100644
--- a/compiler/backend/src/org/jetbrains/kotlin/codegen/ImplementationBodyCodegen.java
+++ b/compiler/backend/src/org/jetbrains/kotlin/codegen/ImplementationBodyCodegen.java
@@ -537,7 +537,7 @@
         public void generateEqualsMethod(@NotNull FunctionDescriptor function, @NotNull List<? extends PropertyDescriptor> properties) {
             MethodContext context = ImplementationBodyCodegen.this.context.intoFunction(function);
             MethodVisitor mv = v.newMethod(JvmDeclarationOriginKt.OtherOrigin(function), ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
-            mv.visitParameterAnnotation(0, Type.getDescriptor(Nullable.class), true);
+            mv.visitParameterAnnotation(0, Type.getDescriptor(Nullable.class), false);
             InstructionAdapter iv = new InstructionAdapter(mv);
 
             mv.visitCode();
@@ -645,7 +645,7 @@
         public void generateToStringMethod(@NotNull FunctionDescriptor function, @NotNull List<? extends PropertyDescriptor> properties) {
             MethodContext context = ImplementationBodyCodegen.this.context.intoFunction(function);
             MethodVisitor mv = v.newMethod(JvmDeclarationOriginKt.OtherOrigin(function), ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
-            mv.visitAnnotation(Type.getDescriptor(NotNull.class), true);
+            mv.visitAnnotation(Type.getDescriptor(NotNull.class), false);
             InstructionAdapter iv = new InstructionAdapter(mv);
 
             mv.visitCode();
