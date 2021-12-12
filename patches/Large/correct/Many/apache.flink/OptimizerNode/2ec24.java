diff --git a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/OptimizerNode.java b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/OptimizerNode.java
index 73bcc6d..f38866f 100644
--- a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/OptimizerNode.java
+++ b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/OptimizerNode.java
@@ -1525,7 +1525,7 @@
 	
 	public boolean keepsUniqueProperty(FieldSet uniqueSet, int input) {
 		for (Integer uniqueField : uniqueSet) {
-			if (isFieldKept(uniqueField, input) == false) {
+			if (isFieldKept(input, uniqueField) == false) {
 				return false;
 			}
 		}
