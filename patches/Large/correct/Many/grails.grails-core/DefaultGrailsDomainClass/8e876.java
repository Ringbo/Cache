diff --git a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsDomainClass.java b/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsDomainClass.java
index b528ad4..3d55668 100644
--- a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsDomainClass.java
+++ b/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsDomainClass.java
@@ -64,7 +64,7 @@
            !Modifier.isAbstract(clazz.getSuperclass().getModifiers())) {
             this.root = false;
         }
-        this.propertyMap = new TreeMap();
+        this.propertyMap = new LinkedHashMap();
         this.relationshipMap = getAssociationMap();
         this.embedded = getEmbeddedList();
 
