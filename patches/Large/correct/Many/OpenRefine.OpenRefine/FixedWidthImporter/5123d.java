diff --git a/main/src/com/google/refine/importers/FixedWidthImporter.java b/main/src/com/google/refine/importers/FixedWidthImporter.java
index 70ebb13..9bcca72 100644
--- a/main/src/com/google/refine/importers/FixedWidthImporter.java
+++ b/main/src/com/google/refine/importers/FixedWidthImporter.java
@@ -46,7 +46,7 @@
 
             JSONUtilities.safePut(options, "headerLines", 0);
             JSONUtilities.safePut(options, "columnWidths", columnWidths);
-            JSONUtilities.safePut(options, "guessCellValueTypes", true);
+            JSONUtilities.safePut(options, "guessCellValueTypes", false);
         }
         return options;
     }
