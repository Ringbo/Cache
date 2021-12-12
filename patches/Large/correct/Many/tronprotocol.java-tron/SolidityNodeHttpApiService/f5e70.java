diff --git a/src/main/java/org/tron/core/services/http/solidity/SolidityNodeHttpApiService.java b/src/main/java/org/tron/core/services/http/solidity/SolidityNodeHttpApiService.java
index 44c6229..35e2867 100644
--- a/src/main/java/org/tron/core/services/http/solidity/SolidityNodeHttpApiService.java
+++ b/src/main/java/org/tron/core/services/http/solidity/SolidityNodeHttpApiService.java
@@ -33,7 +33,7 @@
   private Server server;
 
   @Autowired
-  private GetAccountServlet accountServlet;
+  private GetAccountServlet getAccountServlet;
 
 
   @Autowired
@@ -95,7 +95,7 @@
       server.setHandler(context);
 
       // same as FullNode
-      context.addServlet(new ServletHolder(accountServlet), "/walletsolidity/getaccount");
+      context.addServlet(new ServletHolder(getAccountServlet), "/walletsolidity/getaccount");
       context.addServlet(new ServletHolder(listWitnessesServlet), "/walletsolidity/listwitnesses");
       context.addServlet(new ServletHolder(getAssetIssueListServlet),
           "/walletsolidity/getassetissuelist");
