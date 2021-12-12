diff --git a/src/jvm/clojure/lang/Util.java b/src/jvm/clojure/lang/Util.java
index eb94bfb..a3306db 100644
--- a/src/jvm/clojure/lang/Util.java
+++ b/src/jvm/clojure/lang/Util.java
@@ -35,6 +35,7 @@
 	return k1 != null && k1.equals(k2);
 }
 
+//*
 static public boolean equals(long x, long y){
 	return x == y;
 }
@@ -44,20 +45,21 @@
 }
 
 static public boolean equals(long x, Object y){
-	return equals((Object)x,y);
+	return equals(Numbers.num(x),y);
 }
 
 static public boolean equals(Object x, long y){
-	return equals(x,(Object)y);
+	return equals(x,Numbers.num(y));
 }
 
 static public boolean equals(double x, Object y){
-	return equals((Object)x,y);
+	return equals((Double)x,y);
 }
 
 static public boolean equals(Object x, double y){
-	return equals(x,(Object)y);
+	return equals(x,(Double)y);
 }
+//*/
 
 static public boolean identical(Object k1, Object k2){
 	return k1 == k2;
