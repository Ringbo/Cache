diff --git a/core/src/main/java/io/undertow/server/protocol/ajp/AjpServerRequestConduit.java b/core/src/main/java/io/undertow/server/protocol/ajp/AjpServerRequestConduit.java
index ade8add..7921bf1 100644
--- a/core/src/main/java/io/undertow/server/protocol/ajp/AjpServerRequestConduit.java
+++ b/core/src/main/java/io/undertow/server/protocol/ajp/AjpServerRequestConduit.java
@@ -234,9 +234,9 @@
             chunkRemaining = this.state & STATE_MASK;
         }
 
-        int limit = dst.limit();
+        int limit = dst.remaining();
         try {
-            if (limit > chunkRemaining) {
+            if (dst.remaining() > chunkRemaining) {
                 dst.limit((int) (dst.position() + chunkRemaining));
             }
             int read = next.read(dst);
