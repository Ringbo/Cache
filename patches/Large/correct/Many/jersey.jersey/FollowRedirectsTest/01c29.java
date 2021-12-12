diff --git a/connectors/grizzly-connector/src/test/java/org/glassfish/jersey/grizzly/connector/FollowRedirectsTest.java b/connectors/grizzly-connector/src/test/java/org/glassfish/jersey/grizzly/connector/FollowRedirectsTest.java
index 024716b..5dcb173 100644
--- a/connectors/grizzly-connector/src/test/java/org/glassfish/jersey/grizzly/connector/FollowRedirectsTest.java
+++ b/connectors/grizzly-connector/src/test/java/org/glassfish/jersey/grizzly/connector/FollowRedirectsTest.java
@@ -71,7 +71,7 @@
         @GET
         @Path("redirect")
         public Response redirect() {
-            return Response.status(302).location(UriBuilder.fromResource(RedirectResource.class).build()).build();
+            return Response.seeOther(UriBuilder.fromResource(RedirectResource.class).build()).build();
         }
     }
 
@@ -97,6 +97,6 @@
     public void testDontFollow() {
         WebTarget t = target("test/redirect");
         t.configuration().setProperty(ClientProperties.FOLLOW_REDIRECTS, false);
-        assertEquals(302, t.request().get().getStatus());
+        assertEquals(303, t.request().get().getStatus());
     }
 }
