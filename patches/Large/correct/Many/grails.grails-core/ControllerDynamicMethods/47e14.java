diff --git a/src/web/org/codehaus/groovy/grails/web/metaclass/ControllerDynamicMethods.java b/src/web/org/codehaus/groovy/grails/web/metaclass/ControllerDynamicMethods.java
index e6f9b15..0f8842e 100644
--- a/src/web/org/codehaus/groovy/grails/web/metaclass/ControllerDynamicMethods.java
+++ b/src/web/org/codehaus/groovy/grails/web/metaclass/ControllerDynamicMethods.java
@@ -62,7 +62,7 @@
         addDynamicProperty(new GenericDynamicProperty(REQUEST_PROPERTY, HttpServletRequest.class,new GrailsHttpServletRequest( request,controller),true) );
         addDynamicProperty(new GenericDynamicProperty(RESPONSE_PROPERTY, HttpServletResponse.class,response,true) );
         addDynamicProperty(new GenericDynamicProperty(ERRORS_PROPERTY, Errors.class, null, false));
-        addDynamicProperty(new GenericDynamicProperty(MODEL_AND_VIEW, ModelAndView.class,null,false));
+        addDynamicProperty(new GenericDynamicProperty(MODEL_AND_VIEW_PROPERTY, ModelAndView.class,null,false));
 
         // add dynamic methods
         addDynamicMethodInvocation( new RedirectDynamicMethod(helper,request,response) );
