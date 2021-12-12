diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/data/JDBCContentCLOB.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/data/JDBCContentCLOB.java
index efdba95..b8ab7ac 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/data/JDBCContentCLOB.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/data/JDBCContentCLOB.java
@@ -103,7 +103,7 @@
                 catch (IOException e) {
                     throw new DBCException("Can't create temp file", e);
                 }
-                try (Writer os = new FileWriter(tempFile)) {
+                try (Writer os = new OutputStreamWriter(new FileOutputStream(tempFile), ContentUtils.DEFAULT_CHARSET)) {
                     ContentUtils.copyStreams(clob.getCharacterStream(), contentLength, os, monitor);
                 } catch (IOException e) {
                     ContentUtils.deleteTempFile(tempFile);
@@ -160,7 +160,7 @@
                 releaseTempStream();
                 tmpReader = storage.getContentReader();
                 try {
-                    preparedStatement.setCharacterStream(
+                    preparedStatement.setNCharacterStream(
                         paramIndex,
                         tmpReader);
                 }
