diff --git a/src/it/feio/android/omninotes/utils/ImportExportExcel.java b/src/it/feio/android/omninotes/utils/ImportExportExcel.java
index 02ca4d9..d93403e 100644
--- a/src/it/feio/android/omninotes/utils/ImportExportExcel.java
+++ b/src/it/feio/android/omninotes/utils/ImportExportExcel.java
@@ -114,11 +114,11 @@
 					continue;
 				}
 
-				lineBuf.append(line).append(System.lineSeparator());
+				lineBuf.append(line).append(System.getProperty("line.separator"));
 				if (line.lastIndexOf("\";") != line.length() - 2) {
 					continue;
 				} 
-				line = lineBuf.substring(1, lineBuf.length() - 2).toString();
+				line = lineBuf.substring(1, lineBuf.length() - 3).toString();
 				lineBuf.setLength(0);
 				
 				
