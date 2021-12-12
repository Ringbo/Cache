diff --git a/jaxrs/resteasy-jaxrs/src/main/java/org/jboss/resteasy/specimpl/UriInfoImpl.java b/jaxrs/resteasy-jaxrs/src/main/java/org/jboss/resteasy/specimpl/UriInfoImpl.java
index 101ec2e..d45789f 100644
--- a/jaxrs/resteasy-jaxrs/src/main/java/org/jboss/resteasy/specimpl/UriInfoImpl.java
+++ b/jaxrs/resteasy-jaxrs/src/main/java/org/jboss/resteasy/specimpl/UriInfoImpl.java
@@ -262,7 +262,7 @@
       else
       {
          if (encodedMatchedUris == null) encodedMatchedUris = new ArrayList<String>();
-         return matchedUris;
+         return encodedMatchedUris;
       }
    }
 
