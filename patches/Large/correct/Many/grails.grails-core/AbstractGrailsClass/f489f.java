diff --git a/grails-core/src/main/groovy/org/grails/core/AbstractGrailsClass.java b/grails-core/src/main/groovy/org/grails/core/AbstractGrailsClass.java
index 32c638e..1cf1ff8 100644
--- a/grails-core/src/main/groovy/org/grails/core/AbstractGrailsClass.java
+++ b/grails-core/src/main/groovy/org/grails/core/AbstractGrailsClass.java
@@ -247,7 +247,7 @@
      * @return The property value or null
      */
     public <T> T getPropertyValue(String propName, Class<T> type) {
-        return ClassPropertyFetcher.getStaticPropertyValue(getClazz(), name, type);
+        return ClassPropertyFetcher.getStaticPropertyValue(getClazz(), propName, type);
     }
 
 
