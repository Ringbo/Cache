diff --git a/platform/lang-impl/src/com/intellij/webcore/packaging/ManagePackagesDialog.java b/platform/lang-impl/src/com/intellij/webcore/packaging/ManagePackagesDialog.java
index fcbaa21..f669822 100644
--- a/platform/lang-impl/src/com/intellij/webcore/packaging/ManagePackagesDialog.java
+++ b/platform/lang-impl/src/com/intellij/webcore/packaging/ManagePackagesDialog.java
@@ -419,7 +419,7 @@
         else {
           myFilteredOut.add(repoPackage);
         }
-        if (StringUtil.equals(packageName, filter)) toSelect = repoPackage;
+        if (StringUtil.equalsIgnoreCase(packageName, filter)) toSelect = repoPackage;
       }
       filter(filtered, toSelect);
     }
