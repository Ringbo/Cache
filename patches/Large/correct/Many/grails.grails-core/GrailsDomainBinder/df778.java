diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
index 3ead453..fbcdf44 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
@@ -338,7 +338,7 @@
 
             GrailsDomainClass referenced = property.getReferencedDomainClass();
             Mapping m = getRootMapping(referenced);
-            boolean tablePerSubclass = m != null && !m.isTablePerHierarchy();
+            boolean tablePerSubclass = m != null && !m.getTablePerHierarchy();
 
             if(referenced != null && !referenced.isRoot() && !tablePerSubclass) {
                 // NOTE: Work around for http://opensource.atlassian.com/projects/hibernate/browse/HHH-2855
@@ -483,7 +483,7 @@
     private static void bindUnidirectionalOneToManyInverseValues(GrailsDomainClassProperty property, ManyToOne manyToOne) {
         ColumnConfig cc = getColumnConfig(property);
         if(cc != null) {
-           manyToOne.setLazy(cc.isLazy());
+           manyToOne.setLazy(cc.getLazy());
         }
         else {
             manyToOne.setLazy(true);
@@ -497,7 +497,7 @@
 
     private static void bindCollectionForColumnConfig(Collection collection, ColumnConfig cc) {
         if(cc!=null) {
-            collection.setLazy(cc.isLazy());
+            collection.setLazy(cc.getLazy());
         }
         else {
             collection.setLazy(true);
@@ -916,7 +916,7 @@
 
             if(m!=null) {
                 CacheConfig cc = m.getCache();
-                if(cc != null && cc.isEnabled()) {
+                if(cc != null && cc.getEnabled()) {
                     root.setCacheConcurrencyStrategy(cc.getUsage());
                     root.setLazyPropertiesCacheable(!"non-lazy".equals(cc.getInclude()));
                 }
@@ -925,7 +925,7 @@
             bindRootPersistentClassCommonValues(domainClass, root, mappings);
 
 			if(!domainClass.getSubClasses().isEmpty()) {
-                boolean tablePerSubclass = m != null && !m.isTablePerHierarchy();
+                boolean tablePerSubclass = m != null && !m.getTablePerHierarchy();
                 if(!tablePerSubclass) {
                     // if the root class has children create a discriminator property
                     bindDiscriminatorProperty(root.getTable(), root, mappings);
@@ -970,7 +970,7 @@
         evaluateMapping(sub);
         Mapping m = getMapping(parent.getClassName());
         Subclass subClass;
-        boolean tablePerSubclass = m != null && !m.isTablePerHierarchy();
+        boolean tablePerSubclass = m != null && !m.getTablePerHierarchy();
         if(tablePerSubclass) {
             subClass = new JoinedSubclass(parent);
         }
@@ -1138,7 +1138,7 @@
         bindIdentity(domainClass, root, mappings, m);
 
         if(m != null) {
-            if(m.isVersioned()) {
+            if(m.getVersioned()) {
                 bindVersion( domainClass.getVersion(), root, mappings );
             }
         }
@@ -1426,7 +1426,7 @@
         ColumnConfig cc = getColumnConfig(grailsProperty);
 
         if(cc != null) {
-           prop.setLazy(cc.isLazy());
+           prop.setLazy(cc.getLazy());
         }
         else if(grailsProperty.isManyToOne() || grailsProperty.isOneToOne()) {
             prop.setLazy(true);
@@ -1496,7 +1496,7 @@
                 ForeignKeyDirection.FOREIGN_KEY_TO_PARENT );
 
         if(cc != null) {
-           oneToOne.setLazy(cc.isLazy());
+           oneToOne.setLazy(cc.getLazy());
         }
         else {
             oneToOne.setLazy(false);
@@ -1516,7 +1516,7 @@
         ColumnConfig cc = getColumnConfig(property);
 
         if(cc != null) {
-           manyToOne.setLazy(cc.isLazy());
+           manyToOne.setLazy(cc.getLazy());
         }
         else {
             manyToOne.setLazy(false);
