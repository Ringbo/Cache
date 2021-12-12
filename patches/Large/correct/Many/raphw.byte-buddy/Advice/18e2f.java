diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/asm/Advice.java b/byte-buddy-dep/src/main/java/net/bytebuddy/asm/Advice.java
index a7f3762..3c76fc1 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/asm/Advice.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/asm/Advice.java
@@ -7416,7 +7416,7 @@
                 if (doesReturn) {
                     stackMapFrameHandler.injectReturnFrame(methodVisitor);
                     if (!returnType.equals(Type.VOID_TYPE)) {
-                        methodVisitor.visitVarInsn(returnType.getOpcode(Opcodes.ISTORE), offsetHandler.enter());
+                        methodVisitor.visitVarInsn(returnType.getOpcode(Opcodes.ISTORE), offsetHandler.returned());
                     }
                 }
                 onUserReturn();
@@ -7425,7 +7425,7 @@
                 if (returnType.equals(Type.VOID_TYPE)) {
                     methodVisitor.visitInsn(Opcodes.RETURN);
                 } else {
-                    methodVisitor.visitVarInsn(returnType.getOpcode(Opcodes.ILOAD), offsetHandler.enter());
+                    methodVisitor.visitVarInsn(returnType.getOpcode(Opcodes.ILOAD), offsetHandler.returned());
                     methodVisitor.visitInsn(returnType.getOpcode(Opcodes.IRETURN));
                 }
             }
