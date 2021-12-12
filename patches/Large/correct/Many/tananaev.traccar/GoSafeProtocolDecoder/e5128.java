diff --git a/src/org/traccar/protocol/GoSafeProtocolDecoder.java b/src/org/traccar/protocol/GoSafeProtocolDecoder.java
index deeea23..94d12e9 100644
--- a/src/org/traccar/protocol/GoSafeProtocolDecoder.java
+++ b/src/org/traccar/protocol/GoSafeProtocolDecoder.java
@@ -156,7 +156,7 @@
 
         position.set(Position.KEY_HDOP, parser.next());
 
-        if (parser.hasNext(4)) {
+        if (parser.hasNext(5)) {
             position.setNetwork(new Network(CellTower.from(
                     parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16), parser.nextInt())));
         }
