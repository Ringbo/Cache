diff --git a/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java b/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
index 6219a97..41ad2e4 100644
--- a/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
+++ b/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
@@ -366,7 +366,7 @@
         else if (f2 instanceof DisplayPrioritySortable) {
           return -1;
         }
-        return f1.getPanelDisplayName().compareTo(f2.getPanelDisplayName());
+        return f1.getPanelDisplayName().compareToIgnoreCase(f2.getPanelDisplayName());
       }
     });
     result.addAll(extensions);
