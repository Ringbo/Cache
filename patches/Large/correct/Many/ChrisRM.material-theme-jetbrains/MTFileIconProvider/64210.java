diff --git a/src/main/java/com/chrisrm/idea/icons/MTFileIconProvider.java b/src/main/java/com/chrisrm/idea/icons/MTFileIconProvider.java
index b93ed9c..32c8c9f 100644
--- a/src/main/java/com/chrisrm/idea/icons/MTFileIconProvider.java
+++ b/src/main/java/com/chrisrm/idea/icons/MTFileIconProvider.java
@@ -139,7 +139,7 @@
 
     try {
       final String iconPath = association.getIcon();
-      icon = new DirIcon(IconLoader.getIcon("/icons/foldersOpen" + iconPath), IconLoader.getIcon("/icons/folders" + iconPath));
+      icon = new DirIcon(IconLoader.getIcon("/icons/folders" + iconPath), IconLoader.getIcon("/icons/foldersOpen" + iconPath));
     } catch (final Exception e) {
       e.printStackTrace();
     }
