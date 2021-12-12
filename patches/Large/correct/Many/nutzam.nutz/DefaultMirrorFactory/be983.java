diff --git a/src/org/nutz/ioc/aop/impl/DefaultMirrorFactory.java b/src/org/nutz/ioc/aop/impl/DefaultMirrorFactory.java
index 774bf5c..d062a35 100644
--- a/src/org/nutz/ioc/aop/impl/DefaultMirrorFactory.java
+++ b/src/org/nutz/ioc/aop/impl/DefaultMirrorFactory.java
@@ -46,7 +46,8 @@
         if (MethodInterceptor.class.isAssignableFrom(type)
             || type.getName().endsWith(ClassAgent.CLASSNAME_SUFFIX)
             || (name != null && name.startsWith(AopConfigration.IOCNAME))
-            || AopConfigration.class.isAssignableFrom(type)) {
+            || AopConfigration.class.isAssignableFrom(type)
+            || Modifier.isAbstract(type.getModifiers())) {
             return Mirror.me(type);
         }
 
