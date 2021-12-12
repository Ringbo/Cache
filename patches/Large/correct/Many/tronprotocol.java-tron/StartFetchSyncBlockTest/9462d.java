diff --git a/src/test/java/org/tron/core/net/node/StartFetchSyncBlockTest.java b/src/test/java/org/tron/core/net/node/StartFetchSyncBlockTest.java
index 8811615..b0ff27a 100644
--- a/src/test/java/org/tron/core/net/node/StartFetchSyncBlockTest.java
+++ b/src/test/java/org/tron/core/net/node/StartFetchSyncBlockTest.java
@@ -160,7 +160,7 @@
         rpcApiService = context.getBean(RpcApiService.class);
         appT.addService(rpcApiService);
         if (cfgArgs.isWitness()) {
-          appT.addService(new WitnessService(appT));
+          appT.addService(new WitnessService(appT, context));
         }
 //        appT.initServices(cfgArgs);
 //        appT.startServices();
