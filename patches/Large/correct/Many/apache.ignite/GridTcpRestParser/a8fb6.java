diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/rest/protocols/tcp/GridTcpRestParser.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/rest/protocols/tcp/GridTcpRestParser.java
index 1d6f4ce..98a7753 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/rest/protocols/tcp/GridTcpRestParser.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/rest/protocols/tcp/GridTcpRestParser.java
@@ -69,7 +69,7 @@
                     // Skip header.
                     buf.get();
 
-                    state.packetType(GridClientPacketType.GRIDGAIN);
+                    state.packetType(GridClientPacketType.IGNITE);
 
                     break;
 
@@ -77,7 +77,7 @@
                     // Skip header.
                     buf.get();
 
-                    state.packetType(GridClientPacketType.GRIDGAIN_HANDSHAKE);
+                    state.packetType(GridClientPacketType.IGNITE_HANDSHAKE);
 
                     break;
 
@@ -95,12 +95,12 @@
 
                 break;
 
-            case GRIDGAIN_HANDSHAKE:
+            case IGNITE_HANDSHAKE:
                 res = parseHandshake(buf, state);
 
                 break;
 
-            case GRIDGAIN:
+            case IGNITE:
                 res = parseCustomPacket(ses, buf, state);
 
                 break;
@@ -251,7 +251,7 @@
      * @return True if a hint was parsed, false if still need more bytes to parse.
      */
     @Nullable private GridClientMessage parseHandshake(ByteBuffer buf, ParserState state) {
-        assert state.packetType() == GridClientPacketType.GRIDGAIN_HANDSHAKE;
+        assert state.packetType() == GridClientPacketType.IGNITE_HANDSHAKE;
 
         int idx = state.index();
 
@@ -306,7 +306,7 @@
      */
     @Nullable private GridClientMessage parseCustomPacket(GridNioSession ses, ByteBuffer buf, ParserState state)
         throws IOException, IgniteCheckedException {
-        assert state.packetType() == GridClientPacketType.GRIDGAIN;
+        assert state.packetType() == GridClientPacketType.IGNITE;
         assert state.packet() == null;
 
         ByteArrayOutputStream tmp = state.buffer();
