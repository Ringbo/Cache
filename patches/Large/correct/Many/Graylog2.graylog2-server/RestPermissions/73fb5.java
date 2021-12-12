diff --git a/graylog2-server/src/main/java/org/graylog2/security/RestPermissions.java b/graylog2-server/src/main/java/org/graylog2/security/RestPermissions.java
index e5d6d3b..6b1824a 100644
--- a/graylog2-server/src/main/java/org/graylog2/security/RestPermissions.java
+++ b/graylog2-server/src/main/java/org/graylog2/security/RestPermissions.java
@@ -109,7 +109,10 @@
             MESSAGES_READ,
             METRICS_READ,
             SYSTEM_READ,
-            THROUGHPUT_READ
+            THROUGHPUT_READ,
+            SAVEDSEARCHES_CREATE,
+            SAVEDSEARCHES_EDIT,
+            SAVEDSEARCHES_READ
     );
 
     public static Set<String> readerPermissions(String username) {
