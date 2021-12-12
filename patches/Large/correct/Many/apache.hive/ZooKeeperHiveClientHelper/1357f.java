diff --git a/jdbc/src/java/org/apache/hive/jdbc/ZooKeeperHiveClientHelper.java b/jdbc/src/java/org/apache/hive/jdbc/ZooKeeperHiveClientHelper.java
index 7195515..1ca77a1 100644
--- a/jdbc/src/java/org/apache/hive/jdbc/ZooKeeperHiveClientHelper.java
+++ b/jdbc/src/java/org/apache/hive/jdbc/ZooKeeperHiveClientHelper.java
@@ -159,7 +159,7 @@
         }
         // KERBEROS
         // If delegation token is passed from the client side, do not set the principal
-        if (matcher.group(2).equalsIgnoreCase("hive.server2.authentication.kerberos.principal")
+        if (matcher.group(1).equalsIgnoreCase("hive.server2.authentication.kerberos.principal")
             && !(connParams.getSessionVars().containsKey(JdbcConnectionParams.AUTH_TYPE) && connParams
                 .getSessionVars().get(JdbcConnectionParams.AUTH_TYPE)
                 .equalsIgnoreCase(JdbcConnectionParams.AUTH_TOKEN))
