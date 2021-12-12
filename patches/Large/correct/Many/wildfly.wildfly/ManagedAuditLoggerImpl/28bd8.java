diff --git a/controller/src/main/java/org/jboss/as/controller/audit/ManagedAuditLoggerImpl.java b/controller/src/main/java/org/jboss/as/controller/audit/ManagedAuditLoggerImpl.java
index 3ddbdc7..c4dccef 100644
--- a/controller/src/main/java/org/jboss/as/controller/audit/ManagedAuditLoggerImpl.java
+++ b/controller/src/main/java/org/jboss/as/controller/audit/ManagedAuditLoggerImpl.java
@@ -284,7 +284,7 @@
         config.lock();
         try {
             AuditLogHandler existing = config.getConfiguredHandler(handler.getName());
-            if (!handler.isDifferent(existing)){
+            if (handler.isDifferent(existing)){
                 if (handlerUpdateTask == null){
                     handlerUpdateTask = new HandlerUpdateTask();
                 }
