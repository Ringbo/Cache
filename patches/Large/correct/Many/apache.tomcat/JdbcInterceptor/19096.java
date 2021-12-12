diff --git a/modules/jdbc-pool/java/org/apache/tomcat/jdbc/pool/JdbcInterceptor.java b/modules/jdbc-pool/java/org/apache/tomcat/jdbc/pool/JdbcInterceptor.java
index 212be1a..ff17a3c 100644
--- a/modules/jdbc-pool/java/org/apache/tomcat/jdbc/pool/JdbcInterceptor.java
+++ b/modules/jdbc-pool/java/org/apache/tomcat/jdbc/pool/JdbcInterceptor.java
@@ -88,7 +88,7 @@
     }
     
     public boolean useEquals() {
-        return getUseEquals();
+        return useEquals();
     }
     
     public void setUseEquals(boolean useEquals) {
