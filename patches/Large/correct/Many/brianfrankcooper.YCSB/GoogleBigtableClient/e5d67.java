diff --git a/googlebigtable/src/main/java/com/yahoo/ycsb/db/GoogleBigtableClient.java b/googlebigtable/src/main/java/com/yahoo/ycsb/db/GoogleBigtableClient.java
index b405d1a..86ab94e 100644
--- a/googlebigtable/src/main/java/com/yahoo/ycsb/db/GoogleBigtableClient.java
+++ b/googlebigtable/src/main/java/com/yahoo/ycsb/db/GoogleBigtableClient.java
@@ -74,8 +74,8 @@
   private static final String ASYNC_MAX_INFLIGHT_RPCS = "mutatorMaxInflightRPCs";
   private static final String CLIENT_SIDE_BUFFERING = "clientbuffering";
   
-  /** Must be an object for synchronization and tracking running thread counts. */ 
-  private static Integer threadCount = 0;
+  /** Tracks running thread counts so we know when to close the session. */ 
+  private static int threadCount = 0;
   
   /** This will load the hbase-site.xml config file and/or store CLI options. */
   private static final Configuration CONFIG = HBaseConfiguration.create();
@@ -125,7 +125,7 @@
     System.err.println("Running Google Bigtable with Proto API" +
          (clientSideBuffering ? " and client side buffering." : "."));
     
-    synchronized (threadCount) {
+    synchronized (CONFIG) {
       ++threadCount;
       if (session == null) {
         try {
@@ -176,7 +176,7 @@
         throw new DBException(e);
       }
     }
-    synchronized (threadCount) {
+    synchronized (CONFIG) {
       --threadCount;
       if (threadCount <= 0) {
         try {
