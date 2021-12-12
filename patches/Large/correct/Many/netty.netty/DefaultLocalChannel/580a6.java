diff --git a/src/main/java/org/jboss/netty/channel/local/DefaultLocalChannel.java b/src/main/java/org/jboss/netty/channel/local/DefaultLocalChannel.java
index 94414d5..6b7fc38 100644
--- a/src/main/java/org/jboss/netty/channel/local/DefaultLocalChannel.java
+++ b/src/main/java/org/jboss/netty/channel/local/DefaultLocalChannel.java
@@ -114,7 +114,7 @@
             fireChannelClosed(pairedChannel);
         } finally {
             future.setSuccess();
-            if (localAddress != null) {
+            if (localAddress != null && getParent() == null) {
                 LocalChannelRegistry.unregister(localAddress);
             }
         }
