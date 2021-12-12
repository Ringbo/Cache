diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
index 7b22289..e574068 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
@@ -207,7 +207,7 @@
         MetaClass mc = GroovySystem.getMetaClassRegistry().getMetaClass(object.getClass());
         if (mc.hasProperty(object, "errors")!=null && bindingResult!=null) {
             ValidationErrors errors = new ValidationErrors(object);
-            errors.addAllErrors(errors);
+            errors.addAllErrors(bindingResult);
             mc.setProperty(object,"errors", errors);
         }
         return bindingResult;
