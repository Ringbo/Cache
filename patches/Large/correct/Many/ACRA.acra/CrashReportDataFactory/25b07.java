diff --git a/acra-core/src/main/java/org/acra/data/CrashReportDataFactory.java b/acra-core/src/main/java/org/acra/data/CrashReportDataFactory.java
index 4e2c16e..1c9db8a 100644
--- a/acra-core/src/main/java/org/acra/data/CrashReportDataFactory.java
+++ b/acra-core/src/main/java/org/acra/data/CrashReportDataFactory.java
@@ -50,7 +50,7 @@
         this.config = config;
         collectors = new ArrayList<>();
         //noinspection ForLoopReplaceableByForEach need to catch exception in iterator.next()
-        for (final Iterator<Collector> iterator = ServiceLoader.load(Collector.class).iterator(); iterator.hasNext(); ) {
+        for (final Iterator<Collector> iterator = ServiceLoader.load(Collector.class, getClass().getClassLoader()).iterator(); iterator.hasNext(); ) {
             try {
                 final Collector collector = iterator.next();
                 if (ACRA.DEV_LOGGING) ACRA.log.d(ACRA.LOG_TAG, "Loaded collector of class " + collector.getClass().getName());
