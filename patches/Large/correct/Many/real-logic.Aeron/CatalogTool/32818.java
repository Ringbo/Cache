diff --git a/aeron-archive/src/main/java/io/aeron/archive/CatalogTool.java b/aeron-archive/src/main/java/io/aeron/archive/CatalogTool.java
index cdefc81..00ac6da 100644
--- a/aeron-archive/src/main/java/io/aeron/archive/CatalogTool.java
+++ b/aeron-archive/src/main/java/io/aeron/archive/CatalogTool.java
@@ -91,11 +91,11 @@
                 catalog.forEntry(CatalogTool::verify, Long.valueOf(args[2]));
             }
         }
-        else if (args.length == 2 && args[1].equals("entries"))
+        else if (args.length == 2 && args[1].equals("count-entries"))
         {
             try (Catalog catalog = openCatalog())
             {
-                System.out.println(catalog.entries());
+                System.out.println(catalog.countEntries());
             }
         }
         else if (args.length == 2 && args[1].equals("max-entries"))
@@ -358,7 +358,7 @@
         System.out.println("  pid: prints just PID of archive.");
         System.out.println("  verify <optional recordingId>: verifies descriptor(s) in the catalog, checking");
         System.out.println("     recording files availability and contents. Faulty entries are marked as unusable.");
-        System.out.println("  entries: gets the number of recording entries in the catalog.");
+        System.out.println("  count-entries: queries the number of recording entries in the catalog.");
         System.out.println("  max-entries <optional number of entries>: gets or increases the maximum number of");
         System.out.println("     recording entries the catalog can store.");
     }
