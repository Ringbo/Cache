diff --git a/src/core/org/apache/jmeter/reporters/ResultCollector.java b/src/core/org/apache/jmeter/reporters/ResultCollector.java
index b7a1ab2..0861585 100644
--- a/src/core/org/apache/jmeter/reporters/ResultCollector.java
+++ b/src/core/org/apache/jmeter/reporters/ResultCollector.java
@@ -420,7 +420,7 @@
                 }
             }
             writer = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(filename,
-                    trimmed)), SaveService.getFileEncoding("UTF-8")), true); // $NON-NLS-1$
+                    trimmed)), SaveService.getFileEncoding("UTF-8")), false); // $NON-NLS-1$
             log.debug("Opened file: "+filename);
             files.put(filename, new FileEntry(writer, saveConfig));
         } else {
