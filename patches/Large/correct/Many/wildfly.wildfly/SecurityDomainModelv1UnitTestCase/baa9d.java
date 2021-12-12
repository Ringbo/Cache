diff --git a/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv1UnitTestCase.java b/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv1UnitTestCase.java
index 2c2ac81..43a8689 100644
--- a/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv1UnitTestCase.java
+++ b/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv1UnitTestCase.java
@@ -75,6 +75,6 @@
         //Make sure the models from the two controllers are identical
         super.compare(modelA, modelB);
 
-        assertRemoveSubsystemResources(servicesA);
+        assertRemoveSubsystemResources(servicesB);
    }
 }
\ No newline at end of file
