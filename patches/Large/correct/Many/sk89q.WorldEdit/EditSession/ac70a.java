diff --git a/src/com/sk89q/worldedit/EditSession.java b/src/com/sk89q/worldedit/EditSession.java
index c47e3fc..2d94fb3 100755
--- a/src/com/sk89q/worldedit/EditSession.java
+++ b/src/com/sk89q/worldedit/EditSession.java
@@ -150,7 +150,7 @@
         }
         
         // No invalid blocks
-        if ((type > 25 && type < 35) || type == 36 || type > 92) {
+        if ((type > 26 && type < 35) || type == 36 || type > 94) {
             return false;
         }
         
