diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/completion/GroovyCompletionContributor.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/completion/GroovyCompletionContributor.java
index 268579e..47fac72 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/completion/GroovyCompletionContributor.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/completion/GroovyCompletionContributor.java
@@ -56,7 +56,7 @@
           public void consume(final PsiType type) {
             addExpectedType(result, type, identifierCopy);
           }
-        });
+        }, result.getPrefixMatcher());
       }
     });
   }
