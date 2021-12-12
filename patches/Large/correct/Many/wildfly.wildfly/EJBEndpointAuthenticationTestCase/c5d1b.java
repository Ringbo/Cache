diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ws/authentication/EJBEndpointAuthenticationTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ws/authentication/EJBEndpointAuthenticationTestCase.java
index 57fb3d0..38d5638 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ws/authentication/EJBEndpointAuthenticationTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ws/authentication/EJBEndpointAuthenticationTestCase.java
@@ -310,7 +310,7 @@
             Assert.fail("Test should fail, user shouldn't be allowed to invoke that method");
         } catch (WebServiceException e) {
             // failure is expected
-            Assert.assertEquals(e.getCause().getMessage(), getNotAllowedExceptionMessage("helloForNone"));
+            Assert.assertEquals(getNotAllowedExceptionMessage("helloForNone"), e.getCause().getMessage());
         }
     }
     
@@ -330,7 +330,7 @@
             Assert.fail("Test should fail, user shouldn't be allowed to invoke that method");
         } catch (WebServiceException e) {
             // failure is expected
-            Assert.assertEquals(e.getCause().getMessage(), getNotAllowedExceptionMessage("helloForNone"));
+            Assert.assertEquals(getNotAllowedExceptionMessage("helloForNone"), e.getCause().getMessage());
         }
     }
     
@@ -350,7 +350,7 @@
             Assert.fail("Test should fail, user shouldn't be allowed to invoke that method");
         } catch (WebServiceException e) {
             // failure is expected
-            Assert.assertEquals(e.getCause().getMessage(), getNotAllowedExceptionMessage("helloForNone"));
+            Assert.assertEquals(getNotAllowedExceptionMessage("helloForNone"), e.getCause().getMessage());
         }
     }
 
