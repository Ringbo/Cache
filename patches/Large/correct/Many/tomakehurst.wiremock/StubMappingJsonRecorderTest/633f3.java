diff --git a/src/test/java/com/github/tomakehurst/wiremock/stubbing/StubMappingJsonRecorderTest.java b/src/test/java/com/github/tomakehurst/wiremock/stubbing/StubMappingJsonRecorderTest.java
index cbad298..e0ed814 100644
--- a/src/test/java/com/github/tomakehurst/wiremock/stubbing/StubMappingJsonRecorderTest.java
+++ b/src/test/java/com/github/tomakehurst/wiremock/stubbing/StubMappingJsonRecorderTest.java
@@ -153,7 +153,7 @@
 	@Test
 	public void doesNotWriteFileIfRequestAlreadyReceived() {
 	    context.checking(new Expectations() {{
-            atLeast(1).of(admin).countRequestsMatching(with(any(RequestPattern.class))); will(returnValue(VerificationResult.withCount(2)));
+            atLeast(1).of(admin).countRequestsMatching(with(any(RequestPattern.class))); will(returnValue(VerificationResult.withCount(1)));
             never(mappingsFileSource).writeTextFile(with(any(String.class)), with(any(String.class)));
             never(filesFileSource).writeTextFile(with(any(String.class)), with(any(String.class)));
         }});
@@ -162,7 +162,7 @@
                 .withMethod(RequestMethod.GET)
                 .withUrl("/headered/content")
                 .build(),
-            response().status(200).build());
+            response().fromProxy(true).status(200).build());
 	}
 	
 	@Test
