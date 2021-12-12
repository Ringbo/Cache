diff --git a/src/org/amse/ys/zip/DeflatingDecompressor.java b/src/org/amse/ys/zip/DeflatingDecompressor.java
index b7de162..d885754 100644
--- a/src/org/amse/ys/zip/DeflatingDecompressor.java
+++ b/src/org/amse/ys/zip/DeflatingDecompressor.java
@@ -74,7 +74,7 @@
 				fillOutBuffer();
 			}
 			if (myOutBufferLength == 0) {
-				if (myInflatorId != -1) {
+				if (myInflatorId == -1) {
 					throw new ZipException("cannot read from zip");
 				} else {
 					len -= toFill;
@@ -107,7 +107,7 @@
 			fillOutBuffer();
 		}
 		if (myOutBufferLength == 0) {
-			if (myInflatorId != -1) {
+			if (myInflatorId == -1) {
 				throw new ZipException("cannot read from zip");
 			} else {
 				myAvailable = 0;
