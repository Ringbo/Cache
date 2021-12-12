diff --git a/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist.java b/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist.java
index 102fe6e..db4f041 100644
--- a/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist.java
+++ b/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist.java
@@ -33,24 +33,64 @@
    */
   public static final class Segment implements Comparable<Long> {
 
+    /**
+     * The url of the segment.
+     */
     public final String url;
+    /**
+     * The duration of the segment in microseconds, as defined by #EXTINF.
+     */
     public final long durationUs;
+    /**
+     * The number of #EXT-X-DISCONTINUITY tags in the playlist before the segment.
+     */
     public final int relativeDiscontinuitySequence;
+    /**
+     * The start time of the segment in microseconds, relative to the start of the playlist.
+     */
     public final long relativeStartTimeUs;
+    /**
+     * Whether the segment is encrypted, as defined by #EXT-X-KEY.
+     */
     public final boolean isEncrypted;
+    /**
+     * The encryption key uri as defined by #EXT-X-KEY, or null if the segment is not encrypted.
+     */
     public final String encryptionKeyUri;
+    /**
+     * The encryption initialization vector as defined by #EXT-X-KEY, or null if the segment is not
+     * encrypted.
+     */
     public final String encryptionIV;
+    /**
+     * The segment's byte range offset, as defined by #EXT-X-BYTERANGE.
+     */
     public final long byterangeOffset;
+    /**
+     * The segment's byte range length, as defined by #EXT-X-BYTERANGE, or {@link C#LENGTH_UNSET} if
+     * no byte range is specified.
+     */
     public final long byterangeLength;
 
     public Segment(String uri, long byterangeOffset, long byterangeLength) {
       this(uri, 0, -1, C.TIME_UNSET, false, null, null, byterangeOffset, byterangeLength);
     }
 
-    public Segment(String uri, long durationUs, int relativeDiscontinuitySequence,
+    /**
+     * @param url See {@link #url}.
+     * @param durationUs See {@link #durationUs}.
+     * @param relativeDiscontinuitySequence See {@link #relativeDiscontinuitySequence}.
+     * @param relativeStartTimeUs See {@link #relativeStartTimeUs}.
+     * @param isEncrypted See {@link #isEncrypted}.
+     * @param encryptionKeyUri See {@link #encryptionKeyUri}.
+     * @param encryptionIV See {@link #encryptionIV}.
+     * @param byterangeOffset See {@link #byterangeOffset}.
+     * @param byterangeLength See {@link #byterangeLength}.
+     */
+    public Segment(String url, long durationUs, int relativeDiscontinuitySequence,
         long relativeStartTimeUs, boolean isEncrypted, String encryptionKeyUri, String encryptionIV,
         long byterangeOffset, long byterangeLength) {
-      this.url = uri;
+      this.url = url;
       this.durationUs = durationUs;
       this.relativeDiscontinuitySequence = relativeDiscontinuitySequence;
       this.relativeStartTimeUs = relativeStartTimeUs;
@@ -84,7 +124,7 @@
    */
   @PlaylistType public final int playlistType;
   /**
-   * The start offset as defined by #EXT-X-START in microseconds.
+   * The start offset in microseconds, as defined by #EXT-X-START.
    */
   public final long startOffsetUs;
   /**
@@ -96,19 +136,21 @@
    */
   public final boolean hasDiscontinuitySequence;
   /**
-   * The discontinuity sequence number.
+   * The discontinuity sequence number of the first media segment in the playlist, as defined by
+   * #EXT-X-DISCONTINUITY-SEQUENCE.
    */
   public final int discontinuitySequence;
   /**
-   * The media sequence number as defined by #EXT-X-MEDIA-SEQUENCE.
+   * The media sequence number of the first media segment in the playlist, as defined by
+   * #EXT-X-MEDIA-SEQUENCE.
    */
   public final int mediaSequence;
   /**
-   * The compatibility version as defined by #EXT-X-VERSION.
+   * The compatibility version, as defined by #EXT-X-VERSION.
    */
   public final int version;
   /**
-   * The target duration as defined by #EXT-X-TARGETDURATION in microseconds.
+   * The target duration in microseconds, as defined by #EXT-X-TARGETDURATION.
    */
   public final long targetDurationUs;
   /**
@@ -124,7 +166,7 @@
    */
   public final boolean hasProgramDateTime;
   /**
-   * The initialization segment as defined by #EXT-X-MAP.
+   * The initialization segment, as defined by #EXT-X-MAP.
    */
   public final Segment initializationSegment;
   /**
@@ -203,8 +245,6 @@
 
   /**
    * Returns the result of adding the duration of the playlist to its start time.
-   *
-   * @return The result of adding the duration of the playlist to its start time.
    */
   public long getEndTimeUs() {
     return startTimeUs + durationUs;
