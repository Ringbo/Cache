diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
index 63cdec9..1c5d8b6 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
@@ -212,7 +212,7 @@
             }
             final DataBinder gormAwareDataBinder = createGormAwareDataBinder(grailsApplication);
             final BindingResult tmpBindingResult = new BeanPropertyBindingResult(object, object.getClass().getName());
-            final DataBindingListener listener = new GormAwareDataBindindingListener(tmpBindingResult);
+            final DataBindingListener listener = new GormAwareDataBindingListener(tmpBindingResult);
             gormAwareDataBinder.bind(object, bindingSource, filter, include, exclude, listener);
             bindingResult = tmpBindingResult;
         } else {
