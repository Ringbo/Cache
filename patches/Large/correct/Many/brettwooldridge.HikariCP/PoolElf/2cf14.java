diff --git a/src/main/java/com/zaxxer/hikari/pool/PoolElf.java b/src/main/java/com/zaxxer/hikari/pool/PoolElf.java
index 76d72f2..6560a47 100644
--- a/src/main/java/com/zaxxer/hikari/pool/PoolElf.java
+++ b/src/main/java/com/zaxxer/hikari/pool/PoolElf.java
@@ -175,7 +175,7 @@
    void setupConnection(final Connection connection, final long connectionTimeout) throws SQLException
    {
       if (isUseJdbc4Validation && !isJdbc4ValidationSupported(connection)) {
-         throw new SQLException("Connection.isValid() method is not supported, connection test query must be configured");
+         throw new SQLException("Connection.isValid() is not supported, configure connection test query.");
       }
 
       networkTimeout = getAndSetNetworkTimeout(connection, connectionTimeout);
@@ -269,7 +269,7 @@
       }
       
       if (LOGGER.isDebugEnabled()) {
-         LOGGER.debug("{} - Reset ({}) on connection {}", resetBits != 0 ? stringFromResetBits(resetBits) : "nothing", poolEntry.connection);
+         LOGGER.debug("{} - Reset ({}) on connection {}", poolName, resetBits != 0 ? stringFromResetBits(resetBits) : "nothing", poolEntry.connection);
       }
    }
 
