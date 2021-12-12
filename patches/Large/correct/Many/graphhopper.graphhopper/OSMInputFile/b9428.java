diff --git a/core/src/main/java/com/graphhopper/reader/OSMInputFile.java b/core/src/main/java/com/graphhopper/reader/OSMInputFile.java
index deffb70..0e8cfcc 100644
--- a/core/src/main/java/com/graphhopper/reader/OSMInputFile.java
+++ b/core/src/main/java/com/graphhopper/reader/OSMInputFile.java
@@ -106,7 +106,8 @@
             ips.reset();
             return new GZIPInputStream(ips, 50000);
         } else if (header[0] == 0 && header[1] == 0 && header[2] == 0
-                && header[3] == 13 && header[4] == 10 && header[5] == 9)
+                && header[4] == 10 && header[5] == 9
+                && (header[3] == 13 || header[3] == 14))
         {
             ips.reset();
             binary = true;
