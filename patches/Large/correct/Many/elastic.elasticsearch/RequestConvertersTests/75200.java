diff --git a/client/rest-high-level/src/test/java/org/elasticsearch/client/RequestConvertersTests.java b/client/rest-high-level/src/test/java/org/elasticsearch/client/RequestConvertersTests.java
index 954dd77..18af527 100644
--- a/client/rest-high-level/src/test/java/org/elasticsearch/client/RequestConvertersTests.java
+++ b/client/rest-high-level/src/test/java/org/elasticsearch/client/RequestConvertersTests.java
@@ -1442,7 +1442,7 @@
             expectedParams.put("preference", preference);
         }
         if (randomBoolean()) {
-            String[] storedFields = generateRandomStringArray(10, 5, false);
+            String[] storedFields = generateRandomStringArray(10, 5, false, false);
             String storedFieldsParams = randomFields(storedFields);
             explainRequest.storedFields(storedFields);
             expectedParams.put("stored_fields", storedFieldsParams);
