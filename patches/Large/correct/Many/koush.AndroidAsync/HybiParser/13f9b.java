diff --git a/AndroidAsync/src/com/koushikdutta/async/http/HybiParser.java b/AndroidAsync/src/com/koushikdutta/async/http/HybiParser.java
index 3591ead..79cc7a0 100644
--- a/AndroidAsync/src/com/koushikdutta/async/http/HybiParser.java
+++ b/AndroidAsync/src/com/koushikdutta/async/http/HybiParser.java
@@ -222,7 +222,7 @@
             throw new ProtocolError("Bad opcode");
         }
 
-        if (FRAGMENTED_OPCODES.contains(mOpcode) && !mFinal) {
+        if (!FRAGMENTED_OPCODES.contains(mOpcode) && !mFinal) {
             throw new ProtocolError("Expected non-final packet");
         }
 
