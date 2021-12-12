diff --git a/src/test/java/com/fasterxml/jackson/databind/jsontype/AbstracTypeMapping1186Test.java b/src/test/java/com/fasterxml/jackson/databind/jsontype/AbstracTypeMapping1186Test.java
index 9985dc6..0e72740 100644
--- a/src/test/java/com/fasterxml/jackson/databind/jsontype/AbstracTypeMapping1186Test.java
+++ b/src/test/java/com/fasterxml/jackson/databind/jsontype/AbstracTypeMapping1186Test.java
@@ -33,7 +33,7 @@
     }
 
     public void testDeserializeMyContainer() throws Exception {
-        Module module = new SimpleModule().addAbstractTypeMapping(IContainer.class, MyContainer.class);
+        SimpleModule module = new SimpleModule().addAbstractTypeMapping(IContainer.class, MyContainer.class);
         final ObjectMapper mapper = new ObjectMapper().registerModule(module);
         String json = "{\"ts\": [ { \"msg\": \"hello\"} ] }";
         final Object o = mapper.readValue(json,
