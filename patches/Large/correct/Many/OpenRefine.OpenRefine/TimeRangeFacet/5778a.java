diff --git a/main/src/com/google/refine/browsing/facets/TimeRangeFacet.java b/main/src/com/google/refine/browsing/facets/TimeRangeFacet.java
index 7957672..9d15d31 100644
--- a/main/src/com/google/refine/browsing/facets/TimeRangeFacet.java
+++ b/main/src/com/google/refine/browsing/facets/TimeRangeFacet.java
@@ -157,7 +157,7 @@
                 
                 @Override
                 protected boolean checkValue(long t) {
-                    return t >= _from && t < _to;
+                    return t >= _from && t <= _to;
                 };
             };
         } else {
