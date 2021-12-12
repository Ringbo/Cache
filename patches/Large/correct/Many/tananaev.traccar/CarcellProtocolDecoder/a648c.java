diff --git a/src/org/traccar/protocol/CarcellProtocolDecoder.java b/src/org/traccar/protocol/CarcellProtocolDecoder.java
index e8c30f2..50b294f 100644
--- a/src/org/traccar/protocol/CarcellProtocolDecoder.java
+++ b/src/org/traccar/protocol/CarcellProtocolDecoder.java
@@ -141,7 +141,7 @@
 
             parser.next(); // panic button status
 
-            Integer painelStatus = parser.nextInt();
+            String painelStatus = parser.next();
             position.set(Position.KEY_ALARM, painelStatus.equals("1"));
             position.set("painel", painelStatus.equals("2"));
 
