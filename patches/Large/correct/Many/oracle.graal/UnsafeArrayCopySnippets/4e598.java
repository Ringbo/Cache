diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/UnsafeArrayCopySnippets.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/UnsafeArrayCopySnippets.java
index 695cdc3..78f9904 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/UnsafeArrayCopySnippets.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/UnsafeArrayCopySnippets.java
@@ -59,7 +59,7 @@
         long postLoopBytes;
 
         // We can easily vectorize the loop if both offsets have the same alignment.
-        if ((srcOffset % VECTOR_SIZE) == (destOffset % VECTOR_SIZE)) {
+        if (byteLength >= VECTOR_SIZE && (srcOffset % VECTOR_SIZE) == (destOffset % VECTOR_SIZE)) {
             preLoopBytes = NumUtil.roundUp(arrayBaseOffset + srcOffset, VECTOR_SIZE) - (arrayBaseOffset + srcOffset);
             postLoopBytes = (byteLength - preLoopBytes) % VECTOR_SIZE;
             mainLoopBytes = byteLength - preLoopBytes - postLoopBytes;
