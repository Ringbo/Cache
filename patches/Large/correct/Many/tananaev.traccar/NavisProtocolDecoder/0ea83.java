diff --git a/src/org/traccar/protocol/NavisProtocolDecoder.java b/src/org/traccar/protocol/NavisProtocolDecoder.java
index 5569b6a..c5dc9fb 100644
--- a/src/org/traccar/protocol/NavisProtocolDecoder.java
+++ b/src/org/traccar/protocol/NavisProtocolDecoder.java
@@ -59,11 +59,11 @@
         return false;
     }
 
-    private static class ParseResult {
+    private static final class ParseResult {
         private final long id;
         private final Position position;
 
-        public ParseResult(long id, Position position) {
+        private ParseResult(long id, Position position) {
             this.id = id;
             this.position = position;
         }
