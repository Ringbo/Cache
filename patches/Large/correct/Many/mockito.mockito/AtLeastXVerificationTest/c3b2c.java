diff --git a/test/org/mockitousage/verification/AtLeastXVerificationTest.java b/test/org/mockitousage/verification/AtLeastXVerificationTest.java
index 286e709..4b962dd 100644
--- a/test/org/mockitousage/verification/AtLeastXVerificationTest.java
+++ b/test/org/mockitousage/verification/AtLeastXVerificationTest.java
@@ -34,7 +34,7 @@
         verify(mock, atLeast(1)).add(anyString());
 
         try {
-            verify(mock, atLeast(1)).add(anyString());
+            verify(mock, atLeast(2)).add(anyString());
             fail();
         } catch (MockitoAssertionError e) {}
     }
