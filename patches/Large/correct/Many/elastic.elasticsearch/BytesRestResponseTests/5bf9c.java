diff --git a/core/src/test/java/org/elasticsearch/rest/BytesRestResponseTests.java b/core/src/test/java/org/elasticsearch/rest/BytesRestResponseTests.java
index 09f4f55..4e8d9b8 100644
--- a/core/src/test/java/org/elasticsearch/rest/BytesRestResponseTests.java
+++ b/core/src/test/java/org/elasticsearch/rest/BytesRestResponseTests.java
@@ -342,10 +342,10 @@
     }
 
     public void testNoErrorFromXContent() throws IOException {
-        IllegalArgumentException e = expectThrows(IllegalArgumentException.class, () -> {
+        IllegalStateException e = expectThrows(IllegalStateException.class, () -> {
             try (XContentBuilder builder = XContentBuilder.builder(randomFrom(XContentType.values()).xContent())) {
                 builder.startObject();
-                builder.field("status", randomFrom(RestStatus.values()));
+                builder.field("status", randomFrom(RestStatus.values()).getStatus());
                 builder.endObject();
 
                 try (XContentParser parser = createParser(builder.contentType().xContent(), builder.bytes())) {
@@ -353,7 +353,7 @@
                 }
             }
         });
-        assertEquals("Unable to parse elasticsearch status exception", e.getMessage());
+        assertEquals("Failed to parse elasticsearch status exception: no exception was found", e.getMessage());
     }
 
     public static class WithHeadersException extends ElasticsearchException {
