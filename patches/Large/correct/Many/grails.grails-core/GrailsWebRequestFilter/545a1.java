diff --git a/grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/GrailsWebRequestFilter.java b/grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/GrailsWebRequestFilter.java
index f15c9ee..c025eca 100644
--- a/grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/GrailsWebRequestFilter.java
+++ b/grails-web-mvc/src/main/groovy/org/grails/web/servlet/mvc/GrailsWebRequestFilter.java
@@ -62,7 +62,7 @@
         try {
             WebUtils.storeGrailsWebRequest(webRequest);
 
-            if(!WebUtils.isForward(request)) {
+            if(!WebUtils.isForwardOrInclude(request)) {
                 // Set the flash scope instance to its next state. We do
                 // this here so that the flash is available from Grails
                 // filters in a valid state.
