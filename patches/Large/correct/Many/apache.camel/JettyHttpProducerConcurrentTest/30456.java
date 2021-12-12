diff --git a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/jettyproducer/JettyHttpProducerConcurrentTest.java b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/jettyproducer/JettyHttpProducerConcurrentTest.java
index 07079d1..88ee5f5 100644
--- a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/jettyproducer/JettyHttpProducerConcurrentTest.java
+++ b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/jettyproducer/JettyHttpProducerConcurrentTest.java
@@ -39,7 +39,7 @@
     @Test
     public void testNoConcurrentProducers() throws Exception {
         // give Jetty time to startup properly
-        Thread.sleep(1000);
+        Thread.sleep(2000);
 
         doSendMessages(1, 1);
     }
@@ -47,7 +47,7 @@
     @Test
     public void testConcurrentProducers() throws Exception {
         // give Jetty time to startup properly
-        Thread.sleep(1000);
+        Thread.sleep(2000);
 
         doSendMessages(10, 5);
     }
@@ -57,7 +57,7 @@
         getMockEndpoint("mock:result").assertNoDuplicates(body());
 
         ExecutorService executor = Executors.newFixedThreadPool(poolSize);
-        Map<Integer, Future> responses = new ConcurrentHashMap();
+        Map<Integer, Future> responses = new ConcurrentHashMap<Integer, Future>();
         for (int i = 0; i < files; i++) {
             final int index = i;
             Future out = executor.submit(new Callable<Object>() {
@@ -73,7 +73,7 @@
         assertEquals(files, responses.size());
 
         // get all responses
-        Set unique = new HashSet();
+        Set<Object> unique = new HashSet<Object>();
         for (Future future : responses.values()) {
             unique.add(future.get());
         }
