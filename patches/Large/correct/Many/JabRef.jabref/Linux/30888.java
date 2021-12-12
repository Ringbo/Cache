diff --git a/src/main/java/net/sf/jabref/gui/desktop/os/Linux.java b/src/main/java/net/sf/jabref/gui/desktop/os/Linux.java
index 981b69e..8eddfbe 100644
--- a/src/main/java/net/sf/jabref/gui/desktop/os/Linux.java
+++ b/src/main/java/net/sf/jabref/gui/desktop/os/Linux.java
@@ -14,7 +14,7 @@
         ExternalFileType type = ExternalFileTypes.getInstance().getExternalFileTypeByExt(fileType);
         String viewer;
 
-        if (type == null && !type.getOpenWithApplication().isPresent()) {
+        if (type == null || !type.getOpenWithApplication().isPresent()) {
             viewer = "xdg-open";
         } else {
             viewer = type.getOpenWithApplication().get();
