diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/jmx/ConnectionPool.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/jmx/ConnectionPool.java
index 2e3fe62..a27b5fe 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/jmx/ConnectionPool.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/jmx/ConnectionPool.java
@@ -89,7 +89,7 @@
 
     public static MBeanNotificationInfo[] getDefaultNotificationInfo() {
         String[] types = new String[] {NOTIFY_INIT, NOTIFY_CONNECT, NOTIFY_ABANDON, SLOW_QUERY_NOTIFICATION,
-                FAILED_QUERY_NOTIFICATION, SUSPECT_ABANDONED_NOTIFICATION, SUSPECT_RETURNED_NOTIFICATION};
+                FAILED_QUERY_NOTIFICATION, SUSPECT_ABANDONED_NOTIFICATION, POOL_EMPTY, SUSPECT_RETURNED_NOTIFICATION};
         String name = Notification.class.getName();
         String description = "A connection pool error condition was met.";
         MBeanNotificationInfo info = new MBeanNotificationInfo(types, name, description);
