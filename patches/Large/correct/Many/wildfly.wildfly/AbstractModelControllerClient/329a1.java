diff --git a/controller-client/src/main/java/org/jboss/as/controller/client/impl/AbstractModelControllerClient.java b/controller-client/src/main/java/org/jboss/as/controller/client/impl/AbstractModelControllerClient.java
index 706c1d3..aed4e33 100644
--- a/controller-client/src/main/java/org/jboss/as/controller/client/impl/AbstractModelControllerClient.java
+++ b/controller-client/src/main/java/org/jboss/as/controller/client/impl/AbstractModelControllerClient.java
@@ -234,7 +234,7 @@
                         throw new IOException(e);
                     } finally {
                         ManagementBatchIdManager.DEFAULT.freeBatchId(getBatchId());
-                        activeRequests.remove(getCurrentRequestId());
+                        activeRequests.remove(getBatchId());
                         executeRequestContext.done();
                     }
                 }
