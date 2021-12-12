diff --git a/ejb3/src/test/java/org/jboss/as/ejb3/subsystem/SubsystemParsingUnitTestCase.java b/ejb3/src/test/java/org/jboss/as/ejb3/subsystem/SubsystemParsingUnitTestCase.java
index e35625c..e1e11d5 100644
--- a/ejb3/src/test/java/org/jboss/as/ejb3/subsystem/SubsystemParsingUnitTestCase.java
+++ b/ejb3/src/test/java/org/jboss/as/ejb3/subsystem/SubsystemParsingUnitTestCase.java
@@ -60,6 +60,6 @@
         //Make sure the models from the two controllers are identical
         super.compare(modelA, modelB);
 
-        assertRemoveSubsystemResources(servicesA);
+        assertRemoveSubsystemResources(servicesB);
     }
 }
