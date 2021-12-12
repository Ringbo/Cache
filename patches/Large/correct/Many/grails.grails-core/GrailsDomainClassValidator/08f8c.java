diff --git a/grails-core/src/main/groovy/org/codehaus/groovy/grails/validation/GrailsDomainClassValidator.java b/grails-core/src/main/groovy/org/codehaus/groovy/grails/validation/GrailsDomainClassValidator.java
index 1e701a1..b9e23f8 100644
--- a/grails-core/src/main/groovy/org/codehaus/groovy/grails/validation/GrailsDomainClassValidator.java
+++ b/grails-core/src/main/groovy/org/codehaus/groovy/grails/validation/GrailsDomainClassValidator.java
@@ -157,7 +157,7 @@
         if (collection instanceof List || collection instanceof SortedSet) {
             int idx = 0;
              for (Object associatedObject : ((Collection)collection)) {
-                cascadeValidationToOne(errors, bean,associatedObject, persistentProperty, propertyName + "[" + (idx++) + "]");
+                cascadeValidationToOne(errors, bean,associatedObject, persistentProperty, propertyName + "[" + (idx++) + "]", idx);
             }
         }
         if (collection instanceof Collection) {
@@ -203,6 +203,7 @@
      * @param associatedObject The associated object's current value
      * @param persistentProperty The GrailsDomainClassProperty instance
      * @param propertyName The name of the property
+     * @param indexOrKey
      */
     @SuppressWarnings("rawtypes")
     protected void cascadeValidationToOne(Errors errors, BeanWrapper bean, Object associatedObject,
