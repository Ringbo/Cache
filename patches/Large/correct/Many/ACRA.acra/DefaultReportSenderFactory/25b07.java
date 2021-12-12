diff --git a/acra-core/src/main/java/org/acra/sender/DefaultReportSenderFactory.java b/acra-core/src/main/java/org/acra/sender/DefaultReportSenderFactory.java
index 4d31778..e597af8 100644
--- a/acra-core/src/main/java/org/acra/sender/DefaultReportSenderFactory.java
+++ b/acra-core/src/main/java/org/acra/sender/DefaultReportSenderFactory.java
@@ -43,7 +43,7 @@
     public ReportSender create(@NonNull Context context, @NonNull CoreConfiguration config) {
         final List<ReportSenderFactory> factoryList = new ArrayList<>();
         //noinspection ForLoopReplaceableByForEach
-        for (final Iterator<ReportSenderFactory> iterator = ServiceLoader.load(ReportSenderFactory.class).iterator(); iterator.hasNext(); ) {
+        for (final Iterator<ReportSenderFactory> iterator = ServiceLoader.load(ReportSenderFactory.class, getClass().getClassLoader()).iterator(); iterator.hasNext(); ) {
             try {
                 final ReportSenderFactory reportSenderFactory = iterator.next();
                 if (reportSenderFactory.enabled(config)) {
