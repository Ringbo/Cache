diff --git a/src/web/org/codehaus/groovy/grails/web/binding/GrailsDataBinder.java b/src/web/org/codehaus/groovy/grails/web/binding/GrailsDataBinder.java
index 1c02779..7205dfb 100644
--- a/src/web/org/codehaus/groovy/grails/web/binding/GrailsDataBinder.java
+++ b/src/web/org/codehaus/groovy/grails/web/binding/GrailsDataBinder.java
@@ -179,7 +179,7 @@
         for (int i = 0; i < valueArray.length; i++) {
             PropertyValue propertyValue = valueArray[i];
             if(propertyValue.getName().startsWith(prefix + PREFIX_SEPERATOR)){
-                newValues.addPropertyValue(propertyValue.getName().replace(prefix + PREFIX_SEPERATOR, ""), propertyValue.getValue());
+                newValues.addPropertyValue(propertyValue.getName().replaceFirst(prefix + PREFIX_SEPERATOR, ""), propertyValue.getValue());
             }
         }
         return newValues;
