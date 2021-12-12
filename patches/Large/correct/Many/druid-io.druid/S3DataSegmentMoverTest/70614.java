diff --git a/s3-extensions/src/test/java/io/druid/storage/s3/S3DataSegmentMoverTest.java b/s3-extensions/src/test/java/io/druid/storage/s3/S3DataSegmentMoverTest.java
index 6206da8..c13d22d 100644
--- a/s3-extensions/src/test/java/io/druid/storage/s3/S3DataSegmentMoverTest.java
+++ b/s3-extensions/src/test/java/io/druid/storage/s3/S3DataSegmentMoverTest.java
@@ -62,7 +62,7 @@
   public void testMove() throws Exception
   {
     MockStorageService mockS3Client = new MockStorageService();
-    S3DataSegmentMover mover = new S3DataSegmentMover(mockS3Client);
+    S3DataSegmentMover mover = new S3DataSegmentMover(mockS3Client, new S3DataSegmentPusherConfig());
 
     mockS3Client.putObject("main", new S3Object("baseKey/test/2013-01-01T00:00:00.000Z_2013-01-02T00:00:00.000Z/1/0/index.zip"));
     mockS3Client.putObject("main", new S3Object("baseKey/test/2013-01-01T00:00:00.000Z_2013-01-02T00:00:00.000Z/1/0/descriptor.json"));
@@ -82,7 +82,7 @@
   public void testMoveNoop() throws Exception
   {
     MockStorageService mockS3Client = new MockStorageService();
-    S3DataSegmentMover mover = new S3DataSegmentMover(mockS3Client);
+    S3DataSegmentMover mover = new S3DataSegmentMover(mockS3Client, new S3DataSegmentPusherConfig());
 
     mockS3Client.putObject("archive", new S3Object("targetBaseKey/test/2013-01-01T00:00:00.000Z_2013-01-02T00:00:00.000Z/1/0/index.zip"));
     mockS3Client.putObject("archive", new S3Object("targetBaseKey/test/2013-01-01T00:00:00.000Z_2013-01-02T00:00:00.000Z/1/0/descriptor.json"));
@@ -103,7 +103,7 @@
   public void testMoveException() throws Exception
   {
     MockStorageService mockS3Client = new MockStorageService();
-    S3DataSegmentMover mover = new S3DataSegmentMover(mockS3Client);
+    S3DataSegmentMover mover = new S3DataSegmentMover(mockS3Client, new S3DataSegmentPusherConfig());
 
     mover.move(
         sourceSegment,
