diff --git a/xml/impl/src/com/intellij/psi/impl/source/parsing/xml/OldXmlParsing.java b/xml/impl/src/com/intellij/psi/impl/source/parsing/xml/OldXmlParsing.java
index 4e24e7a..6209841 100644
--- a/xml/impl/src/com/intellij/psi/impl/source/parsing/xml/OldXmlParsing.java
+++ b/xml/impl/src/com/intellij/psi/impl/source/parsing/xml/OldXmlParsing.java
@@ -1072,7 +1072,7 @@
             }
             current = treeNext;
           }
-          if (insertAfter != null) insertAfter.rawInsertAfterMe(firstMissing);
+          if (insertAfter != null && firstMissing != null) insertAfter.rawInsertAfterMe(firstMissing);
         }
       }
       passTokenOrChameleon(next, lexer);
