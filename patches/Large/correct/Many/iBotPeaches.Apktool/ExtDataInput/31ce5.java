diff --git a/brut.j.util/src/main/java/brut/util/ExtDataInput.java b/brut.j.util/src/main/java/brut/util/ExtDataInput.java
index 72ef414..72f4e15 100644
--- a/brut.j.util/src/main/java/brut/util/ExtDataInput.java
+++ b/brut.j.util/src/main/java/brut/util/ExtDataInput.java
@@ -69,7 +69,7 @@
     public void skipCheckChunkTypeInt(int expected, int possible) throws IOException {
         int got = readInt();
 
-        if (got == possible) {
+        if (got == possible || got < expected) {
             skipCheckChunkTypeInt(expected, -1);
         } else if (got != expected) {
             throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", expected, got));
