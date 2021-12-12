diff --git a/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationInfoImpl.java b/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationInfoImpl.java
index af11427..dd2490f 100755
--- a/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationInfoImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationInfoImpl.java
@@ -252,7 +252,7 @@
 
   @Nullable
   public Icon getProgressTailIcon() {
-    if (myProgressTailIcon == null) {
+    if (myProgressTailIcon == null && myProgressTailIconName != null) {
       myProgressTailIcon = IconLoader.getIcon(myProgressTailIconName);
     }
     return myProgressTailIcon;
