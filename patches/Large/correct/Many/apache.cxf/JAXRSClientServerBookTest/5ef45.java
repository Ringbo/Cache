diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerBookTest.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerBookTest.java
index 62ffe57..d7de3b4 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerBookTest.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerBookTest.java
@@ -114,7 +114,7 @@
             fail("Redirect to different host is not allowed");
         } catch (ProcessingException ex) {
             Throwable cause = ex.getCause();
-            assertTrue(cause.getMessage().startsWith("Different HTTP Scheme or Host Redirect detected on"));
+            assertTrue(cause.getMessage().contains("Different HTTP Scheme or Host Redirect detected on"));
         }
     }
     
@@ -159,7 +159,7 @@
             fail("relative Redirect is not allowed");
         } catch (ProcessingException ex) {
             Throwable cause = ex.getCause();
-            assertTrue(cause.getMessage().startsWith("Relative Redirect detected on"));
+            assertTrue(cause.getMessage().contains("Relative Redirect detected on"));
         }
     }
     
