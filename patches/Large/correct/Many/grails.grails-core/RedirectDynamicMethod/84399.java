diff --git a/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/web/metaclass/RedirectDynamicMethod.java b/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/web/metaclass/RedirectDynamicMethod.java
index 0df6f63..261a9c3 100644
--- a/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/web/metaclass/RedirectDynamicMethod.java
+++ b/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/web/metaclass/RedirectDynamicMethod.java
@@ -128,7 +128,7 @@
         // if there are errors add it to the list of errors
         Errors controllerErrors = (Errors)controller.getProperty(ControllerDynamicMethods.ERRORS_PROPERTY);
         Errors errors = (Errors)argMap.get(ARGUMENT_ERRORS);
-        if (controllerErrors != null) {
+        if (controllerErrors != null && errors != null) {
             controllerErrors.addAllErrors(errors);
         }
         else {
