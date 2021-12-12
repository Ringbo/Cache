diff --git a/dubbo-filter/dubbo-filter-validation/src/main/java/com/alibaba/dubbo/validation/support/jvalidation/JValidator.java b/dubbo-filter/dubbo-filter-validation/src/main/java/com/alibaba/dubbo/validation/support/jvalidation/JValidator.java
index e92ad65..8d607ed 100644
--- a/dubbo-filter/dubbo-filter-validation/src/main/java/com/alibaba/dubbo/validation/support/jvalidation/JValidator.java
+++ b/dubbo-filter/dubbo-filter-validation/src/main/java/com/alibaba/dubbo/validation/support/jvalidation/JValidator.java
@@ -150,7 +150,7 @@
                     ctField.getFieldInfo().addAttribute(attribute);
                     ctClass.addField(ctField);
                 }
-                parameterClass = ctClass.toClass();
+                parameterClass = ctClass.toClass(clazz.getClassLoader(), null);
             }
             Object parameterBean = parameterClass.newInstance();
             for (int i = 0; i < args.length; i++) {
