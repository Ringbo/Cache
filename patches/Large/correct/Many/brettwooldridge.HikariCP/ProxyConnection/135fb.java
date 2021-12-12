diff --git a/src/main/java/com/zaxxer/hikari/pool/ProxyConnection.java b/src/main/java/com/zaxxer/hikari/pool/ProxyConnection.java
index cb6a959..8cd0524 100644
--- a/src/main/java/com/zaxxer/hikari/pool/ProxyConnection.java
+++ b/src/main/java/com/zaxxer/hikari/pool/ProxyConnection.java
@@ -151,10 +151,10 @@
       SQLException nse = sqle;
       for (int depth = 0; nse != null && delegate != ClosedConnection.CLOSED_CONNECTION && depth < 10; depth++) {
          final String sqlState = nse.getSQLState();
-         if (sqlState != null && sqlState.startsWith("08") || ERROR_STATES.contains(sqlState) || ERROR_CODES.contains(sqle.getErrorCode())) {
+         if (sqlState != null && sqlState.startsWith("08") || ERROR_STATES.contains(sqlState) || ERROR_CODES.contains(nse.getErrorCode())) {
             // broken connection
             LOGGER.warn("{} - Connection {} marked as broken because of SQLSTATE({}), ErrorCode({})",
-                        poolEntry.getPoolName(), delegate, sqlState, sqle.getErrorCode(), sqle);
+                        poolEntry.getPoolName(), delegate, sqlState, nse.getErrorCode(), nse);
             leakTask.cancel();
             poolEntry.evict("(connection is broken)");
             delegate = ClosedConnection.CLOSED_CONNECTION;
