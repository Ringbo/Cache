diff --git a/components/camel-aws/src/test/java/org/apache/camel/component/aws/s3/S3ComponentFileTest.java b/components/camel-aws/src/test/java/org/apache/camel/component/aws/s3/S3ComponentFileTest.java
index 445abca..b32f3c9 100644
--- a/components/camel-aws/src/test/java/org/apache/camel/component/aws/s3/S3ComponentFileTest.java
+++ b/components/camel-aws/src/test/java/org/apache/camel/component/aws/s3/S3ComponentFileTest.java
@@ -88,7 +88,7 @@
 
         assertMockEndpointsSatisfied();
 
-        assertResultExchange(result.getExchanges().get(0), false);
+        assertResultExchange(result.getExchanges().get(0), true);
 
         PutObjectRequest putObjectRequest = client.putObjectRequests.get(0);
         assertEquals(getCamelBucket(), putObjectRequest.getBucketName());
