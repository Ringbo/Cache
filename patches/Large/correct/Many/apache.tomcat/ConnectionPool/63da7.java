diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/ConnectionPool.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/ConnectionPool.java
index 7280f28..7077cc5 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/ConnectionPool.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/ConnectionPool.java
@@ -954,7 +954,7 @@
                         busy.remove(con);
                         abandon(con);
                         setToNull = true;
-                    } else if (sto > 0 && (now - time) > (sto*1000)) {
+                    } else if (sto > 0 && (now - time) > (sto * 1000L)) {
                         suspect(con);
                     } else {
                         //do nothing
