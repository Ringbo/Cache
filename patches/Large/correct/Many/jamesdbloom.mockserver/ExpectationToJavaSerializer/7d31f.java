diff --git a/mockserver-core/src/main/java/org/mockserver/client/serialization/java/ExpectationToJavaSerializer.java b/mockserver-core/src/main/java/org/mockserver/client/serialization/java/ExpectationToJavaSerializer.java
index 7e0143f..e2b3aef 100644
--- a/mockserver-core/src/main/java/org/mockserver/client/serialization/java/ExpectationToJavaSerializer.java
+++ b/mockserver-core/src/main/java/org/mockserver/client/serialization/java/ExpectationToJavaSerializer.java
@@ -31,7 +31,7 @@
             appendNewLineAndIndent(numberOfSpacesToIndent * INDENT_SIZE, output).append("new MockServerClient(\"localhost\", 1080)");
             appendNewLineAndIndent(numberOfSpacesToIndent * INDENT_SIZE, output).append(".when(");
             output.append(new HttpRequestToJavaSerializer().serialize(numberOfSpacesToIndent + 1, expectation.getHttpRequest()));
-            if (expectation.getTimeToLive() != null) {
+            if (expectation.getTimes() != null) {
                 output.append(",").append(new TimesToJavaSerializer().serialize(numberOfSpacesToIndent + 1, expectation.getTimes()));
             }
             if (expectation.getTimeToLive() != null) {
