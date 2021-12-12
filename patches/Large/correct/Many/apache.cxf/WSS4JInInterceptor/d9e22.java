diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
index 533fdc4..d9d4a83 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/WSS4JInInterceptor.java
@@ -413,7 +413,7 @@
                     SecurityToken tok = store.getToken(id);
                     if (tok != null) {
                         pc.setKey(tok.getSecret());
-                        pc.setCustomToken(tok.getAttachedReference());
+                        pc.setCustomToken(tok.getToken());
                         return;
                     }
                 }
