diff --git a/components/camel-aws-s3/src/test/java/org/apache/camel/component/aws/s3/S3ComponentGetObjectTest.java b/components/camel-aws-s3/src/test/java/org/apache/camel/component/aws/s3/S3ComponentGetObjectTest.java
index c736d0e..ee239a9 100644
--- a/components/camel-aws-s3/src/test/java/org/apache/camel/component/aws/s3/S3ComponentGetObjectTest.java
+++ b/components/camel-aws-s3/src/test/java/org/apache/camel/component/aws/s3/S3ComponentGetObjectTest.java
@@ -38,7 +38,7 @@
 
     @Test
     public void sendIn() throws Exception {
-        result.expectedMessageCount(0);
+        result.expectedMessageCount(1);
 
         template.send("direct:getObject", new Processor() {
 
