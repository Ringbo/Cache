diff --git a/platform/util/src/com/intellij/util/ui/UIUtil.java b/platform/util/src/com/intellij/util/ui/UIUtil.java
index 2254836..00abe74 100644
--- a/platform/util/src/com/intellij/util/ui/UIUtil.java
+++ b/platform/util/src/com/intellij/util/ui/UIUtil.java
@@ -3295,7 +3295,7 @@
         float scale = isJreHiDPIEnabled() ? 1f : JBUI.discreteScale(dpi / 96f); // no scaling in JRE-HiDPI mode
         DEF_SYSTEM_FONT_SIZE = font.getSize() / scale; // derive actual system base font size
         if (JBUI.SCALE_VERBOSE) {
-          LOG.info(String.format("DEF_SYSTEM_FONT_SIZE: %.2f", DEF_SYSTEM_FONT_SIZE, dpi));
+          LOG.info(String.format("DEF_SYSTEM_FONT_SIZE: %.2f", DEF_SYSTEM_FONT_SIZE));
         }
       }
       else if (!SystemInfo.isJetBrainsJvm) {
