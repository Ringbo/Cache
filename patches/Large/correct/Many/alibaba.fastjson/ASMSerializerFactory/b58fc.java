diff --git a/src/main/java/com/alibaba/fastjson/serializer/ASMSerializerFactory.java b/src/main/java/com/alibaba/fastjson/serializer/ASMSerializerFactory.java
index 34d1c15..1dcf1e3 100755
--- a/src/main/java/com/alibaba/fastjson/serializer/ASMSerializerFactory.java
+++ b/src/main/java/com/alibaba/fastjson/serializer/ASMSerializerFactory.java
@@ -586,7 +586,7 @@
                 mw.visitLabel(forItemNullElse_);
 
                 Label forItemClassIfEnd_ = new Label(), forItemClassIfElse_ = new Label();
-                if (elementClass != null) {
+                if (elementClass != null && Modifier.isPublic(elementClass.getModifiers())) {
                     mw.visitVarInsn(ALOAD, context.var("list_item"));
                     mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                     mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(elementClass)));
@@ -697,7 +697,7 @@
                 mw.visitVarInsn(ASTORE, context.var("fied_ser"));
 
                 Label instanceOfElse_ = new Label(), instanceOfEnd_ = new Label();
-                if (context.writeDirect) {
+                if (context.writeDirect && Modifier.isPublic(fieldClass.getModifiers())) {
                     mw.visitVarInsn(ALOAD, context.var("fied_ser"));
                     mw.visitTypeInsn(INSTANCEOF, type(JavaBeanSerializer.class));
                     mw.visitJumpInsn(IFEQ, instanceOfElse_);
@@ -1482,7 +1482,7 @@
             mw.visitLabel(forItemNullElse_);
 
             Label forItemClassIfEnd_ = new Label(), forItemClassIfElse_ = new Label();
-            if (elementClass != null) {
+            if (elementClass != null && Modifier.isPublic(elementClass.getModifiers())) {
                 mw.visitVarInsn(ALOAD, context.var("list_item"));
                 mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                 mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(elementClass)));
@@ -1670,7 +1670,7 @@
         mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldName", "(Ljava/lang/String;Z)V");
 
         Label classIfEnd_ = new Label(), classIfElse_ = new Label();
-        if (!ParserConfig.isPrimitive(fieldClass)) {
+        if (Modifier.isPublic(fieldClass.getModifiers()) && !ParserConfig.isPrimitive(fieldClass)) {
             mw.visitVarInsn(ALOAD, context.var("object"));
             mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
             mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldClass)));
