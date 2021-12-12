diff --git a/modules/apps/apio-architect/apio-architect-api/src/test/java/com/liferay/apio/architect/documentation/DocumentationTest.java b/modules/apps/apio-architect/apio-architect-api/src/test/java/com/liferay/apio/architect/documentation/DocumentationTest.java
index cf7b002..ae4b711 100644
--- a/modules/apps/apio-architect/apio-architect-api/src/test/java/com/liferay/apio/architect/documentation/DocumentationTest.java
+++ b/modules/apps/apio-architect/apio-architect-api/src/test/java/com/liferay/apio/architect/documentation/DocumentationTest.java
@@ -39,7 +39,8 @@
 	@Test
 	public void testDocumentationWithEmptyValuesReturnEmpty() {
 		Documentation documentation = new Documentation(
-			__ -> Optional.empty(), __ -> Optional.empty(), null, null, null);
+			__ -> Optional.empty(), __ -> Optional.empty(), null, null, null,
+			null);
 
 		RequestFunction<Optional<String>> apiTitleRequestFunction =
 			documentation.getAPITitleRequestFunction();
@@ -64,7 +65,7 @@
 	public void testDocumentationWithNonemptyValuesReturnThem() {
 		Documentation documentation = new Documentation(
 			__ -> Optional.of(() -> "A"), __ -> Optional.of(() -> "B"), null,
-			null, null);
+			null, null, null);
 
 		RequestFunction<Optional<String>> apiTitleRequestFunction =
 			documentation.getAPITitleRequestFunction();
