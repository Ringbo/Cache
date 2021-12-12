diff --git a/src/commons/org/codehaus/groovy/grails/commons/AbstractGrailsClass.java b/src/commons/org/codehaus/groovy/grails/commons/AbstractGrailsClass.java
index 7d8b83b..9b4fc57 100644
--- a/src/commons/org/codehaus/groovy/grails/commons/AbstractGrailsClass.java
+++ b/src/commons/org/codehaus/groovy/grails/commons/AbstractGrailsClass.java
@@ -114,7 +114,7 @@
 	}
 
     public String getPropertyName() {
-        return GrailsClassUtils.getPropertyNameRepresentation(getName());
+        return GrailsClassUtils.getPropertyNameRepresentation(getShortName());
     }
 
     public String getPackageName() {
