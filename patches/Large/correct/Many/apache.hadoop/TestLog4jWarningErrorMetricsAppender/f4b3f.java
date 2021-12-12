diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/test/java/org/apache/hadoop/yarn/util/TestLog4jWarningErrorMetricsAppender.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/test/java/org/apache/hadoop/yarn/util/TestLog4jWarningErrorMetricsAppender.java
index 61d4c4c..e788e80 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/test/java/org/apache/hadoop/yarn/util/TestLog4jWarningErrorMetricsAppender.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/test/java/org/apache/hadoop/yarn/util/TestLog4jWarningErrorMetricsAppender.java
@@ -84,7 +84,7 @@
     Assert.assertEquals(1, appender.getErrorCounts(cutoff).get(0).longValue());
     Assert.assertEquals(1, appender.getErrorMessagesAndCounts(cutoff).get(0)
       .size());
-    Thread.sleep(2000);
+    Thread.sleep(3000);
     Assert.assertEquals(1, appender.getErrorCounts(cutoff).size());
     Assert.assertEquals(0, appender.getErrorCounts(cutoff).get(0).longValue());
     Assert.assertEquals(0, appender.getErrorMessagesAndCounts(cutoff).get(0)
