diff --git a/dropwizard-views-mustache/src/test/java/com/codahale/dropwizard/views/mustache/MustacheViewRendererTest.java b/dropwizard-views-mustache/src/test/java/com/codahale/dropwizard/views/mustache/MustacheViewRendererTest.java
index dfbbbdb..998af45 100644
--- a/dropwizard-views-mustache/src/test/java/com/codahale/dropwizard/views/mustache/MustacheViewRendererTest.java
+++ b/dropwizard-views-mustache/src/test/java/com/codahale/dropwizard/views/mustache/MustacheViewRendererTest.java
@@ -56,14 +56,14 @@
     public void rendersViewsWithAbsoluteTemplatePaths() throws Exception {
         final String response = client().resource(getBaseURI() + "test/absolute").get(String.class);
         assertThat(response)
-                .isEqualToIgnoringCase("Woop woop. yay\n");
+                .isEqualTo("Woop woop. yay\n");
     }
 
     @Test
     public void rendersViewsWithRelativeTemplatePaths() throws Exception {
         final String response = client().resource(getBaseURI() + "test/relative").get(String.class);
         assertThat(response)
-                .isEqualToIgnoringCase("Ok.\n");
+                .isEqualTo("Ok.\n");
     }
 
     @Test
