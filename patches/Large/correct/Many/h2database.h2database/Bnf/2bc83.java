diff --git a/h2/src/main/org/h2/bnf/Bnf.java b/h2/src/main/org/h2/bnf/Bnf.java
index 4e86d40..e7f4198 100644
--- a/h2/src/main/org/h2/bnf/Bnf.java
+++ b/h2/src/main/org/h2/bnf/Bnf.java
@@ -69,7 +69,7 @@
     private RuleHead addRule(String topic, String section, Rule rule) {
         RuleHead head = new RuleHead(section, topic, rule);
         if (ruleMap.get(StringUtils.toLowerEnglish(topic)) != null) {
-            throw new Error("already exists: " + topic);
+            throw new AssertionError("already exists: " + topic);
         }
         ruleMap.put(StringUtils.toLowerEnglish(topic), head);
         return head;
@@ -206,13 +206,13 @@
             Rule r2 = parseOr();
             r = new RuleOptional(r2);
             if (firstChar != ']') {
-                throw new Error("expected ], got " + currentToken + " syntax:" + syntax);
+                throw new AssertionError("expected ], got " + currentToken + " syntax:" + syntax);
             }
         } else if (firstChar == '{') {
             read();
             r = parseOr();
             if (firstChar != '}') {
-                throw new Error("expected }, got " + currentToken + " syntax:" + syntax);
+                throw new AssertionError("expected }, got " + currentToken + " syntax:" + syntax);
             }
         } else if ("@commaDots@".equals(currentToken)) {
             r = new RuleList(new RuleElement(",", currentTopic), lastRepeat, false);
