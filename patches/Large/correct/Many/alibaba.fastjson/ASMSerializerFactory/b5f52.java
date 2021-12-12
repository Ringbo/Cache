diff --git a/src/main/java/com/alibaba/fastjson/serializer/ASMSerializerFactory.java b/src/main/java/com/alibaba/fastjson/serializer/ASMSerializerFactory.java
index 44ab970..f11e267 100644
--- a/src/main/java/com/alibaba/fastjson/serializer/ASMSerializerFactory.java
+++ b/src/main/java/com/alibaba/fastjson/serializer/ASMSerializerFactory.java
@@ -533,7 +533,7 @@
         mw.visitVarInsn(ALOAD, context.var("out"));
         mw.visitVarInsn(ILOAD, context.var("seperator"));
         mw.visitVarInsn(ALOAD, context.fieldName());
-        mw.visitVarInsn(LLOAD, context.var("long"));
+        mw.visitVarInsn(LLOAD, context.var("long", 2));
         mw.visitMethodInsn(INVOKEVIRTUAL, getType(SerializeWriter.class), "writeFieldValue", "(CLjava/lang/String;J)V");
 
         _seperator(mw, context);
@@ -566,14 +566,14 @@
 
         _nameApply(mw, property, context, _end);
         _get(mw, context, property);
-        mw.visitVarInsn(DSTORE, context.var("double"));
+        mw.visitVarInsn(DSTORE, context.var("double", 2));
 
         _filters(mw, property, context, _end);
 
         mw.visitVarInsn(ALOAD, context.var("out"));
         mw.visitVarInsn(ILOAD, context.var("seperator"));
         mw.visitVarInsn(ALOAD, context.fieldName());
-        mw.visitVarInsn(DLOAD, context.var("double"));
+        mw.visitVarInsn(DLOAD, context.var("double", 2));
         mw.visitMethodInsn(INVOKEVIRTUAL, getType(SerializeWriter.class), "writeFieldValue", "(CLjava/lang/String;D)V");
 
         _seperator(mw, context);
@@ -1080,7 +1080,7 @@
             mw.visitMethodInsn(INVOKESTATIC, getType(FilterUtils.class), "apply",
                                "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;C)Z");
         } else if (propertyClass == long.class) {
-            mw.visitVarInsn(LLOAD, context.var("long"));
+            mw.visitVarInsn(LLOAD, context.var("long", 2));
             mw.visitMethodInsn(INVOKESTATIC, getType(FilterUtils.class), "apply",
                                "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;J)Z");
         } else if (propertyClass == float.class) {
@@ -1088,7 +1088,7 @@
             mw.visitMethodInsn(INVOKESTATIC, getType(FilterUtils.class), "apply",
                                "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;F)Z");
         } else if (propertyClass == double.class) {
-            mw.visitVarInsn(DLOAD, context.var("double"));
+            mw.visitVarInsn(DLOAD, context.var("double", 2));
             mw.visitMethodInsn(INVOKESTATIC, getType(FilterUtils.class), "apply",
                                "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;D)Z");
         } else if (propertyClass == boolean.class) {
@@ -1138,13 +1138,13 @@
             mw.visitVarInsn(ILOAD, context.var("char"));
             mw.visitMethodInsn(INVOKESTATIC, getType(Character.class), "valueOf", "(C)Ljava/lang/Character;");
         } else if (propertyClass == long.class) {
-            mw.visitVarInsn(LLOAD, context.var("long"));
+            mw.visitVarInsn(LLOAD, context.var("long", 2));
             mw.visitMethodInsn(INVOKESTATIC, getType(Long.class), "valueOf", "(J)Ljava/lang/Long;");
         } else if (propertyClass == float.class) {
             mw.visitVarInsn(FLOAD, context.var("float"));
             mw.visitMethodInsn(INVOKESTATIC, getType(Float.class), "valueOf", "(F)Ljava/lang/Float;");
         } else if (propertyClass == double.class) {
-            mw.visitVarInsn(DLOAD, context.var("double"));
+            mw.visitVarInsn(DLOAD, context.var("double", 2));
             mw.visitMethodInsn(INVOKESTATIC, getType(Double.class), "valueOf", "(D)Ljava/lang/Double;");
         } else if (propertyClass == boolean.class) {
             mw.visitVarInsn(ILOAD, context.var("boolean"));
@@ -1196,7 +1196,7 @@
             mw.visitMethodInsn(INVOKESTATIC, getType(FilterUtils.class), "processKey",
                                "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;C)Ljava/lang/String;");
         } else if (propertyClass == long.class) {
-            mw.visitVarInsn(LLOAD, context.var("long"));
+            mw.visitVarInsn(LLOAD, context.var("long", 2));
             mw.visitMethodInsn(INVOKESTATIC, getType(FilterUtils.class), "processKey",
                                "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/String;");
         } else if (propertyClass == float.class) {
@@ -1204,7 +1204,7 @@
             mw.visitMethodInsn(INVOKESTATIC, getType(FilterUtils.class), "processKey",
                                "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;F)Ljava/lang/String;");
         } else if (propertyClass == double.class) {
-            mw.visitVarInsn(DLOAD, context.var("double"));
+            mw.visitVarInsn(DLOAD, context.var("double", 2));
             mw.visitMethodInsn(INVOKESTATIC, getType(FilterUtils.class), "processKey",
                                "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/String;D)Ljava/lang/String;");
         } else if (propertyClass == boolean.class) {
