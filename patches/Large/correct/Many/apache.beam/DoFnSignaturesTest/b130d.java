diff --git a/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/reflect/DoFnSignaturesTest.java b/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/reflect/DoFnSignaturesTest.java
index 5b97a55..cffb0ad 100644
--- a/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/reflect/DoFnSignaturesTest.java
+++ b/sdks/java/core/src/test/java/org/apache/beam/sdk/transforms/reflect/DoFnSignaturesTest.java
@@ -385,7 +385,7 @@
     thrown.expectMessage("my-id");
     thrown.expectMessage("myfield1");
     thrown.expectMessage("myfield2");
-    thrown.expectMessage(not(mentionsState()));
+    thrown.expectMessage(not(containsString("State"))); // lowercase "state" is in the package name
     thrown.expectMessage(mentionsTimers());
     DoFnSignature sig =
         DoFnSignatures.getSignature(
@@ -407,7 +407,7 @@
     thrown.expectMessage("Timer declarations must be final");
     thrown.expectMessage("Non-final field");
     thrown.expectMessage("myfield");
-    thrown.expectMessage(not(mentionsState()));
+    thrown.expectMessage(not(containsString("State"))); // lowercase "state" is in the package name
     thrown.expectMessage(mentionsTimers());
     DoFnSignature sig =
         DoFnSignatures.getSignature(
