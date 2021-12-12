diff --git a/src/main/java/org/jsoup/helper/DataUtil.java b/src/main/java/org/jsoup/helper/DataUtil.java
index 3ac0edb..b9462dc 100644
--- a/src/main/java/org/jsoup/helper/DataUtil.java
+++ b/src/main/java/org/jsoup/helper/DataUtil.java
@@ -99,8 +99,8 @@
         boolean fullyRead = false;
 
         // read the start of the stream and look for a BOM or meta charset
-        input.mark(firstReadBufferSize);
-        ByteBuffer firstBytes = readToByteBuffer(input, firstReadBufferSize - 1); // -1 because we read one more to see if completed
+        input.mark(bufferSize);
+        ByteBuffer firstBytes = readToByteBuffer(input, firstReadBufferSize - 1); // -1 because we read one more to see if completed. First read is < buffer size, so can't be invalid.
         fullyRead = input.read() == -1;
         input.reset();
 
