diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/ReflectionUtils.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/ReflectionUtils.java
index 4fee5f4..be63c81 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/ReflectionUtils.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/ReflectionUtils.java
@@ -154,7 +154,7 @@
    * @param stream the stream to
    * @param title a string title for the stack trace
    */
-  public static void printThreadInfo(PrintWriter stream,
+  public synchronized static void printThreadInfo(PrintWriter stream,
                                      String title) {
     final int STACK_DEPTH = 20;
     boolean contention = threadBean.isThreadContentionMonitoringEnabled();
