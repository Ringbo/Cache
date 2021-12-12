diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
index aa71dd0..30de441 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
@@ -1506,7 +1506,7 @@
         if (config != null) {
             manyToOne.setLazy(config.getLazy());
         } else {
-            manyToOne.setLazy(false);
+            manyToOne.setLazy(true);
         }
         // set referenced entity
         manyToOne.setReferencedEntityName(property.getReferencedPropertyType().getName());
