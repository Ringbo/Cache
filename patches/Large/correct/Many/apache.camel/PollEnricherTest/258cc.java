diff --git a/camel-core/src/test/java/org/apache/camel/processor/enricher/PollEnricherTest.java b/camel-core/src/test/java/org/apache/camel/processor/enricher/PollEnricherTest.java
index 7427b9f..a78ed6e 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/enricher/PollEnricherTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/enricher/PollEnricherTest.java
@@ -96,7 +96,7 @@
     public void testPollEnrichInOut() throws InterruptedException {
         template.sendBody("seda:foo4", "blah");
 
-        Thread.sleep(100);
+        Thread.sleep(200);
 
         String result = (String) template.sendBody("direct:enricher-test-4", ExchangePattern.InOut, "test");
         assertEquals("test:blah", result);
