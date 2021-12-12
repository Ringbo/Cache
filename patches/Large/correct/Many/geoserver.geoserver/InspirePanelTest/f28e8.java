diff --git a/src/extension/inspire/src/test/java/org/geoserver/inspire/web/InspirePanelTest.java b/src/extension/inspire/src/test/java/org/geoserver/inspire/web/InspirePanelTest.java
index 504bf8a..180daa6 100644
--- a/src/extension/inspire/src/test/java/org/geoserver/inspire/web/InspirePanelTest.java
+++ b/src/extension/inspire/src/test/java/org/geoserver/inspire/web/InspirePanelTest.java
@@ -70,7 +70,7 @@
         try {
             tester.assertComponent("form:panel:container:configs:language", LanguageDropDownChoice.class);
             fail("Shouldn't have found section for INSPIRE extension configuration");
-        } catch (AssertionFailedError e) {
+        } catch (AssertionError e) {
         }
     }
     
@@ -176,7 +176,7 @@
             // the spatial identifiers editor
             tester.assertComponent("form:panel:container:configs:datasetIdentifiersContainer:spatialDatasetIdentifiers", UniqueResourceIdentifiersEditor.class);
             fail("Shouldn't have found a Spatial Dataset Identifers section");
-        } catch (AssertionFailedError e) {
+        } catch (AssertionError e) {
         }
     }
     
