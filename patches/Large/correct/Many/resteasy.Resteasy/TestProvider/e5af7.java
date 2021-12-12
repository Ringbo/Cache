diff --git a/jaxrs/resteasy-jaxrs/src/test/java/org/jboss/resteasy/test/providers/TestProvider.java b/jaxrs/resteasy-jaxrs/src/test/java/org/jboss/resteasy/test/providers/TestProvider.java
index d463e0d..7bb8c2e 100644
--- a/jaxrs/resteasy-jaxrs/src/test/java/org/jboss/resteasy/test/providers/TestProvider.java
+++ b/jaxrs/resteasy-jaxrs/src/test/java/org/jboss/resteasy/test/providers/TestProvider.java
@@ -31,7 +31,7 @@
 
    @Before
    public void setUp() {
-      addPerRequestResource(TestResource.class);
+      addPerRequestResource(DummyResource.class);
    }
    
    
@@ -39,7 +39,7 @@
    public void testMessageReaderThrowingWebApplicationException() throws Exception {
 
       dispatcher.getProviderFactory().registerProviderInstance( new 
-            MessageBodyReader<TestDummy>()
+            MessageBodyReader<DummyObject>()
             {
       
                public boolean isReadable(Class<?> type,Type genericType, Annotation[] annotations)
@@ -47,7 +47,7 @@
                   return true;
                }
                
-               public TestDummy readFrom(Class<TestDummy> type, Type genericType, Annotation[] annotations,
+               public DummyObject readFrom(Class<DummyObject> type, Type genericType, Annotation[] annotations,
                      MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
                      throws IOException, WebApplicationException
                {
@@ -70,10 +70,10 @@
    public void testMessageWriterThrowingWebApplicationException() throws Exception
    {
 
-      dispatcher.getProviderFactory().registerProviderInstance(new MessageBodyWriter<TestDummy>()
+      dispatcher.getProviderFactory().registerProviderInstance(new MessageBodyWriter<DummyObject>()
       {
 
-         public long getSize(TestDummy t)
+         public long getSize(DummyObject t)
          {
             return -1;
          }
@@ -83,7 +83,7 @@
             return true;
          }
 
-         public void writeTo(TestDummy t, Class<?> type, Type genericType, Annotation[] annotations,
+         public void writeTo(DummyObject t, Class<?> type, Type genericType, Annotation[] annotations,
                MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
                throws IOException, WebApplicationException
          {
