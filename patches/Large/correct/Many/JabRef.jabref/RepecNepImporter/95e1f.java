diff --git a/src/main/java/net/sf/jabref/imports/RepecNepImporter.java b/src/main/java/net/sf/jabref/imports/RepecNepImporter.java
index dc5723a..989097e 100644
--- a/src/main/java/net/sf/jabref/imports/RepecNepImporter.java
+++ b/src/main/java/net/sf/jabref/imports/RepecNepImporter.java
@@ -478,7 +478,7 @@
                 message += ", paper no. " + paperNoStr + ": ";
             }
             message += e.getMessage();
-            LOGGER.debug(message, e);
+            LOGGER.error(message, e);
             if (!(e instanceof IOException)) {
                 e.printStackTrace();
                 e = new IOException(message);
