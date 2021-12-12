diff --git a/src/main/java/org/bukkit/DyeColor.java b/src/main/java/org/bukkit/DyeColor.java
index b8e59a4..58f517b 100644
--- a/src/main/java/org/bukkit/DyeColor.java
+++ b/src/main/java/org/bukkit/DyeColor.java
@@ -164,7 +164,7 @@
      */
     public static DyeColor getByWoolData(final byte data) {
         int i = 0xff & data;
-        if (i > BY_WOOL_DATA.length) {
+        if (i >= BY_WOOL_DATA.length) {
             return null;
         }
         return BY_WOOL_DATA[i];
@@ -179,7 +179,7 @@
      */
     public static DyeColor getByDyeData(final byte data) {
         int i = 0xff & data;
-        if (i > BY_DYE_DATA.length) {
+        if (i >= BY_DYE_DATA.length) {
             return null;
         }
         return BY_DYE_DATA[i];
