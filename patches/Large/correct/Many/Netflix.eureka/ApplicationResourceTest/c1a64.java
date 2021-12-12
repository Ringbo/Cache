diff --git a/eureka-core/src/test/java/com/netflix/eureka/resources/ApplicationResourceTest.java b/eureka-core/src/test/java/com/netflix/eureka/resources/ApplicationResourceTest.java
index 84eb609..e25926f 100644
--- a/eureka-core/src/test/java/com/netflix/eureka/resources/ApplicationResourceTest.java
+++ b/eureka-core/src/test/java/com/netflix/eureka/resources/ApplicationResourceTest.java
@@ -81,7 +81,7 @@
     public void testGoodRegistration() throws Exception {
         InstanceInfo noIdInfo = InstanceInfoGenerator.takeOne();
         Response response = applicationResource.addInstance(noIdInfo, false+"");
-        assertThat(response.getStatus(), is(200));
+        assertThat(response.getStatus(), is(204));
     }
 
     @Test
