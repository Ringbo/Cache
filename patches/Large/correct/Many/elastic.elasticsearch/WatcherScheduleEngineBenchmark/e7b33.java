diff --git a/watcher/src/test/java/org/elasticsearch/watcher/test/bench/WatcherScheduleEngineBenchmark.java b/watcher/src/test/java/org/elasticsearch/watcher/test/bench/WatcherScheduleEngineBenchmark.java
index 589ec2b..0c3361a 100644
--- a/watcher/src/test/java/org/elasticsearch/watcher/test/bench/WatcherScheduleEngineBenchmark.java
+++ b/watcher/src/test/java/org/elasticsearch/watcher/test/bench/WatcherScheduleEngineBenchmark.java
@@ -135,7 +135,7 @@
                     .put("watcher.trigger.schedule.engine", engine)
                     .put("node.data", false)
                     .build();
-            try (Node node = new MockNode(settings, false, Version.CURRENT, Arrays.asList(WatcherPlugin.class, LicensePlugin.class))) {
+            try (Node node = new MockNode(settings, Version.CURRENT, Arrays.asList(WatcherPlugin.class, LicensePlugin.class))) {
                 try (final Client client = node.client()) {
                     client.admin().cluster().prepareHealth().setWaitForNodes("2").get();
                     client.admin().indices().prepareDelete(HistoryStore.INDEX_PREFIX + "*").get();
