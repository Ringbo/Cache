diff --git a/src/main/java/org/tron/common/message/udp/UdpMessageTypeEnum.java b/src/main/java/org/tron/common/message/udp/UdpMessageTypeEnum.java
index d5b8183..7b5d96b 100644
--- a/src/main/java/org/tron/common/message/udp/UdpMessageTypeEnum.java
+++ b/src/main/java/org/tron/common/message/udp/UdpMessageTypeEnum.java
@@ -5,19 +5,19 @@
 
 public enum  UdpMessageTypeEnum {
 
-  DISCOVER_PING(0x01),
+  DISCOVER_PING((byte) 0x01),
 
-  DISCOVER_PONG(0x02),
+  DISCOVER_PONG((byte) 0x02),
 
-  DISCOVER_FIND_PEER(0x03),
+  DISCOVER_FIND_PEER((byte) 0x03),
 
-  DISCOVER_PEERS(0x04),
+  DISCOVER_PEERS((byte) 0x04),
 
-  LAST(0xFF);
+  LAST((byte) 0xFF);
 
-  private final int type;
+  private final byte type;
 
-  private static final Map<Integer, UdpMessageTypeEnum> intToTypeMap = new HashMap<>();
+  private static final Map<Byte, UdpMessageTypeEnum> intToTypeMap = new HashMap<>();
 
   static {
     for (UdpMessageTypeEnum value : values()) {
@@ -25,11 +25,11 @@
     }
   }
 
-  UdpMessageTypeEnum(int type) {
+  UdpMessageTypeEnum(byte type) {
     this.type = type;
   }
 
-  public static UdpMessageTypeEnum fromInt(int i) {
+  public static UdpMessageTypeEnum fromByte(byte i) {
     return intToTypeMap.get(i);
   }
 }
