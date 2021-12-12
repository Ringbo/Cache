diff --git a/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaConsumerIdleMessageTest.java b/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaConsumerIdleMessageTest.java
index c50c58d..5d745ed 100644
--- a/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaConsumerIdleMessageTest.java
+++ b/components/camel-jpa/src/test/java/org/apache/camel/component/jpa/JpaConsumerIdleMessageTest.java
@@ -29,7 +29,7 @@
     
     @Test
     public void testConsumeIdleMessages() throws Exception {
-        Thread.sleep(110);
+        Thread.sleep(130);
         MockEndpoint mock = getMockEndpoint("mock:result");
         mock.expectedMinimumMessageCount(2);
         assertMockEndpointsSatisfied();
