diff --git a/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManager.java b/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManager.java
index c709909..98f7351 100644
--- a/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManager.java
+++ b/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManager.java
@@ -1526,7 +1526,7 @@
                             .replaceAll("\\\\", "/");
 
                     ObjectMetadata metadata = new ObjectMetadata();
-                    ObjectTagging objectTagging = new ObjectTagging();
+                    ObjectTagging objectTagging = new ObjectTagging(new ArrayList<Tag>());
 
                     // Invoke the callback if it's present.
                     // The callback allows the user to customize the metadata
