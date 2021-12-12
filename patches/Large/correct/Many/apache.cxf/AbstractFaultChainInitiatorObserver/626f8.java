diff --git a/rt/core/src/main/java/org/apache/cxf/interceptor/AbstractFaultChainInitiatorObserver.java b/rt/core/src/main/java/org/apache/cxf/interceptor/AbstractFaultChainInitiatorObserver.java
index a1b56c3..26d840a 100644
--- a/rt/core/src/main/java/org/apache/cxf/interceptor/AbstractFaultChainInitiatorObserver.java
+++ b/rt/core/src/main/java/org/apache/cxf/interceptor/AbstractFaultChainInitiatorObserver.java
@@ -87,7 +87,8 @@
                     faultMessage.put(FaultMode.class, mode);
                 }
                 //CXF-3981
-                if (message.get("javax.xml.ws.addressing.context.inbound") != null) {
+                if (message.get("org.apache.cxf.ws.rm.inbound") == null 
+                    &&  message.get("javax.xml.ws.addressing.context.inbound") != null) {
                     faultMessage.put("javax.xml.ws.addressing.context.inbound",
                                      message.get("javax.xml.ws.addressing.context.inbound"));
                 }
