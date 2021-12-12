diff --git a/ambari-metrics/ambari-metrics-timelineservice/src/test/java/org/apache/hadoop/yarn/server/applicationhistoryservice/metrics/timeline/AbstractMiniHBaseClusterTest.java b/ambari-metrics/ambari-metrics-timelineservice/src/test/java/org/apache/hadoop/yarn/server/applicationhistoryservice/metrics/timeline/AbstractMiniHBaseClusterTest.java
index 96b8a83..2ca7669 100644
--- a/ambari-metrics/ambari-metrics-timelineservice/src/test/java/org/apache/hadoop/yarn/server/applicationhistoryservice/metrics/timeline/AbstractMiniHBaseClusterTest.java
+++ b/ambari-metrics/ambari-metrics-timelineservice/src/test/java/org/apache/hadoop/yarn/server/applicationhistoryservice/metrics/timeline/AbstractMiniHBaseClusterTest.java
@@ -57,7 +57,7 @@
 
   @AfterClass
   public static void doTeardown() throws Exception {
-    dropNonSystemTables();
+    dropAllTables();
   }
 
   @After
