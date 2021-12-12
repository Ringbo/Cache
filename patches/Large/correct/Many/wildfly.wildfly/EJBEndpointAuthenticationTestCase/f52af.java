diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ws/authentication/EJBEndpointAuthenticationTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ws/authentication/EJBEndpointAuthenticationTestCase.java
index 6874dc6..3357111 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ws/authentication/EJBEndpointAuthenticationTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/ws/authentication/EJBEndpointAuthenticationTestCase.java
@@ -122,7 +122,7 @@
             Assert.fail("Test should fail, user shouldn't be allowed to invoke that method");
         } catch (WebServiceException e) {
             // failure is expected
-            Assert.assertEquals(e.getCause().getMessage(), getNotAllowedExceptionMessage("hello"));
+            Assert.assertEquals(getNotAllowedExceptionMessage("hello"), e.getCause().getMessage());
         }
     }
     
@@ -163,7 +163,7 @@
             Assert.fail("Test should fail, user shouldn't be allowed to invoke that method");
         } catch (WebServiceException e) {
             // failure is expected
-            Assert.assertEquals(e.getCause().getMessage(), getNotAllowedExceptionMessage("helloForRole"));
+            Assert.assertEquals(getNotAllowedExceptionMessage("helloForRole"), e.getCause().getMessage());
         }
     }
     
@@ -234,7 +234,7 @@
             Assert.fail("Test should fail, user shouldn't be allowed to invoke that method");
         } catch (WebServiceException e) {
             // failure is expected
-            Assert.assertEquals(e.getCause().getMessage(), getNotAllowedExceptionMessage("helloForRoles"));
+            Assert.assertEquals(getNotAllowedExceptionMessage("helloForRoles"), e.getCause().getMessage());
         }
     }
     
