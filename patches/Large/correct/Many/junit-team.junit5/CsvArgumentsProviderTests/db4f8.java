diff --git a/junit-jupiter-params/src/test/java/org/junit/jupiter/params/provider/CsvArgumentsProviderTests.java b/junit-jupiter-params/src/test/java/org/junit/jupiter/params/provider/CsvArgumentsProviderTests.java
index bbda1bc..14c9ea4 100644
--- a/junit-jupiter-params/src/test/java/org/junit/jupiter/params/provider/CsvArgumentsProviderTests.java
+++ b/junit-jupiter-params/src/test/java/org/junit/jupiter/params/provider/CsvArgumentsProviderTests.java
@@ -63,7 +63,7 @@
 	@Test
 	void throwsExceptionOnInvalidCsv() {
 		JUnitException exception = assertThrows(JUnitException.class,
-			() -> provideArguments(',', "foo", "bar", "").count());
+			() -> provideArguments(',', "foo", "bar", "").toArray());
 
 		assertThat(exception).hasMessage("Line at index 2 contains invalid CSV: \"\"");
 	}
