diff --git a/clustering/src/test/java/org/jboss/as/clustering/jgroups/subsystem/JGroupsSubsystemParserTest.java b/clustering/src/test/java/org/jboss/as/clustering/jgroups/subsystem/JGroupsSubsystemParserTest.java
index 058670a..395e799 100644
--- a/clustering/src/test/java/org/jboss/as/clustering/jgroups/subsystem/JGroupsSubsystemParserTest.java
+++ b/clustering/src/test/java/org/jboss/as/clustering/jgroups/subsystem/JGroupsSubsystemParserTest.java
@@ -64,7 +64,7 @@
         URL url = Thread.currentThread().getContextClassLoader().getResource(name);
         Assert.assertNotNull(url);
 
-        XMLStreamReader reader = XMLInputFactory.newFactory().createXMLStreamReader(new StreamSource(url.toString()));
+        XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new StreamSource(url.toString()));
         mapper.parseDocument(operations, reader);
 
         return operations;
