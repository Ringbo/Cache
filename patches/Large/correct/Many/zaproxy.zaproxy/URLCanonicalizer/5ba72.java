diff --git a/src/org/zaproxy/zap/spider/URLCanonicalizer.java b/src/org/zaproxy/zap/spider/URLCanonicalizer.java
index d8c3cd0..2c0f0e9 100644
--- a/src/org/zaproxy/zap/spider/URLCanonicalizer.java
+++ b/src/org/zaproxy/zap/spider/URLCanonicalizer.java
@@ -126,7 +126,7 @@
 			 * Normalize: no empty segments (i.e., "//"), no segments equal to ".", and no segments equal to
 			 * ".." that are preceded by a segment not equal to "..".
 			 */
-			String path = canonicalURI.normalize().getPath();
+			String path = canonicalURI.normalize().getRawPath();
 
 			/* Convert '//' -> '/' */
 			int idx = path.indexOf("//");
