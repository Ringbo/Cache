diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index fc6ee3a..8196352 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -635,7 +635,7 @@
         {
             MessageOut<RowMutation> message = rm.createMessage();
             for (InetAddress target : endpoints)
-                MessagingService.instance().sendRR(message, target, handler);
+                MessagingService.instance().sendRR(message, target, handler, false);
         }
     }
 
@@ -814,7 +814,7 @@
                     // (1.1 knows how to forward old-style String message IDs; updated to int in 2.0)
                     if (localDataCenter.equals(dc) || MessagingService.instance().getVersion(destination) < MessagingService.VERSION_20)
                     {
-                        MessagingService.instance().sendRR(message, destination, responseHandler);
+                        MessagingService.instance().sendRR(message, destination, responseHandler, true);
                     }
                     else
                     {
@@ -937,7 +937,7 @@
             }
             message = message.withParameter(RowMutation.FORWARD_TO, out.getData());
             // send the combined message + forward headers
-            int id = MessagingService.instance().sendRR(message, target, handler);
+            int id = MessagingService.instance().sendRR(message, target, handler, true);
             logger.trace("Sending message to {}@{}", id, target);
         }
         catch (IOException e)
@@ -1000,7 +1000,7 @@
             AbstractWriteResponseHandler responseHandler = new WriteResponseHandler(endpoint, WriteType.COUNTER);
 
             Tracing.trace("Enqueuing counter update to {}", endpoint);
-            MessagingService.instance().sendRR(cm.makeMutationMessage(), endpoint, responseHandler);
+            MessagingService.instance().sendRR(cm.makeMutationMessage(), endpoint, responseHandler, false);
             return responseHandler;
         }
     }
