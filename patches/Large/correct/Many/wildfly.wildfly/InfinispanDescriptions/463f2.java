diff --git a/clustering/infinispan/src/main/java/org/jboss/as/clustering/infinispan/subsystem/InfinispanDescriptions.java b/clustering/infinispan/src/main/java/org/jboss/as/clustering/infinispan/subsystem/InfinispanDescriptions.java
index 4e79441..2ad93d7 100644
--- a/clustering/infinispan/src/main/java/org/jboss/as/clustering/infinispan/subsystem/InfinispanDescriptions.java
+++ b/clustering/infinispan/src/main/java/org/jboss/as/clustering/infinispan/subsystem/InfinispanDescriptions.java
@@ -99,7 +99,7 @@
             attr.addResourceAttributeDescription(resources, keyPrefix, container);
         }
         // need to add value type until we replace with a ListAttribute
-        ALIAS.addResourceAttributeDescription(resources, keyPrefix, container).
+        ALIASES.addResourceAttributeDescription(resources, keyPrefix, container).
                 get(ModelDescriptionConstants.VALUE_TYPE).set(ModelType.STRING);
         // information about its child "singleton=transport"
         container.get(CHILDREN, ModelKeys.SINGLETON, DESCRIPTION).set(resources.getString(keyPrefix + ".singleton"));
@@ -139,7 +139,7 @@
             attr.addOperationParameterDescription(resources, "infinispan.container", op);
         }
         // need to add value type until we replace with a ListAttribute
-        ALIAS.addOperationParameterDescription(resources, "infinispan.container", op).
+        ALIASES.addOperationParameterDescription(resources, "infinispan.container", op).
                 get(ModelDescriptionConstants.VALUE_TYPE).set(ModelType.STRING);
         return op;
     }
