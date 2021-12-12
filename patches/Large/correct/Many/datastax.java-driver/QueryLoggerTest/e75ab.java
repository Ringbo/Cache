diff --git a/driver-core/src/test/java/com/datastax/driver/core/QueryLoggerTest.java b/driver-core/src/test/java/com/datastax/driver/core/QueryLoggerTest.java
index e2a8848..86c6332 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/QueryLoggerTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/QueryLoggerTest.java
@@ -1042,7 +1042,7 @@
     public void should_log_wrapped_bound_statement() throws Exception {
         // given
         normal.setLevel(TRACE);
-        queryLogger = QueryLogger.builder(cluster())
+        queryLogger = QueryLogger.builder()
                 .withConstantThreshold(Long.MAX_VALUE)
                 .withMaxQueryStringLength(Integer.MAX_VALUE)
                 .build();
