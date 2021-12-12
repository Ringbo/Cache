diff --git a/test/src/org/apache/jmeter/junit/JMeterTest.java b/test/src/org/apache/jmeter/junit/JMeterTest.java
index 9327c39..5687bff 100644
--- a/test/src/org/apache/jmeter/junit/JMeterTest.java
+++ b/test/src/org/apache/jmeter/junit/JMeterTest.java
@@ -358,7 +358,8 @@
                 && (title.toUpperCase(java.util.Locale.ENGLISH).indexOf("(BETA") == -1)
                 && (!title.matches("Example\\d+")) // Skip the example samplers ...
                 && (!name.startsWith("org.apache.jmeter.examples."))
-                )
+                && (!name.startsWith("org.apache.jmeter.report.")) // Skip report packages as implementation is incomplete
+                && (!name.equals("org.apache.jmeter.control.gui.ReportGui"))) // Skip report GUI as implementation is incomplete
             {// No, not a work in progress ...
                 String s = "component_reference.xml needs '" + title + "' anchor for " + name;
                 if (!ct) {
