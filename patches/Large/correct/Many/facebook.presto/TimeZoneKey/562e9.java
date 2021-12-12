diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/type/TimeZoneKey.java b/presto-spi/src/main/java/com/facebook/presto/spi/type/TimeZoneKey.java
index 1ca9b59..8b908b9 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/type/TimeZoneKey.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/type/TimeZoneKey.java
@@ -231,7 +231,7 @@
 
         }
 
-        if (zoneId.equals("+00:00") | zoneId.equals("-00:00")) {
+        if (zoneId.equals("+00:00") || zoneId.equals("-00:00")) {
             return "UTC";
         }
         return zoneId;
