diff --git a/src/jvm/clojure/lang/Numbers.java b/src/jvm/clojure/lang/Numbers.java
index b89ee0e..6912e62 100644
--- a/src/jvm/clojure/lang/Numbers.java
+++ b/src/jvm/clojure/lang/Numbers.java
@@ -1493,7 +1493,7 @@
     return clearBit(x,bitOpsCast(y));
 }
 static public long clearBit(long x, long n){
-    return x & (1L << n);
+    return x & ~(1L << n);
 }
 
 static public long setBit(Object x, Object y){
