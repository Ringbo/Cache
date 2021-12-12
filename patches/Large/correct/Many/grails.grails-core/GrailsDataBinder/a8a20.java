diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/GrailsDataBinder.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/GrailsDataBinder.java
index 6d083df..9ebfdd3 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/GrailsDataBinder.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/binding/GrailsDataBinder.java
@@ -273,7 +273,7 @@
         binder.registerCustomEditor(Locale.class, new LocaleEditor());
         binder.registerCustomEditor(TimeZone.class, new TimeZoneEditor());
         binder.registerCustomEditor(URI.class, new UriEditor());
-        DefaultConversionService conversionService = new DefaultConversionService();
+        GenericConversionService conversionService = new GenericConversionService();
         conversionService.addConverter(new GenericConverter(){
 
             @Override
@@ -495,7 +495,7 @@
     }
 
     private boolean isNotCandidateForBinding(Object value) {
-        return value instanceof GrailsParameterMap || value instanceof JSONObject || ((value instanceof Map) && ((Map)value).isEmpty());
+        return value instanceof GrailsParameterMap || value instanceof JSONObject;
     }
 
     private PropertyValues filterPropertyValues(PropertyValues propertyValues, String prefix) {
