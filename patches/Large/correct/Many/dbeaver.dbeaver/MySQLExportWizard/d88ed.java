diff --git a/plugins/org.jkiss.dbeaver.ext.mysql/src/org/jkiss/dbeaver/ext/mysql/tools/MySQLExportWizard.java b/plugins/org.jkiss.dbeaver.ext.mysql/src/org/jkiss/dbeaver/ext/mysql/tools/MySQLExportWizard.java
index 1ea3a66..0406ae4 100644
--- a/plugins/org.jkiss.dbeaver.ext.mysql/src/org/jkiss/dbeaver/ext/mysql/tools/MySQLExportWizard.java
+++ b/plugins/org.jkiss.dbeaver.ext.mysql/src/org/jkiss/dbeaver/ext/mysql/tools/MySQLExportWizard.java
@@ -365,7 +365,7 @@
 
                 LineNumberReader reader = new LineNumberReader(new InputStreamReader(input, ContentUtils.DEFAULT_CHARSET));
                 try (OutputStream output = new FileOutputStream(outFile)) {
-                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
+                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, ContentUtils.DEFAULT_CHARSET));
                     for (;;) {
                         String line = reader.readLine();
                         if (line == null) {
@@ -386,7 +386,7 @@
                         writer.write(line);
                         writer.newLine();
                     }
-                    output.flush();
+                    writer.flush();
                 }
             } catch (IOException e) {
                 logPage.appendLog(e.getMessage());
