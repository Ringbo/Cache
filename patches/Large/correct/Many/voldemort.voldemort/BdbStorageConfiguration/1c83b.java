diff --git a/src/java/voldemort/store/bdb/BdbStorageConfiguration.java b/src/java/voldemort/store/bdb/BdbStorageConfiguration.java
index e17582e..9ba76ef 100644
--- a/src/java/voldemort/store/bdb/BdbStorageConfiguration.java
+++ b/src/java/voldemort/store/bdb/BdbStorageConfiguration.java
@@ -172,7 +172,7 @@
 
     public EnvironmentStats getStats(String storeName) {
         StatsConfig config = new StatsConfig();
-        config.setFast(true);
+        config.setFast(false);
         try {
             Environment env = getEnvironment(storeName);
             return env.getStats(config);
