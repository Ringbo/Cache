diff --git a/components/camel-schematron/src/main/java/org/apache/camel/component/schematron/SchematronProducer.java b/components/camel-schematron/src/main/java/org/apache/camel/component/schematron/SchematronProducer.java
index 70d73df..0b0e977 100644
--- a/components/camel-schematron/src/main/java/org/apache/camel/component/schematron/SchematronProducer.java
+++ b/components/camel-schematron/src/main/java/org/apache/camel/component/schematron/SchematronProducer.java
@@ -52,7 +52,7 @@
      * @throws Exception
      */
     public void process(Exchange exchange) throws Exception {
-        final SchematronProcessor schematronProcessor = SchematronProcessorFactory.newScehamtronEngine(endpoint.getRules());
+        final SchematronProcessor schematronProcessor = SchematronProcessorFactory.newSchematronEngine(endpoint.getRules());
         final Object payload = exchange.getIn().getBody();
         final String report;
 
