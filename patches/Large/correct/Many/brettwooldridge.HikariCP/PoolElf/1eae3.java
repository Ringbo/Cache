diff --git a/src/main/java/com/zaxxer/hikari/pool/PoolElf.java b/src/main/java/com/zaxxer/hikari/pool/PoolElf.java
index afb031e..cb5d25e 100644
--- a/src/main/java/com/zaxxer/hikari/pool/PoolElf.java
+++ b/src/main/java/com/zaxxer/hikari/pool/PoolElf.java
@@ -202,7 +202,7 @@
             return connection.isValid(timeoutSec);
          }
    
-         networkTimeout = getAndSetNetworkTimeout(connection, validationTimeout);
+         final int originalTimeout = getAndSetNetworkTimeout(connection, validationTimeout);
    
          try (Statement statement = connection.createStatement()) {
             setQueryTimeout(statement, timeoutSec);
@@ -215,7 +215,7 @@
             connection.rollback();
          }
    
-         setNetworkTimeout(connection, networkTimeout);
+         setNetworkTimeout(connection, originalTimeout);
    
          return true;
       }
