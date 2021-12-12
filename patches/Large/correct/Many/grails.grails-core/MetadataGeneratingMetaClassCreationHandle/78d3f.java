diff --git a/src/java/org/codehaus/groovy/grails/documentation/MetadataGeneratingMetaClassCreationHandle.java b/src/java/org/codehaus/groovy/grails/documentation/MetadataGeneratingMetaClassCreationHandle.java
index d56a372..a34057d 100644
--- a/src/java/org/codehaus/groovy/grails/documentation/MetadataGeneratingMetaClassCreationHandle.java
+++ b/src/java/org/codehaus/groovy/grails/documentation/MetadataGeneratingMetaClassCreationHandle.java
@@ -31,7 +31,7 @@
 	 * @see groovy.lang.MetaClassRegistry.MetaClassCreationHandle#create(java.lang.Class, groovy.lang.MetaClassRegistry)
 	 */
 	protected MetaClass createNormalMetaClass(Class theClass, MetaClassRegistry registry) {
-		if(isExcludedClass(theClass)) {
+		if(!isExcludedClass(theClass)) {
 			return new MetadataGeneratingExpandoMetaClass(theClass);
 		}
 		else {
@@ -40,14 +40,14 @@
 	}
 
     public static boolean isExcludedClass(Class theClass) {
-        return theClass != MetadataGeneratingExpandoMetaClass.class
-                && theClass != ExpandoMetaClass.class
-                && theClass != DocumentationContext.class
-                && theClass != DocumentedMethod.class
-                && theClass != DocumentedProperty.class
-                && theClass != DocumentedElement.class
-                && theClass != DocumentationContextThreadLocal.class
-                && !Closure.class.isAssignableFrom(theClass);
+        return theClass == MetadataGeneratingExpandoMetaClass.class
+                && theClass == ExpandoMetaClass.class
+                && theClass == DocumentationContext.class
+                && theClass == DocumentedMethod.class
+                && theClass == DocumentedProperty.class
+                && theClass == DocumentedElement.class
+                && theClass == DocumentationContextThreadLocal.class
+                && Closure.class.isAssignableFrom(theClass);
     }
 
     /**
