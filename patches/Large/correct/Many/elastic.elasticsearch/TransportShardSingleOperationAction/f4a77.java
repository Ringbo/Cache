diff --git a/src/main/java/org/elasticsearch/action/support/single/shard/TransportShardSingleOperationAction.java b/src/main/java/org/elasticsearch/action/support/single/shard/TransportShardSingleOperationAction.java
index d1cda61..980f405 100644
--- a/src/main/java/org/elasticsearch/action/support/single/shard/TransportShardSingleOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/single/shard/TransportShardSingleOperationAction.java
@@ -326,7 +326,7 @@
         @Override
         public void writeTo(StreamOutput out) throws IOException {
             super.writeTo(out);
-            if (out.getVersion().onOrBefore(Version.V_1_4_0)) {
+            if (out.getVersion().before(Version.V_1_4_0)) {
                 //older nodes expect the concrete index as part of the request
                 request.index(shardId.getIndex());
             }
