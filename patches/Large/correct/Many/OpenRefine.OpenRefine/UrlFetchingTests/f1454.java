diff --git a/main/tests/server/src/com/google/refine/tests/model/UrlFetchingTests.java b/main/tests/server/src/com/google/refine/tests/model/UrlFetchingTests.java
index 351027a..cb04216 100644
--- a/main/tests/server/src/com/google/refine/tests/model/UrlFetchingTests.java
+++ b/main/tests/server/src/com/google/refine/tests/model/UrlFetchingTests.java
@@ -169,7 +169,7 @@
 
         // Inspect rows
         String ref_val = (String)project.rows.get(0).getCellValue(1).toString();
-	if (ref_val.startsWith("HTTP error 403") || ref_val.startsWith("HTTP error 503"))
+	if (ref_val.contains("HTTP error 403") || ref_val.contains("HTTP error 503"))
             return;
         Assert.assertTrue(ref_val != "apple"); // just to make sure I picked the right column
         for (int i = 1; i < 4; i++) {
