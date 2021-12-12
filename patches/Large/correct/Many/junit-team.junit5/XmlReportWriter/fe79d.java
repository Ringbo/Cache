diff --git a/junit-platform-console/src/main/java/org/junit/platform/console/tasks/XmlReportWriter.java b/junit-platform-console/src/main/java/org/junit/platform/console/tasks/XmlReportWriter.java
index 5cfd53b..aaabdf7 100644
--- a/junit-platform-console/src/main/java/org/junit/platform/console/tasks/XmlReportWriter.java
+++ b/junit-platform-console/src/main/java/org/junit/platform/console/tasks/XmlReportWriter.java
@@ -66,7 +66,7 @@
 			throws XMLStreamException {
 		XMLOutputFactory factory = XMLOutputFactory.newInstance();
 		XMLStreamWriter xmlWriter = factory.createXMLStreamWriter(out);
-		xmlWriter.writeStartDocument();
+		xmlWriter.writeStartDocument("UTF-8", "1.0");
 		newLine(xmlWriter);
 		writeTestsuite(testIdentifier, tests, xmlWriter);
 		xmlWriter.writeEndDocument();
