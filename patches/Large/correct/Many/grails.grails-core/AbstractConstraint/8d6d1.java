diff --git a/src/java/org/codehaus/groovy/grails/validation/AbstractConstraint.java b/src/java/org/codehaus/groovy/grails/validation/AbstractConstraint.java
index 3b8ce49..052545c 100644
--- a/src/java/org/codehaus/groovy/grails/validation/AbstractConstraint.java
+++ b/src/java/org/codehaus/groovy/grails/validation/AbstractConstraint.java
@@ -189,7 +189,7 @@
     private Object getPropertyValue(Errors errors, Object target) {
         try {
             return errors.getFieldValue( constraintPropertyName );
-        } catch (NotReadablePropertyException nre) {
+        } catch (Exception nre) {
             int i = constraintPropertyName.lastIndexOf(".");
             String propertyName;
             if(i > -1) {
