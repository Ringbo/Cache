diff --git a/grails-core/src/main/groovy/org/codehaus/groovy/grails/commons/GrailsDomainConfigurationUtil.java b/grails-core/src/main/groovy/org/codehaus/groovy/grails/commons/GrailsDomainConfigurationUtil.java
index 1e80e99..e9f46a7 100644
--- a/grails-core/src/main/groovy/org/codehaus/groovy/grails/commons/GrailsDomainConfigurationUtil.java
+++ b/grails-core/src/main/groovy/org/codehaus/groovy/grails/commons/GrailsDomainConfigurationUtil.java
@@ -55,7 +55,7 @@
         String getterName = GrailsClassUtils.getGetterName(propertyName);
 
         try {
-            Method m = target.getClass().getDeclaredMethod(getterName, EMPTY_CLASS_ARRAY);
+            Method m = target.getClass().getMethod(getterName, EMPTY_CLASS_ARRAY);
             Object value = m.invoke(target);
             if (value != null && referencedDomainClass != null) {
                 String identifierGetter = GrailsClassUtils.getGetterName(referencedDomainClass.getIdentifier().getName());
