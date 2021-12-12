diff --git a/platform/platform-impl/src/com/intellij/ide/ui/laf/LafManagerImpl.java b/platform/platform-impl/src/com/intellij/ide/ui/laf/LafManagerImpl.java
index c14a18e..d3b798e 100644
--- a/platform/platform-impl/src/com/intellij/ide/ui/laf/LafManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/ide/ui/laf/LafManagerImpl.java
@@ -387,7 +387,7 @@
       }
     }
 
-    myCurrentLaf = ObjectUtils.chooseNotNull(findLaf(lookAndFeelInfo.getClassName()), lookAndFeelInfo);
+    myCurrentLaf = ObjectUtils.chooseNotNull(lookAndFeelInfo, findLaf(lookAndFeelInfo.getClassName()));
   }
 
   public static void updateForDarcula(boolean isDarcula) {
