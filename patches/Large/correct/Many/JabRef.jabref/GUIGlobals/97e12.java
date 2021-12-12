diff --git a/src/main/java/net/sf/jabref/gui/GUIGlobals.java b/src/main/java/net/sf/jabref/gui/GUIGlobals.java
index 30f2afd..bd9959e 100644
--- a/src/main/java/net/sf/jabref/gui/GUIGlobals.java
+++ b/src/main/java/net/sf/jabref/gui/GUIGlobals.java
@@ -188,7 +188,7 @@
 
         // Priority icon used for the menu
         label = new JLabel(Priority.getInstance().getRepresentingIcon());
-        label.setToolTipText(Rank.getInstance().getToolTip());
+        label.setToolTipText(Priority.getInstance().getToolTip());
         GUIGlobals.TABLE_ICONS.put(SpecialFieldsUtils.FIELDNAME_PRIORITY, label);
 
         // Read icon used for menu
