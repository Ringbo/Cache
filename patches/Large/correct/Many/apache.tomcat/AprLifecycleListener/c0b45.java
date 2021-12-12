diff --git a/java/org/apache/catalina/core/AprLifecycleListener.java b/java/org/apache/catalina/core/AprLifecycleListener.java
index 425a727..4305807 100644
--- a/java/org/apache/catalina/core/AprLifecycleListener.java
+++ b/java/org/apache/catalina/core/AprLifecycleListener.java
@@ -86,7 +86,7 @@
                     if (!log.isDebugEnabled()) {
                         log.info(sm.getString("aprListener.sslInit"));
                     } else {
-                        log.debug(sm.getString("aprListener.sslInit"));
+                        log.debug(sm.getString("aprListener.sslInit"), t);
                     }
                 }
             }
