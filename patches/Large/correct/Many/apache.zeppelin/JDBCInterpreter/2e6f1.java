diff --git a/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java b/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java
index 47cdfcc..5bf4063 100644
--- a/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java
+++ b/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java
@@ -372,7 +372,8 @@
 
       switch (authType) {
           case KERBEROS:
-            if (user == null) {
+            if (user == null || "false".equalsIgnoreCase(
+              property.getProperty("zeppelin.jdbc.auth.kerberos.proxy.enable"))) {
               connection = getConnectionFromPool(url, user, propertyKey, properties);
             } else {
               if (url.trim().startsWith("jdbc:hive")) {
