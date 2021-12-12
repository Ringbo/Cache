diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/PooledConnection.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/PooledConnection.java
index f788394..9f3040c 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/PooledConnection.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/PooledConnection.java
@@ -400,7 +400,7 @@
         if (poolProperties.getRemoveAbandonedTimeout() <= 0) {
             return Long.MAX_VALUE;
         } else {
-            return poolProperties.getRemoveAbandonedTimeout()*1000;
+            return poolProperties.getRemoveAbandonedTimeout() * 1000L;
         } //end if
     }
 
