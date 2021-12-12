diff --git a/engine/src/main/java/org/terasology/audio/loaders/OggStreamingSoundData.java b/engine/src/main/java/org/terasology/audio/loaders/OggStreamingSoundData.java
index aab6911..84cef37 100644
--- a/engine/src/main/java/org/terasology/audio/loaders/OggStreamingSoundData.java
+++ b/engine/src/main/java/org/terasology/audio/loaders/OggStreamingSoundData.java
@@ -51,7 +51,7 @@
     public ByteBuffer readNextInto(ByteBuffer dataBuffer) {
         try {
             reader.read(dataBuffer, 0, dataBuffer.capacity());
-            dataBuffer.rewind();
+            dataBuffer.flip();
             return dataBuffer;
         } catch (IOException e) {
             throw new RuntimeException("Error reading from sound stream at " + url, e);
