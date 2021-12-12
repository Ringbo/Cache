diff --git a/src/test/java/org/junit/tests/experimental/AssumptionTest.java b/src/test/java/org/junit/tests/experimental/AssumptionTest.java
index a115df2..4b9f69a 100644
--- a/src/test/java/org/junit/tests/experimental/AssumptionTest.java
+++ b/src/test/java/org/junit/tests/experimental/AssumptionTest.java
@@ -270,7 +270,7 @@
         final List<Failure> failures =
                 runAndGetAssumptionFailures(HasFailingAssumptionWithMessage.class);
 
-        assertEquals(failures.size(), 1);
+        assertEquals(1, failures.size());
         assertTrue(failures.get(0).getMessage().contains(message));
     }
 
