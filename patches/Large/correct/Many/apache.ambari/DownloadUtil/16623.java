diff --git a/ambari-logsearch/ambari-logsearch-server/src/main/java/org/apache/ambari/logsearch/util/DownloadUtil.java b/ambari-logsearch/ambari-logsearch-server/src/main/java/org/apache/ambari/logsearch/util/DownloadUtil.java
index ef20e38..85c14e0 100644
--- a/ambari-logsearch/ambari-logsearch-server/src/main/java/org/apache/ambari/logsearch/util/DownloadUtil.java
+++ b/ambari-logsearch/ambari-logsearch-server/src/main/java/org/apache/ambari/logsearch/util/DownloadUtil.java
@@ -125,7 +125,7 @@
     if (StringUtils.isBlank(excludeString)) {
       excludeString = "\"\"";
     } else {
-      List<String> exclude = Splitter.on(request.getIncludeMessage()).splitToList(LogSearchConstants.I_E_SEPRATOR);
+      List<String> exclude = Splitter.on(request.getExcludeMessage()).splitToList(LogSearchConstants.I_E_SEPRATOR);
       excludeString = "\"" + StringUtils.join(exclude, "\", \"") + "\"";
     }
     models.put("eString", excludeString);
