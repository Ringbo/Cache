diff --git a/dubbo-rpc/dubbo-rpc-api/src/main/java/com/alibaba/dubbo/rpc/protocol/AbstractInvoker.java b/dubbo-rpc/dubbo-rpc-api/src/main/java/com/alibaba/dubbo/rpc/protocol/AbstractInvoker.java
index eee7db4..2d8c8d9 100644
--- a/dubbo-rpc/dubbo-rpc-api/src/main/java/com/alibaba/dubbo/rpc/protocol/AbstractInvoker.java
+++ b/dubbo-rpc/dubbo-rpc-api/src/main/java/com/alibaba/dubbo/rpc/protocol/AbstractInvoker.java
@@ -136,7 +136,14 @@
         }
         Map<String, String> context = RpcContext.getContext().getAttachments();
         if (context != null) {
-            invocation.addAttachmentsIfAbsent(context);
+            /**
+             * invocation.addAttachmentsIfAbsent(context){@link RpcInvocation#addAttachmentsIfAbsent(Map)}should not be used here,
+             * because the {@link RpcContext#setAttachment(String, String)} is passed in the Filter when the call is triggered
+             * by the built-in retry mechanism of the Dubbo. The attachment to update RpcContext will no longer work, which is
+             * a mistake in most cases (for example, through Filter to RpcContext output traceId and spanId and other information).
+             * yizhenqiang 20180310
+             */
+            invocation.addAttachments(context);
         }
         if (getUrl().getMethodParameter(invocation.getMethodName(), Constants.ASYNC_KEY, false)) {
             invocation.setAttachment(Constants.ASYNC_KEY, Boolean.TRUE.toString());
