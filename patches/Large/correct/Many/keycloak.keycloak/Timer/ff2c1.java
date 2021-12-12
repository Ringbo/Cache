diff --git a/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/util/Timer.java b/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/util/Timer.java
index b36c8f1..082a2a4 100644
--- a/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/util/Timer.java
+++ b/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/util/Timer.java
@@ -138,7 +138,7 @@
             stream.flush();
             IOUtils.closeQuietly(stream);
         } catch (IOException ex) {
-            log.error("Unable to save data for operation '" + op + "'");
+            log.error("Unable to save data for operation '" + op + "'", ex);
         }
     }
 
