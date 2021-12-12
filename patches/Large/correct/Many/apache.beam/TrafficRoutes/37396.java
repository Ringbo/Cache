diff --git a/examples/java/src/main/java/org/apache/beam/examples/complete/TrafficRoutes.java b/examples/java/src/main/java/org/apache/beam/examples/complete/TrafficRoutes.java
index 4c00397..5f96168 100644
--- a/examples/java/src/main/java/org/apache/beam/examples/complete/TrafficRoutes.java
+++ b/examples/java/src/main/java/org/apache/beam/examples/complete/TrafficRoutes.java
@@ -403,7 +403,7 @@
   }
 
   private static String tryParseString(String[] inputItems, int index) {
-    return inputItems.length >= index ? inputItems[index] : null;
+    return inputItems.length > index ? inputItems[index] : null;
   }
 
   /** Define some small hard-wired San Diego 'routes' to track based on sensor station ID. */
