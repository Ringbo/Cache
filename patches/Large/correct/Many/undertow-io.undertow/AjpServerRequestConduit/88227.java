diff --git a/core/src/main/java/io/undertow/server/protocol/ajp/AjpServerRequestConduit.java b/core/src/main/java/io/undertow/server/protocol/ajp/AjpServerRequestConduit.java
index 7921bf1..3c80e07 100644
--- a/core/src/main/java/io/undertow/server/protocol/ajp/AjpServerRequestConduit.java
+++ b/core/src/main/java/io/undertow/server/protocol/ajp/AjpServerRequestConduit.java
@@ -234,7 +234,7 @@
             chunkRemaining = this.state & STATE_MASK;
         }
 
-        int limit = dst.remaining();
+        int limit = dst.limit();
         try {
             if (dst.remaining() > chunkRemaining) {
                 dst.limit((int) (dst.position() + chunkRemaining));
