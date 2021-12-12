diff --git a/src/test/java/com/corundumstudio/socketio/parser/DecoderBaseTest.java b/src/test/java/com/corundumstudio/socketio/parser/DecoderBaseTest.java
index 96d90bf..c4ada85 100644
--- a/src/test/java/com/corundumstudio/socketio/parser/DecoderBaseTest.java
+++ b/src/test/java/com/corundumstudio/socketio/parser/DecoderBaseTest.java
@@ -35,7 +35,7 @@
 
     @Before
     public void before() {
-        decoder = new PacketDecoder(new JacksonJsonSupport(), new NamespacesHub(new Configuration()), ackManager);
+        decoder = new PacketDecoder(new JacksonJsonSupport(), ackManager);
     }
 
 }
