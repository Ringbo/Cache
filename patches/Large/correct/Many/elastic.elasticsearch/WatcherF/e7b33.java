diff --git a/watcher/src/test/java/org/elasticsearch/watcher/WatcherF.java b/watcher/src/test/java/org/elasticsearch/watcher/WatcherF.java
index 4a2c154..25032ff 100644
--- a/watcher/src/test/java/org/elasticsearch/watcher/WatcherF.java
+++ b/watcher/src/test/java/org/elasticsearch/watcher/WatcherF.java
@@ -48,7 +48,7 @@
         System.setProperty("es.watcher.actions.slack.service.account.a1.url", "https://hooks.slack.com/services/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");
 
         final CountDownLatch latch = new CountDownLatch(1);
-        final Node node = new MockNode(settings.build(), false, Version.CURRENT, Arrays.asList(WatcherPlugin.class, LicensePlugin.class));
+        final Node node = new MockNode(settings.build(), Version.CURRENT, Arrays.asList(WatcherPlugin.class, LicensePlugin.class));
         Runtime.getRuntime().addShutdownHook(new Thread() {
 
             @Override
