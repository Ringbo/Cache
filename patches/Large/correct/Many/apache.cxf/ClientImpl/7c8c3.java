diff --git a/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java b/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
index c0df910..9fbdd87 100644
--- a/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
+++ b/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
@@ -826,7 +826,7 @@
             }
         } finally {
             synchronized (message.getExchange()) {
-                if (!isPartialResponse(message) && callback == null) {
+                if (!isPartialResponse(message) || callback == null) {
                     message.getExchange().put(FINISHED, Boolean.TRUE);
                     message.getExchange().setInMessage(message);
                     message.getExchange().notifyAll();
