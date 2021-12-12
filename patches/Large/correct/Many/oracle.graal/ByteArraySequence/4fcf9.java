diff --git a/sdk/src/org.graalvm.polyglot/src/org/graalvm/polyglot/io/ByteArraySequence.java b/sdk/src/org.graalvm.polyglot/src/org/graalvm/polyglot/io/ByteArraySequence.java
index 7331c0a..7f4498d 100644
--- a/sdk/src/org.graalvm.polyglot/src/org/graalvm/polyglot/io/ByteArraySequence.java
+++ b/sdk/src/org.graalvm.polyglot/src/org/graalvm/polyglot/io/ByteArraySequence.java
@@ -108,7 +108,7 @@
         if (l < 0) {
             throw new IndexOutOfBoundsException(String.valueOf(l));
         }
-        final int realStartIndex = startIndex + startIndex;
+        final int realStartIndex = start + startIndex;
         if (realStartIndex < 0) {
             throw new IndexOutOfBoundsException(String.valueOf(startIndex));
         }
