diff --git a/src/java/voldemort/store/readonly/swapper/AdminStoreSwapper.java b/src/java/voldemort/store/readonly/swapper/AdminStoreSwapper.java
index 1e29bd1..c00dab2 100644
--- a/src/java/voldemort/store/readonly/swapper/AdminStoreSwapper.java
+++ b/src/java/voldemort/store/readonly/swapper/AdminStoreSwapper.java
@@ -212,7 +212,7 @@
                                 } else {
                                     logMessage += " The cluster.xml is up to date. We will retry with the same AdminClient.";
                                 }
-                                logger.info(logMessage);
+                                logger.info(logMessage, ve);
                                 attempt++;
                             } else {
                                 throw ve;
