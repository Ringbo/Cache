diff --git a/testutils/src/main/java/com/google/android/exoplayer/testutil/FakeExtractorInput.java b/testutils/src/main/java/com/google/android/exoplayer/testutil/FakeExtractorInput.java
index b6f0544..2499431 100644
--- a/testutils/src/main/java/com/google/android/exoplayer/testutil/FakeExtractorInput.java
+++ b/testutils/src/main/java/com/google/android/exoplayer/testutil/FakeExtractorInput.java
@@ -212,7 +212,7 @@
       throw new EOFException();
     }
     if (position + length > data.length) {
-      throw new IOException("Attempted to move past end of data: (" + position + " + "
+      throw new EOFException("Attempted to move past end of data: (" + position + " + "
           + length + ") > " + data.length);
     }
     return true;
