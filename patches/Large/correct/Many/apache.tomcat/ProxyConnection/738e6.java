diff --git a/modules/jdbc-pool/java/org/apache/tomcat/jdbc/pool/ProxyConnection.java b/modules/jdbc-pool/java/org/apache/tomcat/jdbc/pool/ProxyConnection.java
index 503b7d9..cb0edd4 100644
--- a/modules/jdbc-pool/java/org/apache/tomcat/jdbc/pool/ProxyConnection.java
+++ b/modules/jdbc-pool/java/org/apache/tomcat/jdbc/pool/ProxyConnection.java
@@ -97,7 +97,7 @@
             return this.toString();
         } else if (compare(GETCONNECTION_VAL,method) && connection!=null) {
             return connection.getConnection();
-        } else if (method.getClass().equals(XAConnection.class)) {
+        } else if (method.getDeclaringClass().equals(XAConnection.class)) {
             try {
                 return method.invoke(connection.getXAConnection(),args);
             }catch (Throwable t) {
