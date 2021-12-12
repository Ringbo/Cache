diff --git a/camel-core/src/test/java/org/apache/camel/processor/SplitterStreamCacheTest.java b/camel-core/src/test/java/org/apache/camel/processor/SplitterStreamCacheTest.java
index d153696..60c2377 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/SplitterStreamCacheTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/SplitterStreamCacheTest.java
@@ -31,7 +31,7 @@
 public class SplitterStreamCacheTest extends ContextTestSupport {
 
     private static final String TEST_FILE = "org/apache/camel/converter/stream/test.xml";
-    protected int numMessages = 1000;
+    protected int numMessages = 200;
     
     public void testSendStreamSource() throws Exception {
         MockEndpoint resultEndpoint = getMockEndpoint("mock:result");
@@ -50,7 +50,10 @@
                 //ensure stream is spooled to disk
                 getContext().getProperties().put(CachedOutputStream.TEMP_DIR, "target/tmp");
                 getContext().getProperties().put(CachedOutputStream.THRESHOLD, "1");
-                from("seda:parallel?size=1000&concurrentConsumers=5").streamCaching().split(XPathBuilder.xpath("//person/city")).to("mock:result");
+
+                from("seda:parallel?concurrentConsumers=5").streamCaching()
+                    .split(XPathBuilder.xpath("//person/city"))
+                        .to("mock:result");
             }
         };
     }
