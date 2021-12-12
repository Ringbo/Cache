diff --git a/components/camel-netty4/src/main/java/org/apache/camel/component/netty4/codec/DatagramPacketObjectEncoder.java b/components/camel-netty4/src/main/java/org/apache/camel/component/netty4/codec/DatagramPacketObjectEncoder.java
index d57850e..9b903da 100644
--- a/components/camel-netty4/src/main/java/org/apache/camel/component/netty4/codec/DatagramPacketObjectEncoder.java
+++ b/components/camel-netty4/src/main/java/org/apache/camel/component/netty4/codec/DatagramPacketObjectEncoder.java
@@ -39,10 +39,10 @@
                           List<Object> out) throws Exception {
         if (msg.content() instanceof Serializable) {
             Serializable payload = (Serializable) msg.content();
-            ByteBuf buf = ctx.alloc().heapBuffer();
+            ByteBuf buf = ctx.alloc().buffer();
             delegateObjectEncoder.encode(ctx, payload, buf);
             AddressedEnvelope<Object, InetSocketAddress> addressedEnvelop = 
-                new DefaultAddressedEnvelope<Object, InetSocketAddress>(buf.retain(), msg.recipient(), msg.sender());
+                new DefaultAddressedEnvelope<Object, InetSocketAddress>(buf, msg.recipient(), msg.sender());
             out.add(addressedEnvelop);
         }
         
