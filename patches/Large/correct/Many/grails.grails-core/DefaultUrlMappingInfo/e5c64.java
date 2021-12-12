diff --git a/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingInfo.java b/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingInfo.java
index 8e79f2a..dd1d82c 100644
--- a/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingInfo.java
+++ b/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingInfo.java
@@ -136,7 +136,7 @@
     }
 
     private String evaluateNameForValue(Object value) {
-        GrailsWebRequest webRequest = (GrailsWebRequest) RequestContextHolder.currentRequestAttributes();
+        GrailsWebRequest webRequest = (GrailsWebRequest) RequestContextHolder.getRequestAttributes();
         if(value == null) {
             return null;
         }
@@ -153,7 +153,7 @@
         else {
             name = value.toString();
         }
-        if(StringUtils.isBlank(name))
+        if(StringUtils.isBlank(name) && webRequest !=null)
             return checkDispatchAction(webRequest.getRequest(), name);
         else
             return name;
