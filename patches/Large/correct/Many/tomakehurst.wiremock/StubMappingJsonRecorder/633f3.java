diff --git a/src/main/java/com/github/tomakehurst/wiremock/stubbing/StubMappingJsonRecorder.java b/src/main/java/com/github/tomakehurst/wiremock/stubbing/StubMappingJsonRecorder.java
index 5744111..c73dfc8 100644
--- a/src/main/java/com/github/tomakehurst/wiremock/stubbing/StubMappingJsonRecorder.java
+++ b/src/main/java/com/github/tomakehurst/wiremock/stubbing/StubMappingJsonRecorder.java
@@ -144,7 +144,7 @@
     private boolean requestNotAlreadyReceived(RequestPattern requestPattern) {
         VerificationResult verificationResult = admin.countRequestsMatching(requestPattern);
         verificationResult.assertRequestJournalEnabled();
-        return (verificationResult.getCount() <= 1);
+        return (verificationResult.getCount() < 1);
     }
 
     public void setIdGenerator(IdGenerator idGenerator) {
