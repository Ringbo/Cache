diff --git a/src/main/java/org/jabref/gui/externalfiles/AutoSetFileLinksUtil.java b/src/main/java/org/jabref/gui/externalfiles/AutoSetFileLinksUtil.java
index 0655f40..95982cf 100644
--- a/src/main/java/org/jabref/gui/externalfiles/AutoSetFileLinksUtil.java
+++ b/src/main/java/org/jabref/gui/externalfiles/AutoSetFileLinksUtil.java
@@ -68,8 +68,7 @@
                         .orElse(Optional.of(new UnknownExternalFileType("")));
 
                 String strType = type.isPresent() ? type.get().getName() : "";
-                String relativeFilePath = FileUtil.shortenFileName(foundFile, dirs)
-                        .toString();
+                String relativeFilePath = FileUtil.shortenFileName(foundFile, directories).toString();
                 LinkedFile linkedFile = new LinkedFile("", relativeFilePath, strType);
                 linkedFiles.add(linkedFile);
             }
