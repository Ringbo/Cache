diff --git a/test/org/mockitousage/misuse/InvalidStateDetectionTest.java b/test/org/mockitousage/misuse/InvalidStateDetectionTest.java
index 68cc374..c0b15d7 100644
--- a/test/org/mockitousage/misuse/InvalidStateDetectionTest.java
+++ b/test/org/mockitousage/misuse/InvalidStateDetectionTest.java
@@ -47,11 +47,12 @@
         mock = mock(IMethods.class);
     }
     
+    //TODO do the same for other misusing problems
     @Test
     public void shouldShowWhereIsUnfinishedVerification() throws Exception {
         unfinishedVerificationHere();
         try {
-            unfinishedVerificationHere();
+            mock(IMethods.class);
             fail();
         } catch (UnfinishedVerificationException e) {
             assertContains("InvalidStateDetectionTest.unfinishedVerificationHere", e.getMessage());
@@ -151,25 +152,25 @@
     
     @Test
     public void shouldDetectUnfinishedVerification() {
-        unfinishedVerificationHere();
+        verify(mock);
         detectsAndCleansUp(new OnStub(), UnfinishedVerificationException.class);
         
-        unfinishedVerificationHere();
+        verify(mock);
         detectsAndCleansUp(new OnStubVoid(), UnfinishedVerificationException.class);
         
-        unfinishedVerificationHere();
+        verify(mock);
         detectsAndCleansUp(new OnVerify(), UnfinishedVerificationException.class);
         
-        unfinishedVerificationHere();
+        verify(mock);
         detectsAndCleansUp(new OnVerifyInOrder(), UnfinishedVerificationException.class);
         
-        unfinishedVerificationHere();
+        verify(mock);
         detectsAndCleansUp(new OnVerifyZeroInteractions(), UnfinishedVerificationException.class);
         
-        unfinishedVerificationHere();
+        verify(mock);
         detectsAndCleansUp(new OnVerifyNoMoreInteractions(), UnfinishedVerificationException.class);
         
-        unfinishedVerificationHere();
+        verify(mock);
         detectsAndCleansUp(new OnDoAnswer(), UnfinishedVerificationException.class);
     }
 
@@ -213,7 +214,7 @@
     @Test
     public void shouldCorrectStateAfterDetectingUnfinishedVerification() {
         mock.simpleMethod();
-        unfinishedVerificationHere();
+        verify(mock);
         
         try {
             verify(mock).simpleMethod();
