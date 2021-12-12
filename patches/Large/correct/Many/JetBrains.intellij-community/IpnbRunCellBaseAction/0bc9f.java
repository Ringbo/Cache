diff --git a/python/ipnb/src/org/jetbrains/plugins/ipnb/editor/actions/IpnbRunCellBaseAction.java b/python/ipnb/src/org/jetbrains/plugins/ipnb/editor/actions/IpnbRunCellBaseAction.java
index b0452ed..f3bffe3 100644
--- a/python/ipnb/src/org/jetbrains/plugins/ipnb/editor/actions/IpnbRunCellBaseAction.java
+++ b/python/ipnb/src/org/jetbrains/plugins/ipnb/editor/actions/IpnbRunCellBaseAction.java
@@ -16,7 +16,7 @@
   }
 
   public static void runCell(@NotNull final IpnbFilePanel ipnbFilePanel, boolean selectNext) {
-    final IpnbEditablePanel cell = ipnbFilePanel.getSelectedCell();
+    final IpnbEditablePanel cell = ipnbFilePanel.getSelectedCellPanel();
     if (cell == null) return;
     cell.runCell(selectNext);
   }
