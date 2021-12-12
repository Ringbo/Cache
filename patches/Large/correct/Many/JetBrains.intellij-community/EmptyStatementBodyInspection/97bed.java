diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/EmptyStatementBodyInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/EmptyStatementBodyInspection.java
index 645a9bc..b2aaf2a 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/EmptyStatementBodyInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/EmptyStatementBodyInspection.java
@@ -151,7 +151,7 @@
         if (elseToken == null) {
           return;
         }
-        registerError(elseToken);
+        registerError(elseToken, new DeleteElementFix(elseBranch));
       }
     }
 
