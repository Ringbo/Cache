diff --git a/library/src/main/java/com/google/android/exoplayer/extractor/ogg/VorbisUtil.java b/library/src/main/java/com/google/android/exoplayer/extractor/ogg/VorbisUtil.java
index 8d0e789..373be8f 100644
--- a/library/src/main/java/com/google/android/exoplayer/extractor/ogg/VorbisUtil.java
+++ b/library/src/main/java/com/google/android/exoplayer/extractor/ogg/VorbisUtil.java
@@ -187,7 +187,7 @@
     return modes;
   }
 
-  private static Mode[] readModes(VorbisBitArray bitArray) throws ParserException {
+  private static Mode[] readModes(VorbisBitArray bitArray) {
     int modeCount = bitArray.readBits(6) + 1;
     Mode[] modes = new Mode[modeCount];
     for (int i = 0; i < modeCount; i++) {
@@ -390,11 +390,10 @@
   }
 
   /**
-   * @see <a href="http://svn.xiph.org/trunk/vorbis/lib/sharedbook.c">function
-   *     _book_maptype1_quantvals</a> of libvorbis.
+   * @see <a href="http://svn.xiph.org/trunk/vorbis/lib/sharedbook.c">_book_maptype1_quantvals</a>
    */
   private static long mapType1QuantValues(long entries, long dimension) {
-    return (long) Math.floor(Math.pow((double) entries, 1.d / dimension));
+    return (long) Math.floor(Math.pow(entries, 1.d / dimension));
   }
 
   public static final class CodeBook {
