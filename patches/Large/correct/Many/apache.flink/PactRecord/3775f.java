diff --git a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
index b83e458..0738200 100644
--- a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
+++ b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
@@ -643,14 +643,14 @@
 				// the remainder %8 comes first 
 				int col = numFields - 1;
 				int mask = 0;
-				for (int i = numFields & 0x7; i >= 0; i--, col--) {
+				for (int i = numFields & 0x7; i > 0; i--, col--) {
 					mask <<= 1;
 					mask |= (offsets[col] != NULL_INDICATOR_OFFSET) ? 0x1 : 0x0;
 				}
 				serializer.writeByte(mask);
 				
 				// now the eight-bit chunks
-				for (int i = numFields >>> 3; i >= 0; i--) {
+				for (int i = numFields >>> 3; i > 0; i--) {
 					mask = 0;
 					for (int k = 0; k < 8; k++, col--) {
 						mask <<= 1;
