diff --git a/storm-core/src/jvm/backtype/storm/utils/Utils.java b/storm-core/src/jvm/backtype/storm/utils/Utils.java
index 2c91ec5..77580c4 100644
--- a/storm-core/src/jvm/backtype/storm/utils/Utils.java
+++ b/storm-core/src/jvm/backtype/storm/utils/Utils.java
@@ -361,8 +361,8 @@
                 .sessionTimeoutMs(Utils.getInt(conf.get(Config.STORM_ZOOKEEPER_SESSION_TIMEOUT)))
                 .retryPolicy(new StormBoundedExponentialBackoffRetry(
                             Utils.getInt(conf.get(Config.STORM_ZOOKEEPER_RETRY_INTERVAL)),
-                            Utils.getInt(conf.get(Config.STORM_ZOOKEEPER_RETRY_TIMES)),
-                            Utils.getInt(conf.get(Config.STORM_ZOOKEEPER_RETRY_INTERVAL_CEILING))));
+                            Utils.getInt(conf.get(Config.STORM_ZOOKEEPER_RETRY_INTERVAL_CEILING)),
+                            Utils.getInt(conf.get(Config.STORM_ZOOKEEPER_RETRY_TIMES))));
         if(auth!=null && auth.scheme!=null) {
             builder = builder.authorization(auth.scheme, auth.payload);
         }
