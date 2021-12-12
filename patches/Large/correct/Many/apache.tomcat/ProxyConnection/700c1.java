diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/ProxyConnection.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/ProxyConnection.java
index a874443..98dd8b9 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/ProxyConnection.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/ProxyConnection.java
@@ -103,7 +103,7 @@
             return this.toString();
         } else if (compare(GETCONNECTION_VAL,method) && connection!=null) {
             return connection.getConnection();
-        } else if (method.getDeclaringClass().equals(XAConnection.class)) {
+        } else if (method.getDeclaringClass().isAssignableFrom(XAConnection.class)) {
             try {
                 return method.invoke(connection.getXAConnection(),args);
             }catch (Throwable t) {
