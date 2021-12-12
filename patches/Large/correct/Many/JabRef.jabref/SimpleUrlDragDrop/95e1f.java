diff --git a/src/main/java/net/sf/jabref/SimpleUrlDragDrop.java b/src/main/java/net/sf/jabref/SimpleUrlDragDrop.java
index 37991b7..9af4889 100644
--- a/src/main/java/net/sf/jabref/SimpleUrlDragDrop.java
+++ b/src/main/java/net/sf/jabref/SimpleUrlDragDrop.java
@@ -110,7 +110,7 @@
         try {
             dtURL = new DataFlavor("application/x-java-url; class=java.net.URL");
         } catch (ClassNotFoundException e) {
-            LOGGER.debug("Could not find DropTargetDropEvent class", e);
+            LOGGER.warn("Could not find DropTargetDropEvent class", e);
         }
         try {
             URL url = (URL) tsf.getTransferData(dtURL);
@@ -122,9 +122,9 @@
             JOptionPane.showMessageDialog((Component) editor,
                     Globals.lang("Operation not supported"),
                     Globals.lang("Drag and Drop Error"), JOptionPane.ERROR_MESSAGE);
-            LOGGER.debug("Could not perform drage and drop", nfe);
+            LOGGER.warn("Could not perform drage and drop", nfe);
         } catch (IOException ioex) {
-            LOGGER.debug("Could not perform drage and drop", ioex);
+            LOGGER.warn("Could not perform drage and drop", ioex);
         }
     }
 
