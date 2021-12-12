diff --git a/components/camel-aws-kinesis/src/test/java/org/apache/camel/component/aws/kinesis/KinesisEndpointTest.java b/components/camel-aws-kinesis/src/test/java/org/apache/camel/component/aws/kinesis/KinesisEndpointTest.java
index 1e1e3a8..c140753 100644
--- a/components/camel-aws-kinesis/src/test/java/org/apache/camel/component/aws/kinesis/KinesisEndpointTest.java
+++ b/components/camel-aws-kinesis/src/test/java/org/apache/camel/component/aws/kinesis/KinesisEndpointTest.java
@@ -41,7 +41,7 @@
     @Before
     public void setup() throws Exception {
         SimpleRegistry registry = new SimpleRegistry();
-        registry.put("kinesisClient", amazonKinesisClient);
+        registry.bind("kinesisClient", amazonKinesisClient);
         camelContext = new DefaultCamelContext(registry);
     }
 
