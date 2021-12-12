diff --git a/runtime/Java/src/org/antlr/v4/runtime/atn/PredictionContext.java b/runtime/Java/src/org/antlr/v4/runtime/atn/PredictionContext.java
index 2f4ed8d..baee9aa 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/atn/PredictionContext.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/atn/PredictionContext.java
@@ -331,7 +331,7 @@
 			int p = lastSlot; // walk backwards from last index until we find non-null parent
 			while ( p>=0 && mergedParents[p]==null ) { p--; }
 			// p is now last non-null index
-			assert p>0; // could only happen to be <0 if two arrays with $
+			assert p>=0; // could only happen to be <0 if two arrays with $
 			if ( p < lastSlot ) {
 				int n = p+1; // how many slots we really used in merge
 				if ( n == 1 ) { // for just one merged element, return singleton top
