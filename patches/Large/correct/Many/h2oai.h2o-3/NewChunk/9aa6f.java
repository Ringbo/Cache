diff --git a/h2o-core/src/main/java/water/fvec/NewChunk.java b/h2o-core/src/main/java/water/fvec/NewChunk.java
index 291a53b..bbf9760 100644
--- a/h2o-core/src/main/java/water/fvec/NewChunk.java
+++ b/h2o-core/src/main/java/water/fvec/NewChunk.java
@@ -804,7 +804,7 @@
       double d = l*PrettyPrint.pow10(x);
       if( d < min ) { min = d; llo=l; xlo=x; }
       if( d > max ) { max = d; lhi=l; xhi=x; }
-      floatOverflow = l < Integer.MIN_VALUE+1 && l > Integer.MAX_VALUE;
+      floatOverflow = l < Integer.MIN_VALUE+1 || l > Integer.MAX_VALUE;
       xmin = Math.min(xmin,x);
     }
 
@@ -879,10 +879,10 @@
     if( fpoint ) {
       if( (int)lemin == lemin && (int)lemax == lemax ) {
         if(leRange < 255) // Fits in scaled biased byte?
-          return new C1SChunk( bufX(lemin,xmin,C1SChunk._OFF,0),(int)lemin,PrettyPrint.pow10(xmin));
+          return new C1SChunk( bufX(lemin,xmin,C1SChunk._OFF,0),lemin,PrettyPrint.pow10(xmin));
         if(leRange < 65535) { // we use signed 2B short, add -32k to the bias!
           long bias = 32767 + lemin;
-          return new C2SChunk( bufX(bias,xmin,C2SChunk._OFF,1),(int)bias,PrettyPrint.pow10(xmin));
+          return new C2SChunk( bufX(bias,xmin,C2SChunk._OFF,1),bias,PrettyPrint.pow10(xmin));
         }
       }
       if(leRange < 4294967295l) {
@@ -899,14 +899,14 @@
     if( leRange < 255 ) {    // Span fits in a byte?
       if(0 <= min && max < 255 ) // Span fits in an unbiased byte?
         return new C1Chunk( bufX(0,0,C1Chunk._OFF,0));
-      return new C1SChunk( bufX(lemin,xmin,C1SChunk._OFF,0),(int)lemin,PrettyPrint.pow10i(xmin));
+      return new C1SChunk( bufX(lemin,xmin,C1SChunk._OFF,0),lemin,PrettyPrint.pow10i(xmin));
     }
 
     // Compress column into a short
     if( leRange < 65535 ) {               // Span fits in a biased short?
       if( xmin == 0 && Short.MIN_VALUE < lemin && lemax <= Short.MAX_VALUE ) // Span fits in an unbiased short?
         return new C2Chunk( bufX(0,0,C2Chunk._OFF,1));
-      int bias = (int)(lemin-(Short.MIN_VALUE+1));
+      long bias = (lemin-(Short.MIN_VALUE+1));
       return new C2SChunk( bufX(bias,xmin,C2SChunk._OFF,1),bias,PrettyPrint.pow10i(xmin));
     }
     // Compress column into ints
