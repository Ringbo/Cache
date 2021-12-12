diff --git a/compiler/src/org.graalvm.compiler.replacements.amd64/src/org/graalvm/compiler/replacements/amd64/AMD64StringSubstitutions.java b/compiler/src/org.graalvm.compiler.replacements.amd64/src/org/graalvm/compiler/replacements/amd64/AMD64StringSubstitutions.java
index b576f66..600636a 100644
--- a/compiler/src/org.graalvm.compiler.replacements.amd64/src/org/graalvm/compiler/replacements/amd64/AMD64StringSubstitutions.java
+++ b/compiler/src/org.graalvm.compiler.replacements.amd64/src/org/graalvm/compiler/replacements/amd64/AMD64StringSubstitutions.java
@@ -115,7 +115,7 @@
             }
             return result;
         } else {
-            return indexOf(source, ch, fromIndex);
+            return indexOf(source, ch, origFromIndex);
         }
     }
 
