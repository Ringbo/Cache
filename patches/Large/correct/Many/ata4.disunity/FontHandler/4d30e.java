diff --git a/src/info/ata4/unity/cli/extract/FontHandler.java b/src/info/ata4/unity/cli/extract/FontHandler.java
index d51de05..79414eb 100644
--- a/src/info/ata4/unity/cli/extract/FontHandler.java
+++ b/src/info/ata4/unity/cli/extract/FontHandler.java
@@ -23,7 +23,7 @@
     public void extract(UnityObject obj) throws IOException {
         String name = obj.getValue("m_Name");
         ByteBuffer fontBuffer = obj.getValue("m_FontData");
-        if (fontBuffer.capacity() > 0) {
+        if (fontBuffer != null && fontBuffer.capacity() > 0) {
             setOutputFileName(name);
             // TODO: detect OpenType fonts and use "otf" in these cases
             setOutputFileExtension("ttf");
