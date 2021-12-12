diff --git a/src/main/java/org/bukkit/DyeColor.java b/src/main/java/org/bukkit/DyeColor.java
index c176dfd..b8e59a4 100644
--- a/src/main/java/org/bukkit/DyeColor.java
+++ b/src/main/java/org/bukkit/DyeColor.java
@@ -12,67 +12,67 @@
     /**
      * Represents white dye
      */
-    WHITE(0x0, 0xF, Color.WHITE, Color.fromRGB(0x1E1B1B)),
+    WHITE(0x0, 0xF, Color.WHITE, Color.fromRGB(0xF0F0F0)),
     /**
      * Represents orange dye
      */
-    ORANGE(0x1, 0xE, Color.fromRGB(0xD87f33), Color.fromRGB(0xB3312C)),
+    ORANGE(0x1, 0xE, Color.fromRGB(0xD87F33), Color.fromRGB(0xEB8844)),
     /**
      * Represents magenta dye
      */
-    MAGENTA(0x2, 0xD, Color.fromRGB(0xB24CD8), Color.fromRGB(0x3B511A)),
+    MAGENTA(0x2, 0xD, Color.fromRGB(0xB24CD8), Color.fromRGB(0xC354CD)),
     /**
      * Represents light blue dye
      */
-    LIGHT_BLUE(0x3, 0xC, Color.fromRGB(0x6699D8), Color.fromRGB(0x51301A)),
+    LIGHT_BLUE(0x3, 0xC, Color.fromRGB(0x6699D8), Color.fromRGB(0x6689D3)),
     /**
      * Represents yellow dye
      */
-    YELLOW(0x4, 0xB, Color.fromRGB(0xE5E533), Color.fromRGB(0x253192)),
+    YELLOW(0x4, 0xB, Color.fromRGB(0xE5E533), Color.fromRGB(0xDECF2A)),
     /**
      * Represents lime dye
      */
-    LIME(0x5, 0xA, Color.fromRGB(0x7FCC19), Color.fromRGB(0x7B2FBE)),
+    LIME(0x5, 0xA, Color.fromRGB(0x7FCC19), Color.fromRGB(0x41CD34)),
     /**
      * Represents pink dye
      */
-    PINK(0x6, 0x9, Color.fromRGB(0xF27FA5), Color.fromRGB(0x287697)),
+    PINK(0x6, 0x9, Color.fromRGB(0xF27FA5), Color.fromRGB(0xD88198)),
     /**
      * Represents gray dye
      */
-    GRAY(0x7, 0x8, Color.fromRGB(0x4C4C4C), Color.fromRGB(0xABABAB)),
+    GRAY(0x7, 0x8, Color.fromRGB(0x4C4C4C), Color.fromRGB(0x434343)),
     /**
      * Represents silver dye
      */
-    SILVER(0x8, 0x7, Color.fromRGB(0x999999), Color.fromRGB(0x434343)),
+    SILVER(0x8, 0x7, Color.fromRGB(0x999999), Color.fromRGB(0xABABAB)),
     /**
      * Represents cyan dye
      */
-    CYAN(0x9, 0x6, Color.fromRGB(0x4C7F99), Color.fromRGB(0xD88198)),
+    CYAN(0x9, 0x6, Color.fromRGB(0x4C7F99), Color.fromRGB(0x287697)),
     /**
      * Represents purple dye
      */
-    PURPLE(0xA, 0x5, Color.fromRGB(0x7F3FB2), Color.fromRGB(0x41CD34)),
+    PURPLE(0xA, 0x5, Color.fromRGB(0x7F3FB2), Color.fromRGB(0x7B2FBE)),
     /**
      * Represents blue dye
      */
-    BLUE(0xB, 0x4, Color.fromRGB(0x334CB2), Color.fromRGB(0xDECF2A)),
+    BLUE(0xB, 0x4, Color.fromRGB(0x334CB2), Color.fromRGB(0x253192)),
     /**
      * Represents brown dye
      */
-    BROWN(0xC, 0x3, Color.fromRGB(0x664C33), Color.fromRGB(0x6689D3)),
+    BROWN(0xC, 0x3, Color.fromRGB(0x664C33), Color.fromRGB(0x51301A)),
     /**
      * Represents green dye
      */
-    GREEN(0xD, 0x2, Color.fromRGB(0x667F33), Color.fromRGB(0xC354CD)),
+    GREEN(0xD, 0x2, Color.fromRGB(0x667F33), Color.fromRGB(0x3B511A)),
     /**
      * Represents red dye
      */
-    RED(0xE, 0x1, Color.fromRGB(0x993333), Color.fromRGB(0xEB8844)),
+    RED(0xE, 0x1, Color.fromRGB(0x993333), Color.fromRGB(0xB3312C)),
     /**
      * Represents black dye
      */
-    BLACK(0xF, 0x0, Color.fromRGB(0x191919), Color.fromRGB(0xF0F0F0));
+    BLACK(0xF, 0x0, Color.fromRGB(0x191919), Color.fromRGB(0x1E1B1B));
 
     private final byte woolData;
     private final byte dyeData;
