diff --git a/sdk/src/main/java/com/google/cloud/dataflow/sdk/io/AvroSource.java b/sdk/src/main/java/com/google/cloud/dataflow/sdk/io/AvroSource.java
index da8458c..297663e 100644
--- a/sdk/src/main/java/com/google/cloud/dataflow/sdk/io/AvroSource.java
+++ b/sdk/src/main/java/com/google/cloud/dataflow/sdk/io/AvroSource.java
@@ -242,7 +242,7 @@
   }
 
   @Override
-  public AvroSource<T> createForSubrangeOfFile(String fileName, long start, long end) {
+  public BlockBasedSource<T> createForSubrangeOfFile(String fileName, long start, long end) {
     byte[] syncMarker = this.syncMarker;
     String codec = this.codec;
     String readSchemaString = this.readSchemaString;
@@ -274,7 +274,7 @@
   }
 
   @Override
-  public AvroReader<T> createSingleFileReader(PipelineOptions options) {
+  protected BlockBasedReader<T> createSingleFileReader(PipelineOptions options) {
     return new AvroReader<T>(this);
   }
 
