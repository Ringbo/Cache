diff --git a/dubbo-rpc/dubbo-rpc-default/src/main/java/com/alibaba/dubbo/rpc/protocol/dubbo/telnet/InvokeTelnetHandler.java b/dubbo-rpc/dubbo-rpc-default/src/main/java/com/alibaba/dubbo/rpc/protocol/dubbo/telnet/InvokeTelnetHandler.java
index 1f1124b..50a6c76 100644
--- a/dubbo-rpc/dubbo-rpc-default/src/main/java/com/alibaba/dubbo/rpc/protocol/dubbo/telnet/InvokeTelnetHandler.java
+++ b/dubbo-rpc/dubbo-rpc-default/src/main/java/com/alibaba/dubbo/rpc/protocol/dubbo/telnet/InvokeTelnetHandler.java
@@ -136,7 +136,7 @@
         if (invoker != null) {
             if (invokeMethod != null) {
                 try {
-                    Object[] array = PojoUtils.realize(list.toArray(), invokeMethod.getParameterTypes());
+                    Object[] array = PojoUtils.realize(list.toArray(), invokeMethod.getParameterTypes(), invokeMethod.getGenericParameterTypes());
                     RpcContext.getContext().setLocalAddress(channel.getLocalAddress()).setRemoteAddress(channel.getRemoteAddress());
                     long start = System.currentTimeMillis();
                     Object result = invoker.invoke(new RpcInvocation(invokeMethod, array)).recreate();
