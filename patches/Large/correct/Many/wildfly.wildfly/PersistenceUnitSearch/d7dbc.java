diff --git a/jpa/core/src/main/java/org/jboss/as/jpa/container/PersistenceUnitSearch.java b/jpa/core/src/main/java/org/jboss/as/jpa/container/PersistenceUnitSearch.java
index 60eb130..11114f8 100644
--- a/jpa/core/src/main/java/org/jboss/as/jpa/container/PersistenceUnitSearch.java
+++ b/jpa/core/src/main/java/org/jboss/as/jpa/container/PersistenceUnitSearch.java
@@ -188,7 +188,7 @@
         }
 
 
-        throw MESSAGES.deploymentUnitNotFound(absolutePath, puName, current);
+        throw MESSAGES.persistenceUnitNotFound(absolutePath, puName, current);
     }
 }
 
