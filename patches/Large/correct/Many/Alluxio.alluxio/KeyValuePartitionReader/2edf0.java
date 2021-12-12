diff --git a/keyvalue/client/src/main/java/alluxio/client/keyvalue/KeyValuePartitionReader.java b/keyvalue/client/src/main/java/alluxio/client/keyvalue/KeyValuePartitionReader.java
index b7d7a50..006f492 100644
--- a/keyvalue/client/src/main/java/alluxio/client/keyvalue/KeyValuePartitionReader.java
+++ b/keyvalue/client/src/main/java/alluxio/client/keyvalue/KeyValuePartitionReader.java
@@ -43,7 +43,7 @@
      */
     public static KeyValuePartitionReader create(AlluxioURI uri)
         throws AlluxioException, IOException {
-      Preconditions.checkNotNull(uri);
+      Preconditions.checkNotNull(uri, "uri");
       FileSystem fs = FileSystem.Factory.get();
       List<Long> blockIds = fs.getStatus(uri).getBlockIds();
       // Each partition file should only contain one block.
