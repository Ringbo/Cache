diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/spi/ClientProxy.java b/hazelcast-client/src/main/java/com/hazelcast/client/spi/ClientProxy.java
index 9bdd7ad..4477b1d 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/spi/ClientProxy.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/spi/ClientProxy.java
@@ -65,7 +65,7 @@
         if (ctx == null) {
             throw new HazelcastInstanceNotActiveException();
         }
-        return context;
+        return ctx;
     }
 
     protected final void setContext(ClientContext context) {
