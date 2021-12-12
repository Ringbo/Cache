diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/JAXBElementProvider.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/JAXBElementProvider.java
index 7f86b76..9ed8801 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/JAXBElementProvider.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/JAXBElementProvider.java
@@ -307,7 +307,7 @@
                 marshal(actualObject, actualClass, genericType, encoding, os, m, anns);
             }
         } catch (JAXBException e) {
-            handleJAXBException(e, true);
+            handleJAXBException(e, false);
         }  catch (WebApplicationException e) {
             throw e;
         } catch (Exception e) {
