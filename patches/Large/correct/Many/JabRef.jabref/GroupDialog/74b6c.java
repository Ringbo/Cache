diff --git a/src/main/java/net/sf/jabref/gui/groups/GroupDialog.java b/src/main/java/net/sf/jabref/gui/groups/GroupDialog.java
index d0e6989..9ce4a6e 100644
--- a/src/main/java/net/sf/jabref/gui/groups/GroupDialog.java
+++ b/src/main/java/net/sf/jabref/gui/groups/GroupDialog.java
@@ -347,7 +347,7 @@
         m_sgCaseSensitive.addItemListener(itemListener);
 
         // configure for current type
-        if (editedGroup.getClass() == KeywordGroup.class) {
+        if (editedGroup != null && editedGroup.getClass() == KeywordGroup.class) {
             KeywordGroup group = (KeywordGroup) editedGroup;
             m_name.setText(group.getName());
             m_kgSearchField.setText(group.getSearchField());
@@ -356,7 +356,7 @@
             m_kgRegExp.setSelected(group.isRegExp());
             m_keywordsRadioButton.setSelected(true);
             setContext(editedGroup.getHierarchicalContext());
-        } else if (editedGroup.getClass() == SearchGroup.class) {
+        } else if (editedGroup != null && editedGroup.getClass() == SearchGroup.class) {
             SearchGroup group = (SearchGroup) editedGroup;
             m_name.setText(group.getName());
             m_sgSearchExpression.setText(group.getSearchExpression());
@@ -364,7 +364,7 @@
             m_sgRegExp.setSelected(group.isRegExp());
             m_searchRadioButton.setSelected(true);
             setContext(editedGroup.getHierarchicalContext());
-        } else if (editedGroup.getClass() == ExplicitGroup.class) {
+        } else if (editedGroup != null && editedGroup.getClass() == ExplicitGroup.class) {
             m_name.setText(editedGroup.getName());
             m_explicitRadioButton.setSelected(true);
             setContext(editedGroup.getHierarchicalContext());
