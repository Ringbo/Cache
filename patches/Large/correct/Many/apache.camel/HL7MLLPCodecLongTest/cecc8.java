diff --git a/components/camel-hl7/src/test/java/org/apache/camel/component/hl7/HL7MLLPCodecLongTest.java b/components/camel-hl7/src/test/java/org/apache/camel/component/hl7/HL7MLLPCodecLongTest.java
index cba8dbc..878b6ec 100644
--- a/components/camel-hl7/src/test/java/org/apache/camel/component/hl7/HL7MLLPCodecLongTest.java
+++ b/components/camel-hl7/src/test/java/org/apache/camel/component/hl7/HL7MLLPCodecLongTest.java
@@ -53,7 +53,7 @@
             public void configure() throws Exception {
                 from("mina:tcp://0.0.0.0:8888?sync=true&codec=#hl7codec").process(new Processor() {
                     public void process(Exchange exchange) throws Exception {
-                        assertEquals(70011, exchange.getIn().getBody().toString().length());
+                        assertEquals(70008, exchange.getIn().getBody().toString().length());
                         MDM_T02 input = (MDM_T02)exchange.getIn().getBody(Message.class);
                         assertEquals("2.5", input.getVersion());
                         MSH msh = input.getMSH();
@@ -76,12 +76,9 @@
             }
         }
         message = message.substring(0, message.length() - 1);
-        assertEquals(70011, message.length());
-        /*
-         * CAMEL-1566. Blocker for considering the issue fixed
+        assertEquals(70008, message.length());
         String out = (String)template.requestBody("mina:tcp://0.0.0.0:8888?sync=true&codec=#hl7codec", message);
         assertEquals("some response", out);
-        */
         // END SNIPPET: e2
     }
 
