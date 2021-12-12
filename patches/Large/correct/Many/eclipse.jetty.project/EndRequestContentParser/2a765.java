diff --git a/jetty-fcgi/fcgi-client/src/main/java/org/eclipse/jetty/fcgi/parser/EndRequestContentParser.java b/jetty-fcgi/fcgi-client/src/main/java/org/eclipse/jetty/fcgi/parser/EndRequestContentParser.java
index b8173bf..dc07bd5 100644
--- a/jetty-fcgi/fcgi-client/src/main/java/org/eclipse/jetty/fcgi/parser/EndRequestContentParser.java
+++ b/jetty-fcgi/fcgi-client/src/main/java/org/eclipse/jetty/fcgi/parser/EndRequestContentParser.java
@@ -20,6 +20,16 @@
 
 import java.nio.ByteBuffer;
 
+/**
+ * <p>Parser for the END_REQUEST frame body.</p>
+ * <pre>
+ * struct end_request_body {
+ *     uint applicationStatus;
+ *     ubyte protocolStatus;
+ *     ubyte[3] reserved;
+ * }
+ * </pre>
+ */
 public class EndRequestContentParser extends ContentParser
 {
     private final Parser.Listener listener;
@@ -80,7 +90,7 @@
                     }
                     else
                     {
-                        state = State.APPLICATION_BYTES;
+                        state = State.RESERVED_BYTES;
                         cursor = 0;
                         break;
                     }
@@ -88,7 +98,7 @@
                 case RESERVED_BYTES:
                 {
                     buffer.get();
-                    if (++cursor == 0)
+                    if (++cursor == 3)
                     {
                         onEnd();
                         reset();
