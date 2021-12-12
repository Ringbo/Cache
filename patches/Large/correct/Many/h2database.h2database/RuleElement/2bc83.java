diff --git a/h2/src/main/org/h2/bnf/RuleElement.java b/h2/src/main/org/h2/bnf/RuleElement.java
index b0d1334..a5986d1 100644
--- a/h2/src/main/org/h2/bnf/RuleElement.java
+++ b/h2/src/main/org/h2/bnf/RuleElement.java
@@ -40,7 +40,7 @@
         if (link != null) {
             return link.random(config, level + 1);
         }
-        throw new Error(name);
+        throw new AssertionError(name);
     }
 
     public String name() {
@@ -76,7 +76,7 @@
                 return;
             }
         }
-        throw new Error("Unknown " + name + "/" + test);
+        throw new AssertionError("Unknown " + name + "/" + test);
     }
 
     public boolean matchRemove(Sentence sentence) {
