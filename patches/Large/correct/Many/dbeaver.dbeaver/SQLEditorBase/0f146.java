diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
index a814de2..a02df88 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
@@ -777,7 +777,7 @@
             }
 
             boolean cursorInsideToken = currentPos >= tokenOffset && currentPos < tokenOffset + tokenLength;
-            if (isControl && (scriptMode || cursorInsideToken)) {
+            if (isControl && (scriptMode || cursorInsideToken) && !hasValuableTokens) {
                 // Control query
                 try {
                     String controlText = document.get(tokenOffset, tokenLength);
