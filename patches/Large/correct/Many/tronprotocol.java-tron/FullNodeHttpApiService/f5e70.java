diff --git a/src/main/java/org/tron/core/services/http/FullNodeHttpApiService.java b/src/main/java/org/tron/core/services/http/FullNodeHttpApiService.java
index b185294..724738f 100644
--- a/src/main/java/org/tron/core/services/http/FullNodeHttpApiService.java
+++ b/src/main/java/org/tron/core/services/http/FullNodeHttpApiService.java
@@ -18,7 +18,7 @@
   private Server server;
 
   @Autowired
-  private GetAccountServlet accountServlet;
+  private GetAccountServlet getAccountServlet;
   @Autowired
   private TransferServlet transferServlet;
   @Autowired
@@ -78,7 +78,7 @@
   @Autowired
   private GetTransactionInfoByIdServlet getTransactionInfoByIdServlet;
   @Autowired
-  private GetTransactionCountByBlockNumServlet getTransactionCountByBlockNum;
+  private GetTransactionCountByBlockNumServlet getTransactionCountByBlockNumServlet;
   @Autowired
   private ListWitnessesServlet listWitnessesServlet;
   @Autowired
@@ -161,7 +161,7 @@
       ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
       context.setContextPath("/wallet/");
       server.setHandler(context);
-      context.addServlet(new ServletHolder(accountServlet), "/getaccount");
+      context.addServlet(new ServletHolder(getAccountServlet), "/getaccount");
       context.addServlet(new ServletHolder(transferServlet), "/createtransaction");
       context.addServlet(new ServletHolder(broadcastServlet), "/broadcasttransaction");
       context.addServlet(new ServletHolder(transactionSignServlet), "/gettransactionsign");
@@ -194,7 +194,8 @@
       context.addServlet(
           new ServletHolder(getTransactionInfoByIdServlet), "/gettransactioninfobyid");
       context.addServlet(
-          new ServletHolder(getTransactionCountByBlockNum), "/gettransactioncountbyblocknum");
+          new ServletHolder(getTransactionCountByBlockNumServlet),
+          "/gettransactioncountbyblocknum");
       context.addServlet(new ServletHolder(listWitnessesServlet), "/listwitnesses");
       context.addServlet(new ServletHolder(getAssetIssueListServlet), "/getassetissuelist");
       context.addServlet(
