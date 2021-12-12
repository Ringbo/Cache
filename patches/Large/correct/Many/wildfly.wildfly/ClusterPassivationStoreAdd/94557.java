diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/subsystem/ClusterPassivationStoreAdd.java b/ejb3/src/main/java/org/jboss/as/ejb3/subsystem/ClusterPassivationStoreAdd.java
index 0e3569e..8e82e21 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/subsystem/ClusterPassivationStoreAdd.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/subsystem/ClusterPassivationStoreAdd.java
@@ -52,7 +52,7 @@
             config.setBeanCache(model.get(EJB3SubsystemModel.BEAN_CACHE).asString());
         }
         if (model.hasDefined(EJB3SubsystemModel.CLIENT_MAPPINGS_CACHE)) {
-            config.setBeanCache(model.get(EJB3SubsystemModel.CLIENT_MAPPINGS_CACHE).asString());
+            config.setClientMappingCache(model.get(EJB3SubsystemModel.CLIENT_MAPPINGS_CACHE).asString());
         }
         if (model.hasDefined(EJB3SubsystemModel.PASSIVATE_EVENTS_ON_REPLICATE)) {
             config.setPassivateEventsOnReplicate(model.get(EJB3SubsystemModel.PASSIVATE_EVENTS_ON_REPLICATE).asBoolean());
