diff --git a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
index f4b8eec..0e64575 100644
--- a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
+++ b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
@@ -161,7 +161,7 @@
 
     private ResTypeSpec readSingleTableTypeSpec() throws AndrolibException, IOException {
         checkChunkType(Header.TYPE_SPEC_TYPE);
-        byte id = mIn.readByte();
+        int id = mIn.readUnsignedByte();
         mIn.skipBytes(3);
         int entryCount = mIn.readInt();
 
@@ -177,7 +177,7 @@
 
     private ResType readTableType() throws IOException, AndrolibException {
         checkChunkType(Header.TYPE_TYPE);
-        byte typeId = mIn.readByte();
+        int typeId = mIn.readUnsignedByte();
         if (mResTypeSpecs.containsKey(typeId)) {
             mResId = (0xff000000 & mResId) | mResTypeSpecs.get(typeId).getId() << 16;
             mTypeSpec = mResTypeSpecs.get(typeId);
@@ -502,7 +502,7 @@
     private ResType mType;
     private int mResId;
     private boolean[] mMissingResSpecs;
-    private HashMap<Byte, ResTypeSpec> mResTypeSpecs = new HashMap<>();
+    private HashMap<Integer, ResTypeSpec> mResTypeSpecs = new HashMap<>();
 
     private final static short ENTRY_FLAG_COMPLEX = 0x0001;
 
