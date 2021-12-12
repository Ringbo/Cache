diff --git a/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java b/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
index 1944152..d7d4d8e 100644
--- a/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
+++ b/rt/core/src/main/java/org/apache/cxf/endpoint/ClientImpl.java
@@ -560,7 +560,7 @@
             if (null != resContext) {
                 resContext.putAll(inMsg);
                 if (LOG.isLoggable(Level.FINE)) {
-                    LOG.fine("set responseContext to be" + responseContext);
+                    LOG.fine("set responseContext to be" + resContext);
                 }
             }
             resList = inMsg.getContent(List.class);
