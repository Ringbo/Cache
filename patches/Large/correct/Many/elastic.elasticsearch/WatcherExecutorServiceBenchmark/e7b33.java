diff --git a/watcher/src/test/java/org/elasticsearch/watcher/test/bench/WatcherExecutorServiceBenchmark.java b/watcher/src/test/java/org/elasticsearch/watcher/test/bench/WatcherExecutorServiceBenchmark.java
index 97f51b2..842b498 100644
--- a/watcher/src/test/java/org/elasticsearch/watcher/test/bench/WatcherExecutorServiceBenchmark.java
+++ b/watcher/src/test/java/org/elasticsearch/watcher/test/bench/WatcherExecutorServiceBenchmark.java
@@ -58,7 +58,7 @@
     private static ScheduleTriggerEngineMock scheduler;
 
     protected static void start() throws Exception {
-        Node node = new MockNode(Settings.builder().put(SETTINGS).put("node.data", false).build(), false, Version.CURRENT, Arrays.asList(WatcherBenchmarkPlugin.class, LicensePlugin.class));
+        Node node = new MockNode(Settings.builder().put(SETTINGS).put("node.data", false).build(), Version.CURRENT, Arrays.asList(WatcherBenchmarkPlugin.class, LicensePlugin.class));
         client = node.client();
         client.admin().cluster().prepareHealth("*").setWaitForGreenStatus().get();
         Thread.sleep(5000);
