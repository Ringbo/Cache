diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/PooledConnection.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/PooledConnection.java
index a64beeb..404c72e 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/PooledConnection.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/PooledConnection.java
@@ -546,7 +546,7 @@
             return true;
         } catch (Exception ex) {
             if (getPoolProperties().getLogValidationErrors()) {
-                log.warn("SQL Validation error", ex);
+                log.error("SQL Validation error", ex);
             } else if (log.isDebugEnabled()) {
                 log.debug("Unable to validate object:",ex);
             }
