diff --git a/client/src/main/java/org/asynchttpclient/ntlm/NtlmEngine.java b/client/src/main/java/org/asynchttpclient/ntlm/NtlmEngine.java
index 4d45f74..31e81f2 100644
--- a/client/src/main/java/org/asynchttpclient/ntlm/NtlmEngine.java
+++ b/client/src/main/java/org/asynchttpclient/ntlm/NtlmEngine.java
@@ -795,7 +795,7 @@
         }
 
         /** Get the message length */
-        protected int getMessageLength() {
+        protected final int getMessageLength() {
             return currentOutputPosition;
         }
 
@@ -808,7 +808,7 @@
         }
 
         /** Read a bunch of bytes from a position in the message buffer */
-        protected void readBytes(final byte[] buffer, final int position) throws NtlmEngineException {
+        protected final void readBytes(final byte[] buffer, final int position) throws NtlmEngineException {
             if (messageContents.length < position + buffer.length) {
                 throw new NtlmEngineException("NTLM: Message too short");
             }
@@ -821,12 +821,12 @@
         }
 
         /** Read a ulong from a position within the message buffer */
-        protected int readULong(final int position) throws NtlmEngineException {
+        protected final int readULong(final int position) throws NtlmEngineException {
             return NtlmEngine.readULong(messageContents, position);
         }
 
         /** Read a security buffer from a position within the message buffer */
-        protected byte[] readSecurityBuffer(final int position) throws NtlmEngineException {
+        protected final byte[] readSecurityBuffer(final int position) throws NtlmEngineException {
             return NtlmEngine.readSecurityBuffer(messageContents, position);
         }
 
