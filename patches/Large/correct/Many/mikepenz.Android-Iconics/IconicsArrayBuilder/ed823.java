diff --git a/library-core/src/main/java/com/mikepenz/iconics/IconicsArrayBuilder.java b/library-core/src/main/java/com/mikepenz/iconics/IconicsArrayBuilder.java
index 158af45..6143446 100644
--- a/library-core/src/main/java/com/mikepenz/iconics/IconicsArrayBuilder.java
+++ b/library-core/src/main/java/com/mikepenz/iconics/IconicsArrayBuilder.java
@@ -39,7 +39,7 @@
             } else if (mIcons.get(i) instanceof Character) {
                 iconicsDrawables[i] = mIconBase.clone().icon((Character) mIcons.get(i));
             } else if (mIcons.get(i) instanceof String) {
-                iconicsDrawables[i] = mIconBase.clone().icon((String) mIcons.get(i));
+                iconicsDrawables[i] = mIconBase.clone().iconText((String) mIcons.get(i));
             }
         }
 
