diff --git a/security/oauth1-server/src/main/java/org/glassfish/jersey/server/oauth1/DefaultOAuth1Provider.java b/security/oauth1-server/src/main/java/org/glassfish/jersey/server/oauth1/DefaultOAuth1Provider.java
index ce3d19f..3354a04 100644
--- a/security/oauth1-server/src/main/java/org/glassfish/jersey/server/oauth1/DefaultOAuth1Provider.java
+++ b/security/oauth1-server/src/main/java/org/glassfish/jersey/server/oauth1/DefaultOAuth1Provider.java
@@ -86,7 +86,7 @@
      * @return {@link Consumer} object for the newly registered consumer.
      */
     public Consumer registerConsumer(final String owner, final MultivaluedMap<String, String> attributes) {
-        return registerConsumer(newUUIDString(), newUUIDString(), owner, attributes);
+        return registerConsumer(owner, newUUIDString(), newUUIDString(), attributes);
     }
 
     /**
