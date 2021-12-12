diff --git a/h2/src/main/org/h2/message/TraceObject.java b/h2/src/main/org/h2/message/TraceObject.java
index 23cc5a7..972c3f4 100644
--- a/h2/src/main/org/h2/message/TraceObject.java
+++ b/h2/src/main/org/h2/message/TraceObject.java
@@ -364,13 +364,11 @@
     }
 
     /**
-     * Get and throw a SQL exception meaning this feature is not supported.
+     * Get a SQL exception meaning this feature is not supported.
      *
      * @param message the message
-     * @return never returns normally
-     * @throws SQLException the exception
      */
-    protected SQLException unsupported(String message) throws SQLException {
+    protected SQLException unsupported(String message) {
         try {
             throw DbException.getUnsupportedException(message);
         } catch (Exception e) {
