diff --git a/src/org/traccar/protocol/ST210ProtocolDecoder.java b/src/org/traccar/protocol/ST210ProtocolDecoder.java
index 2f9bcd8..d41a78d 100644
--- a/src/org/traccar/protocol/ST210ProtocolDecoder.java
+++ b/src/org/traccar/protocol/ST210ProtocolDecoder.java
@@ -614,7 +614,7 @@
         	Log.info("MESSAGE DECODED WITH SUCCESS!");
         }
         catch(Exception e){
-        	Log.info("ERROR WHILE DECODING MESSAGE: " + e.getMessage());
+        	Log.severe("ERROR WHILE DECODING MESSAGE: " + e.getMessage());
         }
         
         return position;
