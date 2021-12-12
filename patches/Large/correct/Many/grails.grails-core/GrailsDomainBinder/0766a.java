diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
index 190dfd7..3795954 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
@@ -857,12 +857,12 @@
 
     private static void bindIdentity(GrailsDomainClass domainClass, RootClass root, Mappings mappings, Mapping gormMapping) {
         if(gormMapping != null) {
-            Identity id = gormMapping.getIdentity();
+            Object id = gormMapping.getIdentity();
             if(id instanceof CompositeIdentity){
                 bindCompositeId(domainClass, root, (CompositeIdentity)id, gormMapping, mappings);
             }
             else {
-                bindSimpleId( domainClass.getIdentifier(), root, mappings, id );
+                bindSimpleId( domainClass.getIdentifier(), root, mappings, (Identity)id );
             }
 
         }
@@ -979,7 +979,7 @@
 
     private static boolean isCompositeIdProperty(Mapping gormMapping, GrailsDomainClassProperty currentGrailsProp) {
         if(gormMapping != null && gormMapping.getIdentity() != null) {
-            Identity id = gormMapping.getIdentity();
+            Object id = gormMapping.getIdentity();
             if(id instanceof CompositeIdentity) {
                 CompositeIdentity cid = (CompositeIdentity)id;
                 if(ArrayUtils.contains(cid.getPropertyNames(), currentGrailsProp.getName()))
