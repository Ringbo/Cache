diff --git a/src/test/java/com/github/dockerjava/api/model/EventsTest.java b/src/test/java/com/github/dockerjava/api/model/EventsTest.java
index c517b80..05b6a7a 100644
--- a/src/test/java/com/github/dockerjava/api/model/EventsTest.java
+++ b/src/test/java/com/github/dockerjava/api/model/EventsTest.java
@@ -24,7 +24,7 @@
     @Test
     public void serderDocs1() throws IOException {
         final ObjectMapper mapper = new ObjectMapper();
-        final JavaType type = mapper.getTypeFactory().uncheckedSimpleType(Event.class);
+        final JavaType type = mapper.getTypeFactory().constructType(Event.class);
 
         final Event event = testRoundTrip(RemoteApiVersion.VERSION_1_24,
                 "/events/docs1.json",
