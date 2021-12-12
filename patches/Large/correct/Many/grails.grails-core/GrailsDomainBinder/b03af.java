diff --git a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
index b6653a9..3979984 100644
--- a/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
+++ b/src/persistence/org/codehaus/groovy/grails/orm/hibernate/cfg/GrailsDomainBinder.java
@@ -627,7 +627,7 @@
         if (config != null) {
             collection.setLazy(config.getLazy());
         } else {
-            collection.setLazy(true);
+            collection.setLazy(false);
         }
     }
 
