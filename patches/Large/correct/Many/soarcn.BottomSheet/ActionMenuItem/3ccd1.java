diff --git a/library/src/main/java/com/cocosw/bottomsheet/ActionMenuItem.java b/library/src/main/java/com/cocosw/bottomsheet/ActionMenuItem.java
index 42f38a2..3815ada 100644
--- a/library/src/main/java/com/cocosw/bottomsheet/ActionMenuItem.java
+++ b/library/src/main/java/com/cocosw/bottomsheet/ActionMenuItem.java
@@ -207,7 +207,7 @@
      }
 
      public MenuItem setVisible(boolean visible) {
-         mFlags = (mFlags & HIDDEN) | (visible ? 0 : HIDDEN);
+         mFlags = (mFlags & ~HIDDEN) | (visible ? 0 : HIDDEN);
          return this;
      }
 
