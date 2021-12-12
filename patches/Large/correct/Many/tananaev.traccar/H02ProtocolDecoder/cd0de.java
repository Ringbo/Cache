diff --git a/src/org/traccar/protocol/H02ProtocolDecoder.java b/src/org/traccar/protocol/H02ProtocolDecoder.java
index 83ed4b0..bb18a68 100644
--- a/src/org/traccar/protocol/H02ProtocolDecoder.java
+++ b/src/org/traccar/protocol/H02ProtocolDecoder.java
@@ -80,7 +80,7 @@
             }
 
         }
-        position.set(Position.KEY_IGNITION, !BitUtil.check(status, 10));
+        position.set(Position.KEY_IGNITION, BitUtil.check(status, 10));
         position.set(Position.KEY_STATUS, status);
     }
 
