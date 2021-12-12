diff --git a/acra-core/src/main/java/org/acra/builder/ReportExecutor.java b/acra-core/src/main/java/org/acra/builder/ReportExecutor.java
index e53e230..e20167f 100644
--- a/acra-core/src/main/java/org/acra/builder/ReportExecutor.java
+++ b/acra-core/src/main/java/org/acra/builder/ReportExecutor.java
@@ -80,7 +80,7 @@
         this.processFinisher = processFinisher;
         reportingAdministrators = new ArrayList<>();
         //noinspection ForLoopReplaceableByForEach need to catch exception in iterator.next()
-        for (final Iterator<ReportingAdministrator> iterator = ServiceLoader.load(ReportingAdministrator.class).iterator(); iterator.hasNext(); ) {
+        for (final Iterator<ReportingAdministrator> iterator = ServiceLoader.load(ReportingAdministrator.class, getClass().getClassLoader()).iterator(); iterator.hasNext(); ) {
             try {
                 final ReportingAdministrator reportingAdministrator = iterator.next();
                 if (reportingAdministrator.enabled(config)) {
