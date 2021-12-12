diff --git a/core/src/main/java/io/undertow/server/handlers/file/FileHandler.java b/core/src/main/java/io/undertow/server/handlers/file/FileHandler.java
index c324e0c..bbb3699 100644
--- a/core/src/main/java/io/undertow/server/handlers/file/FileHandler.java
+++ b/core/src/main/java/io/undertow/server/handlers/file/FileHandler.java
@@ -179,7 +179,7 @@
             builder.append("<tr class='").append((++i & 1) == 1 ? "odd" : "even").append("'><td><a class='icon ");
             builder.append(entry.isFile() ? "file" : "dir");
             builder.append("' href='").append(entry.getName()).append("'>").append(entry.getName()).append("</a></td><td>");
-            builder.append(format.format(new Date(file.lastModified()))).append("</td><td>");
+            builder.append(format.format(new Date(entry.lastModified()))).append("</td><td>");
             if (entry.isFile()) {
                 formatSize(builder, entry.length());
             } else {
