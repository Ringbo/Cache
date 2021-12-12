diff --git a/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/updaters/ClientAttributeUpdater.java b/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/updaters/ClientAttributeUpdater.java
index fec19a8..4d46bc8 100644
--- a/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/updaters/ClientAttributeUpdater.java
+++ b/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/updaters/ClientAttributeUpdater.java
@@ -36,7 +36,7 @@
     }
 
     public ClientAttributeUpdater removeAttribute(String name) {
-        this.rep.getAttributes().put(name, null);
+        this.rep.getAttributes().remove(name);
         return this;
     }
 
