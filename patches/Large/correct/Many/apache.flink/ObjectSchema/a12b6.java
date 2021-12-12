diff --git a/sopremo/sopremo-common/src/main/java/eu/stratosphere/sopremo/serialization/ObjectSchema.java b/sopremo/sopremo-common/src/main/java/eu/stratosphere/sopremo/serialization/ObjectSchema.java
index fe15968..581bf83 100644
--- a/sopremo/sopremo-common/src/main/java/eu/stratosphere/sopremo/serialization/ObjectSchema.java
+++ b/sopremo/sopremo-common/src/main/java/eu/stratosphere/sopremo/serialization/ObjectSchema.java
@@ -94,7 +94,7 @@
 	@Override
 	public PactRecord jsonToRecord(IJsonNode value, PactRecord target, EvaluationContext context) {
 		IObjectNode others;
-		if (target == null) {
+		if (target == null || target.getNumFields() < this.mappings.size() + 1) {
 			// the last element is the field "others"
 			target = new PactRecord(this.mappings.size() + 1);
 			for (int i = 0; i < this.mappings.size(); i++)
