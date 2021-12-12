diff --git a/resteasy-client/src/main/java/org/jboss/resteasy/client/jaxrs/internal/ClientInvocation.java b/resteasy-client/src/main/java/org/jboss/resteasy/client/jaxrs/internal/ClientInvocation.java
index c5819ae..e486422 100644
--- a/resteasy-client/src/main/java/org/jboss/resteasy/client/jaxrs/internal/ClientInvocation.java
+++ b/resteasy-client/src/main/java/org/jboss/resteasy/client/jaxrs/internal/ClientInvocation.java
@@ -443,7 +443,7 @@
                {
                   throw e;
                }
-               catch (Throwable e)
+               catch (IOException e)
                {
                   throw new ProcessingException(e);
                }
@@ -468,7 +468,7 @@
                {
                   throw e;
                }
-               catch (Throwable e)
+               catch (IOException e)
                {
                   throw new ResponseProcessingException(response, e);
                }
