diff --git a/storm-core/src/jvm/org/apache/storm/daemon/DrpcServer.java b/storm-core/src/jvm/org/apache/storm/daemon/DrpcServer.java
index 442457d..21308fd 100644
--- a/storm-core/src/jvm/org/apache/storm/daemon/DrpcServer.java
+++ b/storm-core/src/jvm/org/apache/storm/daemon/DrpcServer.java
@@ -118,7 +118,7 @@
         if (drpcHttpPort != null && drpcHttpPort > 0) {
             String filterClass = (String) (conf.get(Config.DRPC_HTTP_FILTER));
             Map<String, String> filterParams = (Map<String, String>) (conf.get(Config.DRPC_HTTP_FILTER_PARAMS));
-            FilterConfiguration filterConfiguration = new FilterConfiguration(filterParams, filterClass);
+            FilterConfiguration filterConfiguration = new FilterConfiguration(filterClass, filterParams);
             final List<FilterConfiguration> filterConfigurations = Arrays.asList(filterConfiguration);
             final Integer httpsPort = Utils.getInt(conf.get(Config.DRPC_HTTPS_PORT), 0);
             final String httpsKsPath = (String) (conf.get(Config.DRPC_HTTPS_KEYSTORE_PATH));
