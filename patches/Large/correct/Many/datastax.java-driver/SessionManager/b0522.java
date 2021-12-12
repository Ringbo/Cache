diff --git a/driver-core/src/main/java/com/datastax/driver/core/SessionManager.java b/driver-core/src/main/java/com/datastax/driver/core/SessionManager.java
index 788cd0c..bdb668f 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/SessionManager.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/SessionManager.java
@@ -146,6 +146,8 @@
                             PreparedStatement stmt = PreparedStatement.fromMessage(pmsg, cluster.getMetadata(), query, poolsState.keyspace);
                             cluster.manager.addPrepared(stmt);
                             try {
+                                // All Sessions are connected to the same nodes so it's enough to prepare only the nodes of this session.
+                                // If that changes, we'll have to make sure this propagate to other sessions too.
                                 prepare(stmt.getQueryString(), future.getAddress());
                             } catch (InterruptedException e) {
                                 Thread.currentThread().interrupt();
@@ -298,7 +300,7 @@
         new RequestHandler(this, callback, query).sendRequest();
     }
 
-    void prepare(String query, InetAddress toExclude) throws InterruptedException {
+    private void prepare(String query, InetAddress toExclude) throws InterruptedException {
         for (Map.Entry<Host, HostConnectionPool> entry : pools.entrySet()) {
             if (entry.getKey().getAddress().equals(toExclude))
                 continue;
