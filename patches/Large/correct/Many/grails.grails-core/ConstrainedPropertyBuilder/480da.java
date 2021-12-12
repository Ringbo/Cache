diff --git a/grails-validation/src/main/groovy/org/grails/validation/ConstrainedPropertyBuilder.java b/grails-validation/src/main/groovy/org/grails/validation/ConstrainedPropertyBuilder.java
index bdf4b13..9fae0a3 100644
--- a/grails-validation/src/main/groovy/org/grails/validation/ConstrainedPropertyBuilder.java
+++ b/grails-validation/src/main/groovy/org/grails/validation/ConstrainedPropertyBuilder.java
@@ -106,7 +106,7 @@
                 cp = (ConstrainedProperty)constrainedProperties.get(property);
             }
             else {
-                Class<?> propertyType = classPropertyFetcher.getPropertyType(property);
+                Class<?> propertyType = classPropertyFetcher.getPropertyType(property, true);
                 if (propertyType == null) {
                     throw new MissingMethodException(property, targetClass, new Object[]{attributes}, true);
                 }
