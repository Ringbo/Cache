diff --git a/src/main/java/org/mockserver/client/serialization/ExpectationSerializer.java b/src/main/java/org/mockserver/client/serialization/ExpectationSerializer.java
index 85425c1..8c8e8cd 100644
--- a/src/main/java/org/mockserver/client/serialization/ExpectationSerializer.java
+++ b/src/main/java/org/mockserver/client/serialization/ExpectationSerializer.java
@@ -35,7 +35,7 @@
         Expectation expectation = null;
         try {
             byte[] jsonExpectation = IOUtils.toByteArray(new InputStreamReader(inputStream), Charset.forName(CharEncoding.UTF_8));
-            logger.debug("Received JSON expectation:\n" + new String(jsonExpectation));
+            logger.debug("Received JSON expectation:\n" + new String(jsonExpectation, Charset.forName(CharEncoding.UTF_8)));
             ExpectationDTO expectationDTO = objectMapper.readValue(jsonExpectation, ExpectationDTO.class);
             if (expectationDTO != null) {
                 expectation = expectationDTO.buildObject();
