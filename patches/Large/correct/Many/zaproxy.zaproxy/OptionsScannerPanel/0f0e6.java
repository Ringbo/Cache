diff --git a/src/org/zaproxy/zap/extension/ascan/OptionsScannerPanel.java b/src/org/zaproxy/zap/extension/ascan/OptionsScannerPanel.java
index d10028b..db450dc 100644
--- a/src/org/zaproxy/zap/extension/ascan/OptionsScannerPanel.java
+++ b/src/org/zaproxy/zap/extension/ascan/OptionsScannerPanel.java
@@ -120,7 +120,7 @@
 			panelScanner.add(getComboStrength(), 
 					LayoutHelper.getGBC(1, 9, 1,  0.0D, 0, GridBagConstraints.HORIZONTAL, new Insets(2,2,2,2)));
 			panelScanner.add(getStrengthNotes(), 
-					LayoutHelper.getGBC(2, 10, 1,  1.0D, 0, GridBagConstraints.HORIZONTAL, new Insets(2,2,2,2)));
+					LayoutHelper.getGBC(2, 9, 1,  1.0D, 0, GridBagConstraints.HORIZONTAL, new Insets(2,2,2,2)));
 			
 			/*
 			panelScanner.add(new JLabel(Constant.messages.getString("ascan.options.params.label")), 
