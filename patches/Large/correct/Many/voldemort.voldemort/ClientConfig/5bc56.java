diff --git a/src/java/voldemort/client/ClientConfig.java b/src/java/voldemort/client/ClientConfig.java
index 5998cd5..089a146 100644
--- a/src/java/voldemort/client/ClientConfig.java
+++ b/src/java/voldemort/client/ClientConfig.java
@@ -212,7 +212,7 @@
      * @param maxTotalConnections The maximum total number of connections
      */
     public ClientConfig setMaxTotalConnections(int maxTotalConnections) {
-        if(maxConnectionsPerNode <= 0)
+        if(maxTotalConnections <= 0)
             throw new IllegalArgumentException("Value must be greater than zero.");
         this.maxTotalConnections = maxTotalConnections;
         return this;
