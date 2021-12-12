diff --git a/messaging/src/test/java/org/jboss/as/messaging/test/SubsystemParsingUnitTestCase.java b/messaging/src/test/java/org/jboss/as/messaging/test/SubsystemParsingUnitTestCase.java
index 61f85c5..b5054f9 100644
--- a/messaging/src/test/java/org/jboss/as/messaging/test/SubsystemParsingUnitTestCase.java
+++ b/messaging/src/test/java/org/jboss/as/messaging/test/SubsystemParsingUnitTestCase.java
@@ -84,7 +84,7 @@
         System.out.println("configURL = " + configURL);
 
         BufferedReader reader = new BufferedReader(new InputStreamReader(configURL.openStream()));
-        mapper.parseDocument(operations, XMLInputFactory.newFactory().createXMLStreamReader(reader));
+        mapper.parseDocument(operations, XMLInputFactory.newInstance().createXMLStreamReader(reader));
 
         return operations;
     }
