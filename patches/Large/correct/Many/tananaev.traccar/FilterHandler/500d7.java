diff --git a/src/org/traccar/FilterHandler.java b/src/org/traccar/FilterHandler.java
index 4cd3eb0..1cf4ccd 100644
--- a/src/org/traccar/FilterHandler.java
+++ b/src/org/traccar/FilterHandler.java
@@ -140,7 +140,7 @@
 
     private boolean skipLimit(Position position, Position last) {
         if (skipLimit != 0 && last != null) {
-            return (position.getFixTime().getTime() - last.getFixTime().getTime()) > skipLimit;
+            return (position.getServerTime().getTime() - last.getServerTime().getTime()) > skipLimit;
         }
         return false;
     }
