diff --git a/camel-core/src/main/java/org/apache/camel/model/language/TokenizerExpression.java b/camel-core/src/main/java/org/apache/camel/model/language/TokenizerExpression.java
index 2099317..aa288ec 100644
--- a/camel-core/src/main/java/org/apache/camel/model/language/TokenizerExpression.java
+++ b/camel-core/src/main/java/org/apache/camel/model/language/TokenizerExpression.java
@@ -193,7 +193,7 @@
         if (includeTokens != null) {
             language.setIncludeTokens(includeTokens);
         }
-        if (group != null) {
+        if (group != null && !"0".equals(group)) {
             language.setGroup(group);
         }
         if (skipFirst != null) {
