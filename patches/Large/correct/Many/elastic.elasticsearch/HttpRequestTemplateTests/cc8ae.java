diff --git a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/support/http/HttpRequestTemplateTests.java b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/support/http/HttpRequestTemplateTests.java
index 5cfdeed..9356c37 100644
--- a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/support/http/HttpRequestTemplateTests.java
+++ b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/support/http/HttpRequestTemplateTests.java
@@ -41,7 +41,7 @@
                 .body(XContentBuilder.builder(type.xContent()).startObject().endObject())
                 .build();
         HttpRequest request = template.render(new MockTextTemplateEngine(), emptyMap());
-        assertThat(request.headers, hasEntry(HttpHeaders.Names.CONTENT_TYPE, type.restContentType()));
+        assertThat(request.headers, hasEntry(HttpHeaders.Names.CONTENT_TYPE, type.mediaType()));
     }
 
     public void testBody() throws Exception {
