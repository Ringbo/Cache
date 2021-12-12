diff --git a/vespaclient-container-plugin/src/main/java/com/yahoo/document/restapi/OperationHandlerImpl.java b/vespaclient-container-plugin/src/main/java/com/yahoo/document/restapi/OperationHandlerImpl.java
index f7bb2b1..540e220 100644
--- a/vespaclient-container-plugin/src/main/java/com/yahoo/document/restapi/OperationHandlerImpl.java
+++ b/vespaclient-container-plugin/src/main/java/com/yahoo/document/restapi/OperationHandlerImpl.java
@@ -41,13 +41,13 @@
     public static final int VISIT_TIMEOUT_MS = 120000;
     private final DocumentAccess documentAccess;
 
-    private static final class SyncSessionFactory extends ResourceFactory {
+    private static final class SyncSessionFactory extends ResourceFactory<SyncSession> {
         private final DocumentAccess documentAccess;
         SyncSessionFactory(DocumentAccess documentAccess) {
             this.documentAccess = documentAccess;
         }
         @Override
-        public Object create() {
+        public SyncSession create() {
             return documentAccess.createSyncSession(new SyncParameters());
         }
     }
