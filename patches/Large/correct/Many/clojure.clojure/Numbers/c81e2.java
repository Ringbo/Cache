diff --git a/src/jvm/clojure/lang/Numbers.java b/src/jvm/clojure/lang/Numbers.java
index 5f56ab5..47bac98 100644
--- a/src/jvm/clojure/lang/Numbers.java
+++ b/src/jvm/clojure/lang/Numbers.java
@@ -1277,7 +1277,7 @@
 			int size = s.count();
 			float[] ret = new float[size];
 			for(int i = 0; i < size && s != null; i++, s = s.rest())
-				ret[i] = ((Number) s.first()).intValue();
+				ret[i] = ((Number) s.first()).floatValue();
 			return ret;
 			}
 	}
@@ -1308,7 +1308,7 @@
 		int size = s.count();
 		double[] ret = new double[size];
 		for(int i = 0; i < size && s != null; i++, s = s.rest())
-			ret[i] = ((Number) s.first()).intValue();
+			ret[i] = ((Number) s.first()).doubleValue();
 		return ret;
 		}
 }
@@ -1370,7 +1370,7 @@
 		int size = s.count();
 		long[] ret = new long[size];
 		for(int i = 0; i < size && s != null; i++, s = s.rest())
-			ret[i] = ((Number) s.first()).intValue();
+			ret[i] = ((Number) s.first()).longValue();
 		return ret;
 		}
 }
