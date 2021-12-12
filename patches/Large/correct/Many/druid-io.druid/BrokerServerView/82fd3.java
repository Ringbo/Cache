diff --git a/server/src/main/java/io/druid/client/BrokerServerView.java b/server/src/main/java/io/druid/client/BrokerServerView.java
index 3e860a4..d09a6d1 100644
--- a/server/src/main/java/io/druid/client/BrokerServerView.java
+++ b/server/src/main/java/io/druid/client/BrokerServerView.java
@@ -54,7 +54,7 @@
   private final Map<String, ServerSelector> selectors;
   private final Map<String, VersionedIntervalTimeline<String, ServerSelector>> timelines;
 
-  private final QueryToolChestWarehouse warehose;
+  private final QueryToolChestWarehouse warehouse;
   private final ObjectMapper smileMapper;
   private final HttpClient httpClient;
   private final ServerView baseView;
@@ -62,14 +62,14 @@
 
   @Inject
   public BrokerServerView(
-      QueryToolChestWarehouse warehose,
+      QueryToolChestWarehouse warehouse,
       ObjectMapper smileMapper,
       @Client HttpClient httpClient,
       ServerView baseView,
       ServerSelectorStrategy serverSelectorStrategy
   )
   {
-    this.warehose = warehose;
+    this.warehouse = warehouse;
     this.smileMapper = smileMapper;
     this.httpClient = httpClient;
     this.baseView = baseView;
@@ -149,7 +149,7 @@
 
   private DirectDruidClient makeDirectClient(DruidServer server)
   {
-    return new DirectDruidClient(warehose, smileMapper, httpClient, server.getHost());
+    return new DirectDruidClient(warehouse, smileMapper, httpClient, server.getHost());
   }
 
   private QueryableDruidServer removeServer(DruidServer server)
