diff --git a/h2o-core/src/main/java/water/UDP.java b/h2o-core/src/main/java/water/UDP.java
index 41a3504..8881bb5 100644
--- a/h2o-core/src/main/java/water/UDP.java
+++ b/h2o-core/src/main/java/water/UDP.java
@@ -56,7 +56,7 @@
   static char hex(int x) { x &= 0xf; return (char)(x+((x<10)?'0':('a'-10))); }
   String print16( AutoBuffer ab ) {
     for( int i=0; i<16; i++ ) {
-      int b = ab.get1();
+      int b = ab.get1U();
       cs[(i<<1)     ] = hex(b>>4);
       cs[(i<<1)+1   ] = hex(b   );
     }
