diff --git a/src/test/org/apache/commons/lang3/text/StrSubstitutorTest.java b/src/test/org/apache/commons/lang3/text/StrSubstitutorTest.java
index 5ba00c5..46aa8fb 100644
--- a/src/test/org/apache/commons/lang3/text/StrSubstitutorTest.java
+++ b/src/test/org/apache/commons/lang3/text/StrSubstitutorTest.java
@@ -283,7 +283,7 @@
      */
     public void testResolveVariable() {
         final StrBuilder builder = new StrBuilder("Hi ${name}!");
-        Map<String, Object> map = new HashMap<String, Object>();
+        Map<String, String> map = new HashMap<String, String>();
         map.put("name", "commons");
         StrSubstitutor sub = new StrSubstitutor(map) {
             @Override
