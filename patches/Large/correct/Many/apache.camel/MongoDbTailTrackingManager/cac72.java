diff --git a/components/camel-mongodb/src/main/java/org/apache/camel/component/mongodb/MongoDbTailTrackingManager.java b/components/camel-mongodb/src/main/java/org/apache/camel/component/mongodb/MongoDbTailTrackingManager.java
index a8bf157..96637ef 100644
--- a/components/camel-mongodb/src/main/java/org/apache/camel/component/mongodb/MongoDbTailTrackingManager.java
+++ b/components/camel-mongodb/src/main/java/org/apache/camel/component/mongodb/MongoDbTailTrackingManager.java
@@ -52,7 +52,7 @@
         trackingObj = dbCol.findOne(filter);
         if (trackingObj == null) {
             dbCol.insert(filter, WriteConcern.SAFE);
-            trackingObj = dbCol.findOne();
+            trackingObj = dbCol.findOne(filter);
         }
         // keep only the _id, the rest is useless and causes more overhead during update
         trackingObj = new BasicDBObject("_id", trackingObj.get("_id"));
