diff --git a/languagetool-gui-commons/src/main/java/org/languagetool/gui/ConfigurationDialog.java b/languagetool-gui-commons/src/main/java/org/languagetool/gui/ConfigurationDialog.java
index c186946..341db48 100644
--- a/languagetool-gui-commons/src/main/java/org/languagetool/gui/ConfigurationDialog.java
+++ b/languagetool-gui-commons/src/main/java/org/languagetool/gui/ConfigurationDialog.java
@@ -339,7 +339,7 @@
         node = (DefaultMutableTreeNode) node.getChildAt(index);
         if (node instanceof RuleNode) {
           RuleNode o = (RuleNode) node;
-          if (o.getRule().isDefaultOff()) {
+          if (o.getRule().isDefaultOff() || o.getRule().getCategory().isDefaultOff()) {
             if (o.isEnabled()) {
               config.getEnabledRuleIds().add(o.getRule().getId());
             } else {
