diff --git a/ambari-server/src/main/java/org/apache/ambari/server/upgrade/UpgradeCatalog222.java b/ambari-server/src/main/java/org/apache/ambari/server/upgrade/UpgradeCatalog222.java
index f988a7a..a6a8991 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/upgrade/UpgradeCatalog222.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/upgrade/UpgradeCatalog222.java
@@ -434,7 +434,7 @@
     Map<String, String> sectionLayoutMap = new HashMap<>();
 
     List<String> hdfsSummaryWidgets = new ArrayList<>(Arrays.asList("NameNode RPC", "NN Connection Load",
-      "NameNode GC count", "NameNode GC time"));
+      "NameNode GC count", "NameNode GC time", "NameNode Host Load"));
     widgetMap.put("HDFS_SUMMARY", hdfsSummaryWidgets);
     sectionLayoutMap.put("HDFS_SUMMARY", "default_hdfs_dashboard");
 
