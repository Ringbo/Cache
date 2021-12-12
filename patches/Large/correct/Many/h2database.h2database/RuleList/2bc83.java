diff --git a/h2/src/main/org/h2/bnf/RuleList.java b/h2/src/main/org/h2/bnf/RuleList.java
index 0c9f4eb..7057b42 100644
--- a/h2/src/main/org/h2/bnf/RuleList.java
+++ b/h2/src/main/org/h2/bnf/RuleList.java
@@ -58,7 +58,7 @@
             if (level > 10) {
                 if (level > 1000) {
                     // better than stack overflow
-                    throw new Error();
+                    throw new AssertionError();
                 }
                 return get(0).random(config, level);
             }
