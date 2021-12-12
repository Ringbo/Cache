diff --git a/graylog2-server/src/main/java/org/graylog2/events/ClusterEventPeriodical.java b/graylog2-server/src/main/java/org/graylog2/events/ClusterEventPeriodical.java
index 78c404d..b79fccd 100644
--- a/graylog2-server/src/main/java/org/graylog2/events/ClusterEventPeriodical.java
+++ b/graylog2-server/src/main/java/org/graylog2/events/ClusterEventPeriodical.java
@@ -95,7 +95,7 @@
                 .asc("producer")
                 .asc("consumers"));
 
-        coll.setWriteConcern(WriteConcern.MAJORITY);
+        coll.setWriteConcern(WriteConcern.FSYNCED);
 
         return coll;
     }
@@ -180,7 +180,7 @@
         final ClusterEvent clusterEvent = ClusterEvent.create(nodeId.toString(), className, event);
 
         try {
-            final String id = dbCollection.save(clusterEvent).getSavedId();
+            final String id = dbCollection.save(clusterEvent, WriteConcern.FSYNCED).getSavedId();
             LOG.debug("Published cluster event with ID <{}> and type <{}>", id, className);
         } catch (MongoException e) {
             LOG.error("Couldn't publish cluster event of type <" + className + ">", e);
