diff --git a/src/main/org/codehaus/groovy/runtime/ProxyGeneratorAdapter.java b/src/main/org/codehaus/groovy/runtime/ProxyGeneratorAdapter.java
index 4d7eb30..38dea05 100644
--- a/src/main/org/codehaus/groovy/runtime/ProxyGeneratorAdapter.java
+++ b/src/main/org/codehaus/groovy/runtime/ProxyGeneratorAdapter.java
@@ -702,7 +702,7 @@
         Type[] args = Type.getArgumentTypes(desc);
         BytecodeHelper.pushConstant(mv, args.length);
         mv.visitTypeInsn(ANEWARRAY, "java/lang/Object");
-        size = 3;
+        size = 6;
         int idx = 1;
         for (int i = 0; i < args.length; i++) {
             Type arg = args[i];
@@ -716,7 +716,7 @@
             } else {
                 mv.visitVarInsn(ALOAD, idx); // load argument i
             }
-            size = Math.max(6, 5+registerLen(arg));
+            size = Math.max(size, 5+registerLen(arg));
             idx += registerLen(arg);
             mv.visitInsn(AASTORE); // store value into array
         }
