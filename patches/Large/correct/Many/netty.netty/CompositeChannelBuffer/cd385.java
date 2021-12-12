diff --git a/src/main/java/org/jboss/netty/buffer/CompositeChannelBuffer.java b/src/main/java/org/jboss/netty/buffer/CompositeChannelBuffer.java
index 1af020d..8d072f4 100644
--- a/src/main/java/org/jboss/netty/buffer/CompositeChannelBuffer.java
+++ b/src/main/java/org/jboss/netty/buffer/CompositeChannelBuffer.java
@@ -220,7 +220,7 @@
             throws IOException {
         // XXX Gathering write is not supported because of a known issue.
         //     See http://bugs.sun.com/view_bug.do?bug_id=6210541
-        return out.write(toByteBuffer());
+        return out.write(toByteBuffer(index, length));
     }
 
     public void getBytes(int index, OutputStream out, int length)
