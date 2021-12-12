diff --git a/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/tregex/nodes/input/InputIndexOfStringNode.java b/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/tregex/nodes/input/InputIndexOfStringNode.java
index fd177eb..9f2341a 100644
--- a/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/tregex/nodes/input/InputIndexOfStringNode.java
+++ b/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/tregex/nodes/input/InputIndexOfStringNode.java
@@ -53,7 +53,7 @@
         if (fromIndex + match.length() > maxIndex) {
             return -1;
         }
-        for (int i = fromIndex; i < maxIndex - match.length(); i++) {
+        for (int i = fromIndex; i <= maxIndex - match.length(); i++) {
             if (regionMatchesNode.execute(input, match, i)) {
                 return i;
             }
