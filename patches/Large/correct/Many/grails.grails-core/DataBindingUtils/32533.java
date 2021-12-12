diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
index b32d1eb..125dfed 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/DataBindingUtils.java
@@ -208,7 +208,7 @@
             }
         }
         if (!useSpringBinder) {
-            final DataBindingSource bindingSource = createDataBindingSource(grailsApplication, object, source);
+            final DataBindingSource bindingSource = createDataBindingSource(grailsApplication, object.getClass(), source);
             final DataBinder gormAwareDataBinder = getGormAwareDataBinder(grailsApplication);
             final BindingResult tmpBindingResult = new BeanPropertyBindingResult(object, object.getClass().getName());
             final DataBindingListener listener = new GormAwareDataBindingListener(tmpBindingResult);
@@ -277,7 +277,7 @@
         return bindingResult;
     }
 
-    protected static DataBindingSource createDataBindingSource(GrailsApplication grailsApplication, Object bindingTarget, Object bindingSource) {
+    protected static DataBindingSource createDataBindingSource(GrailsApplication grailsApplication, Class bindingTargetType, Object bindingSource) {
         DataBindingSourceRegistry registry = null;
         MimeTypeResolver mimeTypeResolver = null;
         if(grailsApplication != null) {
@@ -295,7 +295,7 @@
             registry = new DefaultDataBindingSourceRegistry();
         }
         final MimeType mimeType = resolveMimeType(bindingSource, mimeTypeResolver);
-        return registry.createDataBindingSource(mimeType, bindingTarget, bindingSource);
+        return registry.createDataBindingSource(mimeType, bindingTargetType, bindingSource);
     }
 
     public static MimeType resolveMimeType(Object bindingSource, MimeTypeResolver mimeTypeResolver) {
