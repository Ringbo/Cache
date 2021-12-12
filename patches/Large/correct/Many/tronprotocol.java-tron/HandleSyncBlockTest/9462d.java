diff --git a/src/test/java/org/tron/core/net/node/HandleSyncBlockTest.java b/src/test/java/org/tron/core/net/node/HandleSyncBlockTest.java
index d4dae3f..108030f 100644
--- a/src/test/java/org/tron/core/net/node/HandleSyncBlockTest.java
+++ b/src/test/java/org/tron/core/net/node/HandleSyncBlockTest.java
@@ -179,7 +179,7 @@
         rpcApiService = context.getBean(RpcApiService.class);
         appT.addService(rpcApiService);
         if (cfgArgs.isWitness()) {
-          appT.addService(new WitnessService(appT));
+          appT.addService(new WitnessService(appT, context));
         }
 //        appT.initServices(cfgArgs);
 //        appT.startServices();
