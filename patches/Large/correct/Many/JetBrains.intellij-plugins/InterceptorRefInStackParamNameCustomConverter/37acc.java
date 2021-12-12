diff --git a/struts2/plugin/src/com/intellij/struts2/dom/params/custom/InterceptorRefInStackParamNameCustomConverter.java b/struts2/plugin/src/com/intellij/struts2/dom/params/custom/InterceptorRefInStackParamNameCustomConverter.java
index 8a145e1..1470141 100644
--- a/struts2/plugin/src/com/intellij/struts2/dom/params/custom/InterceptorRefInStackParamNameCustomConverter.java
+++ b/struts2/plugin/src/com/intellij/struts2/dom/params/custom/InterceptorRefInStackParamNameCustomConverter.java
@@ -84,7 +84,7 @@
       return ArrayUtil.toObjectArray(customReferences, PsiReference.class);
     }
 
-    final String propertyText = text.substring(idx + 1, text.length());
+    final String propertyText = text.substring(idx + 1);
     final PsiClass paramsClass = resolvedInterceptorRef.getParamsClass();
     final BeanPropertyPathReferenceSet beanPropertyPathReferenceSet =
         new BeanPropertyPathReferenceSet(propertyText, nameAttributeValue, idx + 2, '.', paramsClass, false);
