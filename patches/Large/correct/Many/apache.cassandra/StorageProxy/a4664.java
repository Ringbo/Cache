diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index 269d68f..1a41aaa 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -619,14 +619,15 @@
             }
             else if (targetVersion == MessagingService.current_version)
             {
-                MessagingService.instance().sendRR(message, target, handler);
+                MessagingService.instance().sendRR(message, target, handler, false);
             }
             else
             {
                 MessagingService.instance().sendRR(BatchlogManager.getBatchlogMutationFor(mutations, uuid, targetVersion)
                                                                   .createMessage(),
                                                    target,
-                                                   handler);
+                                                   handler,
+                                                   false);
             }
         }
 
