diff --git a/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/StarTreeBootstrapAvroJob.java b/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/StarTreeBootstrapAvroJob.java
index 9bac77b..a340331 100644
--- a/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/StarTreeBootstrapAvroJob.java
+++ b/thirdeye-bootstrap/src/main/java/com/linkedin/thirdeye/bootstrap/StarTreeBootstrapAvroJob.java
@@ -164,7 +164,7 @@
     }
   }
 
-  public static class StarTreeBootstrapAvroReducer extends Reducer<Text, AvroKey<GenericRecord>, NullWritable, NullWritable>
+  public static class StarTreeBootstrapAvroReducer extends Reducer<Text, AvroValue<GenericRecord>, NullWritable, NullWritable>
   {
     private StarTreeConfig config;
     private int numTimeBuckets;
@@ -193,12 +193,12 @@
     }
 
     @Override
-    public void reduce(Text nodeId, Iterable<AvroKey<GenericRecord>> avroRecords, Context context) throws IOException, InterruptedException
+    public void reduce(Text nodeId, Iterable<AvroValue<GenericRecord>> avroRecords, Context context) throws IOException, InterruptedException
     {
       Map<String, Map<Long, StarTreeRecord>> records = new HashMap<String, Map<Long, StarTreeRecord>>();
 
       // Aggregate records
-      for (AvroKey<GenericRecord> avroRecord : avroRecords)
+      for (AvroValue<GenericRecord> avroRecord : avroRecords)
       {
         StarTreeRecord record = toStarTreeRecord(config, avroRecord.datum());
 
