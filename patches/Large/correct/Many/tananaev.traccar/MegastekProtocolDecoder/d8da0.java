diff --git a/src/org/traccar/protocol/MegastekProtocolDecoder.java b/src/org/traccar/protocol/MegastekProtocolDecoder.java
index 0c332d0..ca554aa 100644
--- a/src/org/traccar/protocol/MegastekProtocolDecoder.java
+++ b/src/org/traccar/protocol/MegastekProtocolDecoder.java
@@ -173,7 +173,7 @@
                     position.set(Position.KEY_CHARGE, Integer.parseInt(charger) == 1);
                 }
 
-                if (parser.hasNext(3)) {
+                if (parser.hasNext(4)) {
                     position.set(Position.KEY_MCC, parser.nextInt());
                     position.set(Position.KEY_MNC, parser.nextInt());
                     position.set(Position.KEY_LAC, parser.nextInt(16));
