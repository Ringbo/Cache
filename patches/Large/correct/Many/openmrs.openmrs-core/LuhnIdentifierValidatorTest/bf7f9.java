diff --git a/test/api/org/openmrs/test/patient/LuhnIdentifierValidatorTest.java b/test/api/org/openmrs/test/patient/LuhnIdentifierValidatorTest.java
index 7b53fc2..6aabd73 100644
--- a/test/api/org/openmrs/test/patient/LuhnIdentifierValidatorTest.java
+++ b/test/api/org/openmrs/test/patient/LuhnIdentifierValidatorTest.java
@@ -18,7 +18,7 @@
 import junit.framework.TestCase;
 
 /**
- *
+ * Tests the {@link LuhnIdentifierValidator}
  */
 public class LuhnIdentifierValidatorTest extends TestCase {
 	
@@ -36,7 +36,7 @@
 		//Make sure valid identifiers come back with the right check digit
 		
 		for(int i=0;i<allowedIdentifiers.length;i++){
-			assertEquals(validator.getValidIdentifier(allowedIdentifiers[i]), allowedIdentifiers[i] + "-" + allowedIdentifiersCheckDigits[i]);
+			assertEquals(validator.getValidIdentifier(allowedIdentifiers[i]), allowedIdentifiers[i] + "-" + allowedIdentifiersCheckDigitsInts[i]);
 		}
 		
 		//Make sure invalid identifiers throw an exception
