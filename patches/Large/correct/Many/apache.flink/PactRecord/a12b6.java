diff --git a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
index 870f1b9..fb2aaef 100644
--- a/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
+++ b/pact/pact-common/src/main/java/eu/stratosphere/pact/common/type/PactRecord.java
@@ -230,7 +230,7 @@
 	{
 		// range check
 		if (fieldNum < 0 || fieldNum >= this.numFields) {
-			throw new IndexOutOfBoundsException();
+			throw new IndexOutOfBoundsException(fieldNum+" for range [0.."+(this.numFields-1)+"]");
 		}
 		
 		// get offset and check for null
