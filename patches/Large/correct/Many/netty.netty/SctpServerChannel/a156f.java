diff --git a/transport/src/main/java/com/sun/nio/sctp/SctpServerChannel.java b/transport/src/main/java/com/sun/nio/sctp/SctpServerChannel.java
index eaf617e..2b47d1d 100644
--- a/transport/src/main/java/com/sun/nio/sctp/SctpServerChannel.java
+++ b/transport/src/main/java/com/sun/nio/sctp/SctpServerChannel.java
@@ -36,7 +36,7 @@
     }
 
     public abstract <T> T getOption(SctpSocketOption<T> name) throws IOException;
-    public abstract <T> SctpChannel setOption(SctpSocketOption<T> name, T value) throws IOException;
+    public abstract <T> SctpServerChannel setOption(SctpSocketOption<T> name, T value) throws IOException;
 
     public abstract Set<SocketAddress> getAllLocalAddresses() throws IOException;
 
