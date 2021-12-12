diff --git a/platform/diff-impl/src/com/intellij/diff/actions/CompareFilesAction.java b/platform/diff-impl/src/com/intellij/diff/actions/CompareFilesAction.java
index 4e00df7..db52dbf 100644
--- a/platform/diff-impl/src/com/intellij/diff/actions/CompareFilesAction.java
+++ b/platform/diff-impl/src/com/intellij/diff/actions/CompareFilesAction.java
@@ -61,8 +61,8 @@
           case DIRECTORY:
             text = "Compare Directories";
             break;
-          case ARCHIEVE:
-            text = "Compare Archieves";
+          case ARCHIVE:
+            text = "Compare Archives";
             break;
         }
       }
@@ -118,7 +118,7 @@
     String key;
 
     Type type = getType(file);
-    if (type == Type.DIRECTORY || type == Type.ARCHIEVE) {
+    if (type == Type.DIRECTORY || type == Type.ARCHIVE) {
       descriptor = new FileChooserDescriptor(false, true, true, false, false, false);
       key = LAST_USED_FOLDER_KEY;
     }
@@ -151,9 +151,9 @@
   private static Type getType(@Nullable VirtualFile file) {
     if (file == null) return Type.FILE;
     if (file.isDirectory()) return Type.DIRECTORY;
-    if (file.getFileType() instanceof ArchiveFileType) return Type.ARCHIEVE;
+    if (file.getFileType() instanceof ArchiveFileType) return Type.ARCHIVE;
     return Type.FILE;
   }
 
-  private enum Type {FILE, DIRECTORY, ARCHIEVE}
+  private enum Type {FILE, DIRECTORY, ARCHIVE}
 }
