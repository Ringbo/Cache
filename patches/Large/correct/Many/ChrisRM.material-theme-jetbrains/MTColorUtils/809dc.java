diff --git a/src/main/java/com/chrisrm/idea/utils/MTColorUtils.java b/src/main/java/com/chrisrm/idea/utils/MTColorUtils.java
index 306fb4c..db56f24 100644
--- a/src/main/java/com/chrisrm/idea/utils/MTColorUtils.java
+++ b/src/main/java/com/chrisrm/idea/utils/MTColorUtils.java
@@ -77,13 +77,13 @@
       return color;
     }
 
-    return isDark ?
+    return new ColorUIResource(isDark ?
            ColorUtil.brighter(color, HC_FG_TONES) :
-           ColorUtil.darker(color, HC_FG_TONES);
+                               ColorUtil.darker(color, HC_FG_TONES));
   }
 
   @SuppressWarnings("unused")
-  private static String contrastifyBackground(final boolean isDark, final String colorString, final boolean isNotHighContrast) {
+  public static String contrastifyBackground(final boolean isDark, final String colorString, final boolean isNotHighContrast) {
     if (isNotHighContrast) {
       return colorString;
     }
@@ -94,13 +94,13 @@
   }
 
   @SuppressWarnings("unused")
-  public static Color contrastifyBackground(final boolean isDark, final Color color, final boolean isNotHighContrast) {
+  public static Color contrastifyBackground(final boolean isDark, final ColorUIResource color, final boolean isNotHighContrast) {
     if (isNotHighContrast) {
       return color;
     }
 
-    return isDark ?
+    return new ColorUIResource(isDark ?
            ColorUtil.darker(color, HC_BG_TONES) :
-           ColorUtil.brighter(color, HC_BG_TONES);
+                               ColorUtil.brighter(color, HC_BG_TONES));
   }
 }
