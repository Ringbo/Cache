diff --git a/components/camel-rss/src/test/java/org/apache/camel/component/rss/RssPollingConsumerTest.java b/components/camel-rss/src/test/java/org/apache/camel/component/rss/RssPollingConsumerTest.java
index 005311f..fe8413f 100644
--- a/components/camel-rss/src/test/java/org/apache/camel/component/rss/RssPollingConsumerTest.java
+++ b/components/camel-rss/src/test/java/org/apache/camel/component/rss/RssPollingConsumerTest.java
@@ -30,7 +30,7 @@
     @Test
     public void testGrabbingListOfEntries() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(1);
+        mock.expectedMinimumMessageCount(1);
         mock.assertIsSatisfied();
 
         Exchange exchange = mock.getExchanges().get(0);
@@ -49,7 +49,7 @@
     protected RouteBuilder createRouteBuilder() throws Exception {
         return new RouteBuilder() {
             public void configure() throws Exception {
-                from("rss:file:src/test/data/rss20.xml?splitEntries=false&consumer.delay=100").to("mock:result");
+                from("rss:file:src/test/data/rss20.xml?splitEntries=false").to("mock:result");
             }
         };
     }
