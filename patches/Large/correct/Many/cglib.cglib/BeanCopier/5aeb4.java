diff --git a/cglib/src/main/java/net/sf/cglib/beans/BeanCopier.java b/cglib/src/main/java/net/sf/cglib/beans/BeanCopier.java
index 221e55f..67b49ee 100644
--- a/cglib/src/main/java/net/sf/cglib/beans/BeanCopier.java
+++ b/cglib/src/main/java/net/sf/cglib/beans/BeanCopier.java
@@ -109,7 +109,7 @@
             EmitUtils.null_constructor(ce);
             CodeEmitter e = ce.begin_method(Constants.ACC_PUBLIC, COPY, null);
             PropertyDescriptor[] getters = ReflectUtils.getBeanGetters(source);
-            PropertyDescriptor[] setters = ReflectUtils.getBeanGetters(target);
+            PropertyDescriptor[] setters = ReflectUtils.getBeanSetters(target);
 
             Map names = new HashMap();
             for (int i = 0; i < getters.length; i++) {
