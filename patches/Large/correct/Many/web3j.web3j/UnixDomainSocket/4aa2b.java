diff --git a/core/src/main/java/org/web3j/protocol/ipc/UnixDomainSocket.java b/core/src/main/java/org/web3j/protocol/ipc/UnixDomainSocket.java
index 8f5e8fb..a2a9771 100644
--- a/core/src/main/java/org/web3j/protocol/ipc/UnixDomainSocket.java
+++ b/core/src/main/java/org/web3j/protocol/ipc/UnixDomainSocket.java
@@ -59,15 +59,15 @@
     @Override
     public String read() throws IOException {
         CharBuffer response = CharBuffer.allocate(bufferSize);
-        String result = "";
+        StringBuilder result = new StringBuilder();
 
         do {
             response.clear();
             reader.read(response);
-            result += new String(response.array(), response.arrayOffset(), response.position());
+            result.append(response.array(), response.arrayOffset(), response.position());
         } while (response.get(response.position() - 1) != '\n');
 
-        return result;
+        return result.toString();
     }
 
     @Override
