diff --git a/src/main/java/org/redisson/Redisson.java b/src/main/java/org/redisson/Redisson.java
index 6964287..925341f 100755
--- a/src/main/java/org/redisson/Redisson.java
+++ b/src/main/java/org/redisson/Redisson.java
@@ -122,13 +122,13 @@
      *
      * @return Redisson instance
      */
-    public static RedissonClient createReactive() {
+    public static RedissonReactiveClient createReactive() {
         Config config = new Config();
         config.useSingleServer().setAddress("127.0.0.1:6379");
 //        config.useMasterSlaveConnection().setMasterAddress("127.0.0.1:6379").addSlaveAddress("127.0.0.1:6389").addSlaveAddress("127.0.0.1:6399");
 //        config.useSentinelConnection().setMasterName("mymaster").addSentinelAddress("127.0.0.1:26389", "127.0.0.1:26379");
 //        config.useClusterServers().addNodeAddress("127.0.0.1:7000");
-        return create(config);
+        return createReactive(config);
     }
 
     /**
