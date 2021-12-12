diff --git a/library/core/src/main/java/com/google/android/exoplayer2/text/ssa/SsaDecoder.java b/library/core/src/main/java/com/google/android/exoplayer2/text/ssa/SsaDecoder.java
index d2f5a67..12aa1e9 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/text/ssa/SsaDecoder.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/text/ssa/SsaDecoder.java
@@ -59,7 +59,7 @@
    */
   public SsaDecoder(List<byte[]> initializationData) {
     super("SsaDecoder");
-    if (initializationData != null) {
+    if (initializationData != null && initializationData.size() > 0) {
       haveInitializationData = true;
       String formatLine = new String(initializationData.get(0));
       Assertions.checkArgument(formatLine.startsWith(FORMAT_LINE_PREFIX));
