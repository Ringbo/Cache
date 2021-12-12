diff --git a/h2/src/main/org/h2/util/geometry/EWKBUtils.java b/h2/src/main/org/h2/util/geometry/EWKBUtils.java
index 432cc48..b21a44f 100644
--- a/h2/src/main/org/h2/util/geometry/EWKBUtils.java
+++ b/h2/src/main/org/h2/util/geometry/EWKBUtils.java
@@ -121,7 +121,7 @@
             writeInt(type);
             if (srid != 0) {
                 writeInt(srid);
-                // Newer write SRID in inner objects
+                // Never write SRID in inner objects
                 srid = 0;
             }
         }
@@ -156,7 +156,7 @@
 
         private void writeDouble(double v) {
             v = toCanonicalDouble(v);
-            Bits.writeLong(buf, 0, Double.doubleToLongBits(v));
+            Bits.writeLong(buf, 0, Double.doubleToRawLongBits(v));
             output.write(buf, 0, 8);
         }
 
