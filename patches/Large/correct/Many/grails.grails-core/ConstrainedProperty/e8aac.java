diff --git a/src/commons/org/codehaus/groovy/grails/validation/ConstrainedProperty.java b/src/commons/org/codehaus/groovy/grails/validation/ConstrainedProperty.java
index 93f09b5..2726df9 100644
--- a/src/commons/org/codehaus/groovy/grails/validation/ConstrainedProperty.java
+++ b/src/commons/org/codehaus/groovy/grails/validation/ConstrainedProperty.java
@@ -781,7 +781,7 @@
         }
 
         protected void processValidate(Object propertyValue, Errors errors) {
-            if(propertyValue.toString().matches( regex )) {
+            if(!propertyValue.toString().matches( regex )) {
                 Object[] args = new Object[] { constraintPropertyName, constraintOwningClass, propertyValue, regex  };
                 super.rejectValue(errors,MATCHES_CONSTRAINT + INVALID_SUFFIX,args,getDefaultMessage(DEFAULT_DOESNT_MATCH_MESSAGE_CODE, args));
             }
