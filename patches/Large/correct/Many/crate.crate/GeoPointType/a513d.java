diff --git a/core/src/main/java/io/crate/types/GeoPointType.java b/core/src/main/java/io/crate/types/GeoPointType.java
index 676a430..514529c 100644
--- a/core/src/main/java/io/crate/types/GeoPointType.java
+++ b/core/src/main/java/io/crate/types/GeoPointType.java
@@ -56,7 +56,8 @@
             return null;
         }
         Object[] values = (Object[])value;
-        Preconditions.checkArgument(values.length == 2);
+        Preconditions.checkArgument(values.length == 2,
+                "The value of a GeoPoint must be a double array with 2 items, not %s", values.length);
         return Arrays.copyOf(values, 2, Double[].class);
     }
 
