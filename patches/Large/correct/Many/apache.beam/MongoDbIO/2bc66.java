diff --git a/sdks/java/io/mongodb/src/main/java/org/apache/beam/sdk/io/mongodb/MongoDbIO.java b/sdks/java/io/mongodb/src/main/java/org/apache/beam/sdk/io/mongodb/MongoDbIO.java
index 2729602..71c017d 100644
--- a/sdks/java/io/mongodb/src/main/java/org/apache/beam/sdk/io/mongodb/MongoDbIO.java
+++ b/sdks/java/io/mongodb/src/main/java/org/apache/beam/sdk/io/mongodb/MongoDbIO.java
@@ -224,7 +224,7 @@
       BasicDBObject stat = new BasicDBObject();
       stat.append("collStats", spec.collection());
       Document stats = mongoDatabase.runCommand(stat);
-      return Long.valueOf(stats.get("size").toString());
+      return Long.parseLong(stats.get("size").toString());
     }
 
     @Override
@@ -456,7 +456,7 @@
 
     private static class WriteFn extends DoFn<Document, Void> {
       private final Write spec;
-      private MongoClient client;
+      private transient MongoClient client;
       private List<Document> batch;
 
       public WriteFn(Write spec) {
