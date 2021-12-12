diff --git a/ExtendedApi/src/com/intellij/testFramework/ExpectedHighlightingData.java b/ExtendedApi/src/com/intellij/testFramework/ExpectedHighlightingData.java
index 223e200..c2f19e1 100644
--- a/ExtendedApi/src/com/intellij/testFramework/ExpectedHighlightingData.java
+++ b/ExtendedApi/src/com/intellij/testFramework/ExpectedHighlightingData.java
@@ -147,7 +147,7 @@
       if (closeTagMarker == null) {
         Pattern pat2 = Pattern.compile("(.*?)</" + marker + ">(.*)", Pattern.DOTALL);
         final Matcher matcher2 = pat2.matcher(rest);
-        LOG.assertTrue(matcher2.matches());
+        LOG.assertTrue(matcher2.matches(), "Cannot find closing </" + marker + ">");
         content = matcher2.group(1);
         endOffset = m.start(11) + matcher2.start(2);
       }
