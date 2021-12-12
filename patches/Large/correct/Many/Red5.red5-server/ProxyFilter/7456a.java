diff --git a/src/main/java/org/red5/server/net/proxy/ProxyFilter.java b/src/main/java/org/red5/server/net/proxy/ProxyFilter.java
index 4a791b5..b3d25e5 100644
--- a/src/main/java/org/red5/server/net/proxy/ProxyFilter.java
+++ b/src/main/java/org/red5/server/net/proxy/ProxyFilter.java
@@ -87,7 +87,7 @@
             if (log.isDebugEnabled()) {
                 log.debug("[{}] Closing: {}", name, forward);
             }
-            forward.closeNow();
+            forward.close(true);
         }
         next.sessionClosed(session);
     }
