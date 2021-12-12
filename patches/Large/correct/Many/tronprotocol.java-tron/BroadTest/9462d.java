diff --git a/src/test/java/org/tron/core/net/node/BroadTest.java b/src/test/java/org/tron/core/net/node/BroadTest.java
index 70fde80..4d7ce73 100644
--- a/src/test/java/org/tron/core/net/node/BroadTest.java
+++ b/src/test/java/org/tron/core/net/node/BroadTest.java
@@ -206,7 +206,7 @@
         rpcApiService = context.getBean(RpcApiService.class);
         appT.addService(rpcApiService);
         if (cfgArgs.isWitness()) {
-          appT.addService(new WitnessService(appT));
+          appT.addService(new WitnessService(appT, context));
         }
 //        appT.initServices(cfgArgs);
 //        appT.startServices();
