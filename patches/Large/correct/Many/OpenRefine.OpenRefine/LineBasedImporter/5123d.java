diff --git a/main/src/com/google/refine/importers/LineBasedImporter.java b/main/src/com/google/refine/importers/LineBasedImporter.java
index 7bd2112..b3d0ad3 100644
--- a/main/src/com/google/refine/importers/LineBasedImporter.java
+++ b/main/src/com/google/refine/importers/LineBasedImporter.java
@@ -29,7 +29,7 @@
         
         JSONUtilities.safePut(options, "linesPerRow", 1);
         JSONUtilities.safePut(options, "headerLines", 0);
-        JSONUtilities.safePut(options, "guessCellValueTypes", true);
+        JSONUtilities.safePut(options, "guessCellValueTypes", false);
         
         return options;
     }
