diff --git a/src/main/java/net/sf/jabref/UrlDragDrop.java b/src/main/java/net/sf/jabref/UrlDragDrop.java
index 5d0e954..39e3801 100644
--- a/src/main/java/net/sf/jabref/UrlDragDrop.java
+++ b/src/main/java/net/sf/jabref/UrlDragDrop.java
@@ -143,7 +143,7 @@
         try {
             dtURL = new DataFlavor("application/x-java-url; class=java.net.URL");
         } catch (ClassNotFoundException e) {
-            LOGGER.debug("Could not find DropTargetDropEvent class", e);
+            LOGGER.warn("Could not find DropTargetDropEvent class", e);
         }
         try {
             URL url = (URL) tsf.getTransferData(dtURL);
@@ -178,7 +178,7 @@
                     editor.updateField(feditor);
 
                 } catch (IOException ioex) {
-                    LOGGER.debug("Error while downloading file", ioex);
+                    LOGGER.error("Error while downloading file", ioex);
                     JOptionPane.showMessageDialog(editor,
                             Globals.lang("File download"),
                             Globals.lang("Error while downloading file:"
@@ -190,9 +190,9 @@
             return;
         } catch (UnsupportedFlavorException nfe) {
             // not an URL then...
-            LOGGER.debug("Could not parse URL", nfe);
+            LOGGER.warn("Could not parse URL", nfe);
         } catch (IOException ioex) {
-            LOGGER.debug("Could not perform drage and drop", ioex);
+            LOGGER.warn("Could not perform drage and drop", ioex);
         }
 
         try {
@@ -216,9 +216,9 @@
             JOptionPane.showMessageDialog(editor,
                     Globals.lang("Operation not supported"),
                     Globals.lang("Drag and Drop Error"), JOptionPane.ERROR_MESSAGE);
-            LOGGER.debug("Could not perform drage and drop", nfe);
+            LOGGER.warn("Could not perform drage and drop", nfe);
         } catch (IOException ioex) {
-            LOGGER.debug("Could not perform drage and drop", ioex);
+            LOGGER.warn("Could not perform drage and drop", ioex);
         }
 
     }
