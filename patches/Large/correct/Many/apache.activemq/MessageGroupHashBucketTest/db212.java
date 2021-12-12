diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/broker/region/group/MessageGroupHashBucketTest.java b/activemq-unit-tests/src/test/java/org/apache/activemq/broker/region/group/MessageGroupHashBucketTest.java
index 66520c9..fc35be6 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/broker/region/group/MessageGroupHashBucketTest.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/broker/region/group/MessageGroupHashBucketTest.java
@@ -24,7 +24,7 @@
 public class MessageGroupHashBucketTest extends MessageGroupMapTest {
 
     protected MessageGroupMap createMessageGroupMap() {
-        return new MessageGroupHashBucket(1024);
+        return new MessageGroupHashBucket(1024, 64);
     }
 
 }
