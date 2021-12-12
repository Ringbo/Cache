diff --git a/src/org/traccar/protocol/SanavProtocolDecoder.java b/src/org/traccar/protocol/SanavProtocolDecoder.java
index 6881571..763b51d 100644
--- a/src/org/traccar/protocol/SanavProtocolDecoder.java
+++ b/src/org/traccar/protocol/SanavProtocolDecoder.java
@@ -87,7 +87,7 @@
         position.setTime(dateBuilder.getDate());
 
         if (parser.hasNext()) {
-            int io = parser.nextInt();
+            int io = parser.nextHexInt();
             for (int i = 0; i < 5; i++) {
                 position.set(Position.PREFIX_IN + (i + 1), BitUtil.check(io, i));
             }
