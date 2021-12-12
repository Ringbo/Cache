diff --git a/sharding-core/src/main/java/io/shardingsphere/core/event/executor/SQLExecutionEventFactory.java b/sharding-core/src/main/java/io/shardingsphere/core/event/executor/SQLExecutionEventFactory.java
index 8883a4a..799abea 100644
--- a/sharding-core/src/main/java/io/shardingsphere/core/event/executor/SQLExecutionEventFactory.java
+++ b/sharding-core/src/main/java/io/shardingsphere/core/event/executor/SQLExecutionEventFactory.java
@@ -39,15 +39,16 @@
      * @param sqlType        SQL type
      * @param sqlExecuteUnit SQL execute unit
      * @param parameters     parameters
+     * @param url            url
      * @return SQL execution event
      */
-    public static SQLExecutionEvent createEvent(final SQLType sqlType, final SQLExecuteUnit sqlExecuteUnit, final List<Object> parameters) {
+    public static SQLExecutionEvent createEvent(final SQLType sqlType, final SQLExecuteUnit sqlExecuteUnit, final List<Object> parameters, final String url) {
         if (SQLType.DQL == sqlType) {
-            return new DQLExecutionEvent(sqlExecuteUnit.getRouteUnit(), parameters);
+            return new DQLExecutionEvent(sqlExecuteUnit.getRouteUnit(), parameters, url);
         }
         if (SQLType.DML == sqlType) {
-            return new DMLExecutionEvent(sqlExecuteUnit.getRouteUnit(), parameters);
+            return new DMLExecutionEvent(sqlExecuteUnit.getRouteUnit(), parameters, url);
         }
-        return new SQLExecutionEvent(sqlExecuteUnit.getRouteUnit(), parameters);
+        return new SQLExecutionEvent(sqlExecuteUnit.getRouteUnit(), parameters, url);
     }
 }
