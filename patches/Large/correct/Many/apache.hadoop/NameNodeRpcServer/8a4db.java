diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/NameNodeRpcServer.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/NameNodeRpcServer.java
index f005f8b..f0ac86a 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/NameNodeRpcServer.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/NameNodeRpcServer.java
@@ -163,7 +163,8 @@
           RefreshUserMappingsProtocol.class, this);
       this.serviceRpcServer.addProtocol(RpcKind.RPC_WRITABLE, 
           GetUserMappingsProtocol.class, this);
-      this.serviceRpcServer.addProtocol(HAServiceProtocol.class, this);
+      this.serviceRpcServer.addProtocol(RpcKind.RPC_WRITABLE,
+          HAServiceProtocol.class, this);
       
       this.serviceRPCAddress = this.serviceRpcServer.getListenerAddress();
       nn.setRpcServiceServerAddress(conf, serviceRPCAddress);
@@ -188,7 +189,8 @@
         RefreshUserMappingsProtocol.class, this);
     this.clientRpcServer.addProtocol(RpcKind.RPC_WRITABLE,
         GetUserMappingsProtocol.class, this);
-    this.clientRpcServer.addProtocol(HAServiceProtocol.class, this);
+    this.clientRpcServer.addProtocol(RpcKind.RPC_WRITABLE,
+        HAServiceProtocol.class, this);
     
 
     // set service-level authorization security policy
