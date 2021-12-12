diff --git a/src/main/org/codehaus/groovy/classgen/Verifier.java b/src/main/org/codehaus/groovy/classgen/Verifier.java
index 1c1d2fe..8b5085c 100644
--- a/src/main/org/codehaus/groovy/classgen/Verifier.java
+++ b/src/main/org/codehaus/groovy/classgen/Verifier.java
@@ -103,7 +103,7 @@
           _staticMetaClassFieldName = _staticMetaClassFieldName + "$";
         final String staticMetaClassFieldName = _staticMetaClassFieldName;
 
-        FieldNode staticMetaClassField = node.addField(staticMetaClassFieldName, ACC_PUBLIC|ACC_STATIC, ClassHelper.make(SoftReference.class), null);
+        FieldNode staticMetaClassField = node.addField(staticMetaClassFieldName, ACC_PUBLIC|ACC_STATIC, ClassHelper.make(SoftReference.class,false), null);
         staticMetaClassField.setSynthetic(true);
 
         List getStaticMetaClassCode = new LinkedList();
