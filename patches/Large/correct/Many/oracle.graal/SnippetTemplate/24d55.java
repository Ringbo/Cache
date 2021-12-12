diff --git a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/SnippetTemplate.java b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/SnippetTemplate.java
index 2bad06c..cf82ba6 100644
--- a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/SnippetTemplate.java
+++ b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/SnippetTemplate.java
@@ -671,7 +671,7 @@
             }
         }
 
-        new DeadCodeEliminationPhase(REQUIRED).apply(snippetCopy);
+        new DeadCodeEliminationPhase(Required).apply(snippetCopy);
 
         assert checkAllVarargPlaceholdersAreDeleted(parameterCount, placeholders);
 
