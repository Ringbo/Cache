diff --git a/astrid/src/com/todoroo/astrid/service/abtesting/ABTests.java b/astrid/src/com/todoroo/astrid/service/abtesting/ABTests.java
index efc2a72..51fc4d6 100644
--- a/astrid/src/com/todoroo/astrid/service/abtesting/ABTests.java
+++ b/astrid/src/com/todoroo/astrid/service/abtesting/ABTests.java
@@ -41,10 +41,10 @@
             Account[] accounts = am.getAccounts();
             if (accounts == null || accounts.length == 0) {
                 addTest(AB_NEW_LOGIN_NO_GOOGLE, new int[] { 1, 1 },
-                        new int[] { 1, 0 }, new String[] { "old-welcome", "new-welcome" });  //$NON-NLS-1$//$NON-NLS-2$
+                        new int[] { 1, 0 }, new String[] { "old-welcome", "new-welcome" }, true);  //$NON-NLS-1$//$NON-NLS-2$
             } else {
                 addTest(AB_NEW_LOGIN_YES_GOOGLE, new int[] { 1, 1, 1 },
-                        new int[] { 1, 0, 0 }, new String[] { "old-welcome", "new-welcome", "new-quick-welcome" });  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
+                        new int[] { 1, 0, 0 }, new String[] { "old-welcome", "new-welcome", "new-quick-welcome" }, true);  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
             }
         }
     }
