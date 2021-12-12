diff --git a/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/task/CombineTaskExternalITCase.java b/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/task/CombineTaskExternalITCase.java
index 901f4ca..52d2d81 100644
--- a/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/task/CombineTaskExternalITCase.java
+++ b/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/task/CombineTaskExternalITCase.java
@@ -135,7 +135,7 @@
 			}
 		}
 		
-		Assert.assertTrue("Resultset size was "+aggMap.size()+". Expected was "+keyCnt, outList.size() == keyCnt);
+		Assert.assertTrue("Resultset size was "+aggMap.size()+". Expected was "+keyCnt, aggMap.size() == keyCnt);
 		
 		for (PactInteger integer : aggMap.values()) {
 			Assert.assertTrue("Incorrect result", integer.getValue() == expSum);
