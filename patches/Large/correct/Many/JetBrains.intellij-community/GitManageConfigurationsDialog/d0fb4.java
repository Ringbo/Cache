diff --git a/plugins/git4idea/src/git4idea/checkout/branches/GitManageConfigurationsDialog.java b/plugins/git4idea/src/git4idea/checkout/branches/GitManageConfigurationsDialog.java
index 4103b5a..87524ef 100644
--- a/plugins/git4idea/src/git4idea/checkout/branches/GitManageConfigurationsDialog.java
+++ b/plugins/git4idea/src/git4idea/checkout/branches/GitManageConfigurationsDialog.java
@@ -173,7 +173,7 @@
                                          "</td></tr></html>");
       }
     }
-    boolean isNonCurrent = selected != null || selected != current;
+    boolean isNonCurrent = selected != null && selected != current;
     myDeleteButton.setEnabled(isNonCurrent);
     setOKActionEnabled(isNonCurrent && myConfigurations.getSpecialStatus() == GitBranchConfigurations.SpecialStatus.NORMAL);
   }
