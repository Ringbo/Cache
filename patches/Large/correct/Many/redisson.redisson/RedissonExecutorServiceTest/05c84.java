diff --git a/src/test/java/org/redisson/executor/RedissonExecutorServiceTest.java b/src/test/java/org/redisson/executor/RedissonExecutorServiceTest.java
index a0f84d1..7b9808e 100644
--- a/src/test/java/org/redisson/executor/RedissonExecutorServiceTest.java
+++ b/src/test/java/org/redisson/executor/RedissonExecutorServiceTest.java
@@ -29,7 +29,7 @@
         
         Config config = createConfig();
         RedissonNodeConfig nodeConfig = new RedissonNodeConfig(config);
-        nodeConfig.setExecutors(Collections.singletonMap("test", 1));
+        nodeConfig.setExecutorServiceWorkers(Collections.singletonMap("test", 1));
         RedissonNode.start(nodeConfig);
     }
     
