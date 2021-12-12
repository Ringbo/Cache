diff --git a/graylog2-server/src/main/java/org/graylog2/shared/security/RestPermissions.java b/graylog2-server/src/main/java/org/graylog2/shared/security/RestPermissions.java
index e2636c4..8943904 100644
--- a/graylog2-server/src/main/java/org/graylog2/shared/security/RestPermissions.java
+++ b/graylog2-server/src/main/java/org/graylog2/shared/security/RestPermissions.java
@@ -235,7 +235,8 @@
             THROUGHPUT_READ,
             SAVEDSEARCHES_CREATE,
             SAVEDSEARCHES_EDIT,
-            SAVEDSEARCHES_READ
+            SAVEDSEARCHES_READ,
+            CLUSTER_CONFIG_ENTRY_READ
     ).build();
 
     protected static final Set<Permission> READER_BASE_PERMISSIONS = PERMISSIONS.stream()
