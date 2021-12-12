diff --git a/plugins/plugin-testing-java/plugin-testing-testng/che-plugin-testing-testng-server/src/main/java/org/eclipse/che/plugin/testing/testng/server/TestNGRunner.java b/plugins/plugin-testing-java/plugin-testing-testng/che-plugin-testing-testng-server/src/main/java/org/eclipse/che/plugin/testing/testng/server/TestNGRunner.java
index 87f4ae6..2c54e8f 100644
--- a/plugins/plugin-testing-java/plugin-testing-testng/che-plugin-testing-testng-server/src/main/java/org/eclipse/che/plugin/testing/testng/server/TestNGRunner.java
+++ b/plugins/plugin-testing-java/plugin-testing-testng/che-plugin-testing-testng-server/src/main/java/org/eclipse/che/plugin/testing/testng/server/TestNGRunner.java
@@ -214,7 +214,7 @@
       SAXParser parser = factory.newSAXParser();
       parser.parse(file.getContents(), suiteParser);
     } catch (ParserConfigurationException | SAXException | IOException e) {
-      LOG.error("It is not possible to parse file " + fileLocation, e);
+      LOG.debug("It is not possible to parse file " + fileLocation);
     } catch (CoreException e) {
       LOG.error("It is not possible to read file " + fileLocation, e);
     }
