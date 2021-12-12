diff --git a/dropwizard-core/src/test/java/com/yammer/dropwizard/json/tests/ObjectMapperFactoryTest.java b/dropwizard-core/src/test/java/com/yammer/dropwizard/json/tests/ObjectMapperFactoryTest.java
index 7d76493..7a04dff 100644
--- a/dropwizard-core/src/test/java/com/yammer/dropwizard/json/tests/ObjectMapperFactoryTest.java
+++ b/dropwizard-core/src/test/java/com/yammer/dropwizard/json/tests/ObjectMapperFactoryTest.java
@@ -31,7 +31,7 @@
         final JsonFactory jsonFactory = new YAMLFactory();
         final ObjectMapper mapper = factory.build(jsonFactory);
 
-        assertThat(mapper.getJsonFactory())
+        assertThat(mapper.getFactory())
                 .isSameAs(jsonFactory);
     }
 
@@ -50,7 +50,7 @@
     public void defaultsToAllowingComments() throws Exception {
         final ObjectMapper mapper = factory.build();
 
-        assertThat(mapper.getJsonFactory().isEnabled(JsonParser.Feature.ALLOW_COMMENTS))
+        assertThat(mapper.getFactory().isEnabled(JsonParser.Feature.ALLOW_COMMENTS))
                 .isTrue();
     }
 
