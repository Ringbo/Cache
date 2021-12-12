diff --git a/core/src/test/java/org/bitcoinj/core/BitcoindComparisonTool.java b/core/src/test/java/org/bitcoinj/core/BitcoindComparisonTool.java
index e311446..e18b004 100644
--- a/core/src/test/java/org/bitcoinj/core/BitcoindComparisonTool.java
+++ b/core/src/test/java/org/bitcoinj/core/BitcoindComparisonTool.java
@@ -210,7 +210,7 @@
         bitcoindChainHead = params.getGenesisBlock().getHash();
         
         // bitcoind MUST be on localhost or we will get banned as a DoSer
-        new NioClient(new InetSocketAddress(InetAddress.getLoopbackAddress(), args.length > 2 ? Integer.parseInt(args[2]) : params.getPort()), bitcoind, 1000);
+        new NioClient(new InetSocketAddress(InetAddress.getLocalHost(), args.length > 2 ? Integer.parseInt(args[2]) : params.getPort()), bitcoind, 1000);
 
         connectedFuture.get();
 
