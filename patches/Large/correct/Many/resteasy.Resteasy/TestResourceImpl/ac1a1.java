diff --git a/testsuite/integration-tests/src/test/java/org/jboss/resteasy/test/response/resource/TestResourceImpl.java b/testsuite/integration-tests/src/test/java/org/jboss/resteasy/test/response/resource/TestResourceImpl.java
index 9570470..6b47518 100644
--- a/testsuite/integration-tests/src/test/java/org/jboss/resteasy/test/response/resource/TestResourceImpl.java
+++ b/testsuite/integration-tests/src/test/java/org/jboss/resteasy/test/response/resource/TestResourceImpl.java
@@ -15,7 +15,7 @@
    public Response readContent(@PathParam("documentId") java.lang.String id)
    {
       StringBuffer sb = new StringBuffer();
-      for (int i = 0; i < 100000000; i++)
+      for (int i = 0; i < 10000000; i++)
       {
          sb.append("a");
       }
