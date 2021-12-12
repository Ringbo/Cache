diff --git a/src/main/java/org/acra/config/ConfigurationBuilder.java b/src/main/java/org/acra/config/ConfigurationBuilder.java
index 0f748e9..54950d2 100644
--- a/src/main/java/org/acra/config/ConfigurationBuilder.java
+++ b/src/main/java/org/acra/config/ConfigurationBuilder.java
@@ -831,7 +831,7 @@
     @NonNull
     Set<ReportField> reportContent() {
         final Set<ReportField> reportContent = new HashSet<ReportField>();
-        if (customReportContent != null) {
+        if (customReportContent != null && customReportContent.length != 0) {
             if (ACRA.DEV_LOGGING) ACRA.log.d(LOG_TAG, "Using custom Report Fields");
             reportContent.addAll(Arrays.asList(customReportContent));
         } else if (mailTo == null || DEFAULT_STRING_VALUE.equals(mailTo)) {
