diff --git a/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv12UnitTestCase.java b/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv12UnitTestCase.java
index 0d2e0c3..7357daa 100644
--- a/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv12UnitTestCase.java
+++ b/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv12UnitTestCase.java
@@ -61,7 +61,7 @@
         //Make sure the models from the two controllers are identical
         super.compare(modelA, modelB);
 
-        assertRemoveSubsystemResources(servicesA);
+        assertRemoveSubsystemResources(servicesB);
     }
 
     @Override
