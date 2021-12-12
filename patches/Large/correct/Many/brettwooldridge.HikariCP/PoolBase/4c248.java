diff --git a/src/main/java/com/zaxxer/hikari/pool/PoolBase.java b/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
index fdd4057..ee5ca12 100644
--- a/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
+++ b/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
@@ -363,7 +363,7 @@
                connection.isValid(1);
             }
             catch (Throwable e) {
-               LOGGER.warn("{} - Failed to execute isValid() for connection, configure connection test query. ({})", poolName, e.getMessage());
+               LOGGER.error("{} - Failed to execute isValid() for connection, configure connection test query. ({})", poolName, e.getMessage());
                throw e;
             }
          }
@@ -372,7 +372,7 @@
                executeSql(connection, config.getConnectionTestQuery(), false, isIsolateInternalQueries && !isAutoCommit);
             }
             catch (Throwable e) {
-               LOGGER.warn("{} - Failed to execute connection test query. ({})", poolName, e.getMessage());
+               LOGGER.error("{} - Failed to execute connection test query. ({})", poolName, e.getMessage());
                throw e;
             }
          }
