diff --git a/tests/camel-itest/src/test/java/org/apache/camel/itest/netty/NettyAsyncRequestReplyTest.java b/tests/camel-itest/src/test/java/org/apache/camel/itest/netty/NettyAsyncRequestReplyTest.java
index fc11c33..5c53943 100644
--- a/tests/camel-itest/src/test/java/org/apache/camel/itest/netty/NettyAsyncRequestReplyTest.java
+++ b/tests/camel-itest/src/test/java/org/apache/camel/itest/netty/NettyAsyncRequestReplyTest.java
@@ -43,10 +43,10 @@
 
     @Test
     public void testNetty() throws Exception {
-        String out = template.requestBody("netty:tcp://localhost:" + port + "?textline=true?sync=true", "World", String.class);
+        String out = template.requestBody("netty:tcp://localhost:" + port + "?textline=true&sync=true", "World", String.class);
         assertEquals("Bye World", out);
 
-        String out2 = template.requestBody("netty:tcp://localhost:" + port + "?textline=true?sync=true", "Camel", String.class);
+        String out2 = template.requestBody("netty:tcp://localhost:" + port + "?textline=true&sync=true", "Camel", String.class);
         assertEquals("Bye Camel", out2);
     }
 
@@ -60,7 +60,7 @@
             final int index = i;
             Future<String> out = executor.submit(new Callable<String>() {
                 public String call() throws Exception {
-                    String reply = template.requestBody("netty:tcp://localhost:" + port + "?textline=true?sync=true", index, String.class);
+                    String reply = template.requestBody("netty:tcp://localhost:" + port + "?textline=true&sync=true", index, String.class);
                     log.info("Sent {} received {}", index, reply);
                     assertEquals("Bye " + index, reply);
                     return reply;
@@ -72,7 +72,7 @@
         // get all responses
         Set<Object> unique = new HashSet<Object>();
         for (Future<String> future : responses.values()) {
-            String reply = future.get(30, TimeUnit.SECONDS);
+            String reply = future.get(120, TimeUnit.SECONDS);
             assertNotNull("Should get a reply", reply);
             unique.add(reply);
         }
@@ -89,7 +89,7 @@
             public void configure() throws Exception {
                 port = AvailablePortFinder.getNextAvailable(8000);
 
-                from("netty:tcp://localhost:" + port + "?textline=true?sync=true?reuseAddress=true?synchronous=false")
+                from("netty:tcp://localhost:" + port + "?textline=true&sync=true&reuseAddress=true&synchronous=false")
                     .to("activemq:queue:foo")
                     .log("Writing reply ${body}");
 
