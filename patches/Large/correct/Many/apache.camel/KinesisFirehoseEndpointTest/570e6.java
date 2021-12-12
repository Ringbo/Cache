diff --git a/components/camel-aws-kinesis/src/test/java/org/apache/camel/component/aws/firehose/KinesisFirehoseEndpointTest.java b/components/camel-aws-kinesis/src/test/java/org/apache/camel/component/aws/firehose/KinesisFirehoseEndpointTest.java
index fdc5025..5b99d11 100644
--- a/components/camel-aws-kinesis/src/test/java/org/apache/camel/component/aws/firehose/KinesisFirehoseEndpointTest.java
+++ b/components/camel-aws-kinesis/src/test/java/org/apache/camel/component/aws/firehose/KinesisFirehoseEndpointTest.java
@@ -41,7 +41,7 @@
     @Before
     public void setup() throws Exception {
         SimpleRegistry registry = new SimpleRegistry();
-        registry.put("firehoseClient", amazonKinesisFirehoseClient);
+        registry.bind("firehoseClient", amazonKinesisFirehoseClient);
         camelContext = new DefaultCamelContext(registry);
     }
 
