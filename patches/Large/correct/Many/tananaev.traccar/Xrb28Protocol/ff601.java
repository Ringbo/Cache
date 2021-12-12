diff --git a/src/org/traccar/protocol/Xrb28Protocol.java b/src/org/traccar/protocol/Xrb28Protocol.java
index bb8c4fa..e9b75dd 100644
--- a/src/org/traccar/protocol/Xrb28Protocol.java
+++ b/src/org/traccar/protocol/Xrb28Protocol.java
@@ -38,7 +38,7 @@
                 pipeline.addLast(new LineBasedFrameDecoder(1024));
                 pipeline.addLast(new StringEncoder());
                 pipeline.addLast(new StringDecoder());
-                pipeline.addLast(new Ardi01ProtocolDecoder(Xrb28Protocol.this));
+                pipeline.addLast(new Xrb28ProtocolDecoder(Xrb28Protocol.this));
             }
         });
     }
