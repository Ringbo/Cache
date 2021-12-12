diff --git a/src/jvm/clojure/lang/Numbers.java b/src/jvm/clojure/lang/Numbers.java
index 043f9ae..8d5fd85 100644
--- a/src/jvm/clojure/lang/Numbers.java
+++ b/src/jvm/clojure/lang/Numbers.java
@@ -1436,7 +1436,7 @@
 		else
 			{
 			ISeq s = RT.seq(sizeOrSeq);
-			int size = s.count();
+			int size = RT.count(s);
 			float[] ret = new float[size];
 			for(int i = 0; i < size && s != null; i++, s = s.next())
 				ret[i] = ((Number) s.first()).floatValue();
@@ -1467,7 +1467,7 @@
 	else
 		{
 		ISeq s = RT.seq(sizeOrSeq);
-		int size = s.count();
+		int size = RT.count(s);
 		double[] ret = new double[size];
 		for(int i = 0; i < size && s != null; i++, s = s.next())
 			ret[i] = ((Number) s.first()).doubleValue();
@@ -1498,7 +1498,7 @@
 	else
 		{
 		ISeq s = RT.seq(sizeOrSeq);
-		int size = s.count();
+		int size = RT.count(s);
 		int[] ret = new int[size];
 		for(int i = 0; i < size && s != null; i++, s = s.next())
 			ret[i] = ((Number) s.first()).intValue();
@@ -1529,7 +1529,7 @@
 	else
 		{
 		ISeq s = RT.seq(sizeOrSeq);
-		int size = s.count();
+		int size = RT.count(s);
 		long[] ret = new long[size];
 		for(int i = 0; i < size && s != null; i++, s = s.next())
 			ret[i] = ((Number) s.first()).longValue();
