diff --git a/src/main/java/com/chrisrm/idea/icons/DirIcon.java b/src/main/java/com/chrisrm/idea/icons/DirIcon.java
index 210bbc3..d53008d 100644
--- a/src/main/java/com/chrisrm/idea/icons/DirIcon.java
+++ b/src/main/java/com/chrisrm/idea/icons/DirIcon.java
@@ -41,7 +41,7 @@
   }
 
   @SuppressWarnings("unused")
-  DirIcon(final Icon icon) {
+  public DirIcon(final Icon icon) {
     this(icon, icon);
   }
 
