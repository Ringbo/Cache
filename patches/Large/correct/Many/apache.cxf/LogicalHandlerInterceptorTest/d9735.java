diff --git a/rt/frontend/jaxws/src/test/java/org/apache/cxf/jaxws/handler/LogicalHandlerInterceptorTest.java b/rt/frontend/jaxws/src/test/java/org/apache/cxf/jaxws/handler/LogicalHandlerInterceptorTest.java
index ca2d01b..6a5d2a7 100644
--- a/rt/frontend/jaxws/src/test/java/org/apache/cxf/jaxws/handler/LogicalHandlerInterceptorTest.java
+++ b/rt/frontend/jaxws/src/test/java/org/apache/cxf/jaxws/handler/LogicalHandlerInterceptorTest.java
@@ -87,7 +87,7 @@
         });
         expect(invoker.getLogicalHandlers()).andReturn(list);
         expect(message.getExchange()).andReturn(exchange).anyTimes();
-        expect(message.containsKey(Message.REQUESTOR_ROLE)).andReturn(Boolean.TRUE).anyTimes();
+        expect(message.get(Message.REQUESTOR_ROLE)).andReturn(Boolean.TRUE).anyTimes();
         expect(message.keySet()).andReturn(new TreeSet<String>()).anyTimes();
         expect(exchange.get(HandlerChainInvoker.class)).andReturn(invoker);
         expect(exchange.getOutMessage()).andReturn(message);
