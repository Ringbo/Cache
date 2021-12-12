diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/GotoObjectDialog.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/GotoObjectDialog.java
index 633dfda..97f6b4d 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/GotoObjectDialog.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/GotoObjectDialog.java
@@ -136,7 +136,7 @@
                 typesToSearch.toArray(new DBSObjectType[typesToSearch.size()]),
                 nameMask,
                 false,
-                50);
+                1000);
             for (DBSObjectReference ref : result) {
                 contentProvider.add(ref, itemsFilter);
             }
@@ -239,7 +239,7 @@
             String nameMask = getPattern();
             nameMask = nameMask.replace("*", "%").replace("?", "_");
             int matchRule = getMatchRule();
-            if ((matchRule & SearchPattern.RULE_PREFIX_MATCH) != 0) {
+            if ((matchRule & SearchPattern.RULE_PREFIX_MATCH) != 0 && !nameMask.endsWith("%")) {
                 nameMask += "%";
             }
             return nameMask;
