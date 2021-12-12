diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/AtomicBiInteger.java b/jetty-util/src/main/java/org/eclipse/jetty/util/AtomicBiInteger.java
index ef03530..ee679b1 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/AtomicBiInteger.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/AtomicBiInteger.java
@@ -265,7 +265,7 @@
     public static long encodeHi(long encoded, int hi)
     {
         long h = ((long)hi)&0xFFFF_FFFFL;
-        long l = encoded&0xFFFF_FFFFl;
+        long l = encoded&0xFFFF_FFFFL;
         return (h<<32)+l;
     }
     
@@ -278,7 +278,7 @@
      */
     public static long encodeLo(long encoded, int lo)
     {
-        long h = (encoded>>32)&0xFFFF_FFFFl;
+        long h = (encoded>>32)&0xFFFF_FFFFL;
         long l = ((long)lo)&0xFFFF_FFFFL;
         return (h<<32)+l;
     }
