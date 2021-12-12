diff --git a/driver-core/src/main/java/com/datastax/driver/core/SessionManager.java b/driver-core/src/main/java/com/datastax/driver/core/SessionManager.java
index 3c9f765..b91fbfa 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/SessionManager.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/SessionManager.java
@@ -276,7 +276,7 @@
 
             @Override
             public void onFailure(Throwable t) {
-                logger.error("Error creating pool to " + host, t);
+                logger.warn("Error creating pool to " + host, t);
                 future.set(false);
             }
         });
@@ -360,7 +360,7 @@
                             cluster.manager.logClusterNameMismatch(host, e.expectedClusterName, e.actualClusterName);
                             cluster.manager.triggerOnDown(host, false);
                         } else {
-                            logger.error("Error creating pool to " + host, t);
+                            logger.warn("Error creating pool to " + host, t);
                         }
                         future.set(false);
                     }
