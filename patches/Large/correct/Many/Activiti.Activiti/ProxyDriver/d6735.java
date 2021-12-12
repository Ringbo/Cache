diff --git a/modules/activiti-upgrade/src/test/java/org/activiti/upgrade/ProxyDriver.java b/modules/activiti-upgrade/src/test/java/org/activiti/upgrade/ProxyDriver.java
index b63fbb5..4af6588 100644
--- a/modules/activiti-upgrade/src/test/java/org/activiti/upgrade/ProxyDriver.java
+++ b/modules/activiti-upgrade/src/test/java/org/activiti/upgrade/ProxyDriver.java
@@ -50,9 +50,9 @@
     } else if (url.startsWith("jdbc:sqlserver")) {
       databaseFormatter = new DatabaseFormatterMsSqlServer();
     } else if (url.startsWith("jdbc:db2")) {
-      databaseFormatter = new DatabaseFormatterOracle();
+      databaseFormatter = new DatabaseFormatterDb2();
     } else if (url.startsWith("jdbc:postgresql")) {
-      databaseFormatter = new DatabaseFormatterOracle();
+      databaseFormatter = new DatabaseFormatterPostgres();
     } 
   }
 
