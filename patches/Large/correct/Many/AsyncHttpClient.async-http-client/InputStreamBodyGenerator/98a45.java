diff --git a/src/main/java/com/ning/http/client/generators/InputStreamBodyGenerator.java b/src/main/java/com/ning/http/client/generators/InputStreamBodyGenerator.java
index c978758..2672041 100644
--- a/src/main/java/com/ning/http/client/generators/InputStreamBodyGenerator.java
+++ b/src/main/java/com/ning/http/client/generators/InputStreamBodyGenerator.java
@@ -67,7 +67,7 @@
         public long read(ByteBuffer buffer) throws IOException {
 
             // To be safe.
-            chunk = new byte[buffer.capacity() - 10];
+            chunk = new byte[buffer.remaining() - 10];
 
 
             int read = -1;
