diff --git a/platform/lang-impl/src/com/intellij/formatting/CoreFormatterUtil.java b/platform/lang-impl/src/com/intellij/formatting/CoreFormatterUtil.java
index 1af833a..aec020d 100644
--- a/platform/lang-impl/src/com/intellij/formatting/CoreFormatterUtil.java
+++ b/platform/lang-impl/src/com/intellij/formatting/CoreFormatterUtil.java
@@ -100,7 +100,7 @@
           return result;
         }
         block = block.getPreviousBlock();
-        if (block == null) return result;
+        if (result > CodeStyleSettings.MAX_RIGHT_MARGIN || block == null) return result;
         result += block.getSymbolsAtTheLastLine();
         if (block.containsLineFeeds()) return result;
       }
