diff --git a/src/main/java/net/sf/jabref/imports/BibteXMLImporter.java b/src/main/java/net/sf/jabref/imports/BibteXMLImporter.java
index a3162c0..329ce66 100644
--- a/src/main/java/net/sf/jabref/imports/BibteXMLImporter.java
+++ b/src/main/java/net/sf/jabref/imports/BibteXMLImporter.java
@@ -104,13 +104,13 @@
             bibItems = handler.getItems();
 
         } catch (javax.xml.parsers.ParserConfigurationException e1) {
-            LOGGER.debug("Error with XML parser configuration", e1);
+            LOGGER.error("Error with XML parser configuration", e1);
             status.showMessage(e1.getLocalizedMessage());
         } catch (org.xml.sax.SAXException e2) {
-            LOGGER.debug("Error during XML parsing", e2);
+            LOGGER.error("Error during XML parsing", e2);
             status.showMessage(e2.getLocalizedMessage());
         } catch (java.io.IOException e3) {
-            LOGGER.debug("Error during file import", e3);
+            LOGGER.error("Error during file import", e3);
             status.showMessage(e3.getLocalizedMessage());
         }
         return bibItems;
