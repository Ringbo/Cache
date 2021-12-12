diff --git a/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv11UnitTestCase.java b/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv11UnitTestCase.java
index be6259c..407cbad 100644
--- a/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv11UnitTestCase.java
+++ b/security/src/test/java/org/jboss/as/security/test/SecurityDomainModelv11UnitTestCase.java
@@ -54,7 +54,7 @@
         //Make sure the models from the two controllers are identical
         super.compare(modelA, modelB);
 
-        assertRemoveSubsystemResources(servicesA);
+        assertRemoveSubsystemResources(servicesB);
     }
 
 
@@ -78,7 +78,7 @@
         //Make sure the models from the two controllers are identical
         super.compare(modelA, modelB);
 
-        assertRemoveSubsystemResources(servicesA);
+        assertRemoveSubsystemResources(servicesB);
     }
 
 //    @Override
