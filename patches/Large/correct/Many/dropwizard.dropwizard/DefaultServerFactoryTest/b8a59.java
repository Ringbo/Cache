diff --git a/dropwizard-core/src/test/java/io/dropwizard/server/DefaultServerFactoryTest.java b/dropwizard-core/src/test/java/io/dropwizard/server/DefaultServerFactoryTest.java
index 7e8a15f..965a3bc 100644
--- a/dropwizard-core/src/test/java/io/dropwizard/server/DefaultServerFactoryTest.java
+++ b/dropwizard-core/src/test/java/io/dropwizard/server/DefaultServerFactoryTest.java
@@ -171,7 +171,7 @@
             return CharStreams.toString(new InputStreamReader(connection.getInputStream()));
         });
 
-        requestReceived.await();
+        requestReceived.await(10, TimeUnit.SECONDS);
 
         Future<Void> serverStopped = executor.submit((Callable<Void>) () -> {
             server.stop();
