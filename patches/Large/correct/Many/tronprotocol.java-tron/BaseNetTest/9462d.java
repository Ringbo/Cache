diff --git a/src/test/java/org/tron/core/net/node/BaseNetTest.java b/src/test/java/org/tron/core/net/node/BaseNetTest.java
index db2616b..72348c5 100644
--- a/src/test/java/org/tron/core/net/node/BaseNetTest.java
+++ b/src/test/java/org/tron/core/net/node/BaseNetTest.java
@@ -94,7 +94,7 @@
         rpcApiService = context.getBean(RpcApiService.class);
         appT.addService(rpcApiService);
         if (cfgArgs.isWitness()) {
-          appT.addService(new WitnessService(appT));
+          appT.addService(new WitnessService(appT, context));
         }
         appT.initServices(cfgArgs);
         appT.startServices();
