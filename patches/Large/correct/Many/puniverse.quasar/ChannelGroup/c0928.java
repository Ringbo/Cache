diff --git a/src/main/java/co/paralleluniverse/strands/channels/ChannelGroup.java b/src/main/java/co/paralleluniverse/strands/channels/ChannelGroup.java
index 3bea5bb..078c074 100644
--- a/src/main/java/co/paralleluniverse/strands/channels/ChannelGroup.java
+++ b/src/main/java/co/paralleluniverse/strands/channels/ChannelGroup.java
@@ -44,7 +44,7 @@
      * @param channels The member channels
      */
     public ChannelGroup(Collection<? extends Message> channels) {
-        this.channels = (Channel<? extends Message>[]) channels.toArray();
+        this.channels = (Channel<? extends Message>[]) channels.toArray(new Channel[channels.size()]);
     }
 
     /**
