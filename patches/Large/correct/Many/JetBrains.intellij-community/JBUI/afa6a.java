diff --git a/platform/util/src/com/intellij/util/ui/JBUI.java b/platform/util/src/com/intellij/util/ui/JBUI.java
index 5ea585b..8637231 100644
--- a/platform/util/src/com/intellij/util/ui/JBUI.java
+++ b/platform/util/src/com/intellij/util/ui/JBUI.java
@@ -1447,7 +1447,7 @@
       }
 
       public static Color disabledForeground() {
-        return foreground(false);
+        return disabledForeground(false);
       }
     }
   }
