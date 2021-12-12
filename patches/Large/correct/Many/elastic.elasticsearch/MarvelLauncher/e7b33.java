diff --git a/marvel/src/test/java/org/elasticsearch/marvel/MarvelLauncher.java b/marvel/src/test/java/org/elasticsearch/marvel/MarvelLauncher.java
index 6fa7fd3..8e8b74e 100644
--- a/marvel/src/test/java/org/elasticsearch/marvel/MarvelLauncher.java
+++ b/marvel/src/test/java/org/elasticsearch/marvel/MarvelLauncher.java
@@ -30,7 +30,7 @@
         settings.put("cluster.name", MarvelLauncher.class.getSimpleName());
 
         final CountDownLatch latch = new CountDownLatch(1);
-        final Node node = new MockNode(settings.build(), false, Version.CURRENT, Arrays.asList(MarvelPlugin.class, LicensePlugin.class));
+        final Node node = new MockNode(settings.build(), Version.CURRENT, Arrays.asList(MarvelPlugin.class, LicensePlugin.class));
         Runtime.getRuntime().addShutdownHook(new Thread() {
 
             @Override
