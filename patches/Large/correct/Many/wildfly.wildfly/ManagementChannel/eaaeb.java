diff --git a/protocol/src/main/java/org/jboss/as/protocol/mgmt/ManagementChannel.java b/protocol/src/main/java/org/jboss/as/protocol/mgmt/ManagementChannel.java
index 3e07786..f34daa0 100644
--- a/protocol/src/main/java/org/jboss/as/protocol/mgmt/ManagementChannel.java
+++ b/protocol/src/main/java/org/jboss/as/protocol/mgmt/ManagementChannel.java
@@ -113,7 +113,7 @@
         private volatile ManagementOperationHandler operationHandler;
 
         private void handleRequest(final ManagementRequestHeader header, final DataInput input) throws IOException {
-            log.tracef("%s handling request %d(%d)", ManagementChannel.this, header.getBatchId());
+            log.tracef("%s handling request %d", ManagementChannel.this, header.getBatchId());
             final FlushableDataOutputImpl output = FlushableDataOutputImpl.create(writeMessage());
 
             Exception error = null;
@@ -139,7 +139,7 @@
             } catch (Exception e) {
                 throwFormattedException(e);
             } finally {
-                log.tracef("%s finished request %d", ManagementChannel.this);
+                log.tracef("%s finished request %d", ManagementChannel.this, header.getBatchId());
                 IoUtils.safeClose(output);
             }
         }
