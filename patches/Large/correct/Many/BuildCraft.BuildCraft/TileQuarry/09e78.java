diff --git a/common/buildcraft/builders/tile/TileQuarry.java b/common/buildcraft/builders/tile/TileQuarry.java
index 5bc2c90..1ac8de8 100644
--- a/common/buildcraft/builders/tile/TileQuarry.java
+++ b/common/buildcraft/builders/tile/TileQuarry.java
@@ -603,7 +603,7 @@
             power += microJoules;
             if (power >= getTarget()) {
                 if (!finish()) {
-                    battery.addPower(Math.min(power, battery.getCapacity() - battery.getStored()));
+                    battery.addPower(Math.min(power, battery.getCapacity() - battery.getStored()), false);
                 }
                 return true;
             } else {
