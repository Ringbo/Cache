diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/coding/PackageDeclarationCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/coding/PackageDeclarationCheckTest.java
index a729bab..80827df 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/coding/PackageDeclarationCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/coding/PackageDeclarationCheckTest.java
@@ -76,7 +76,8 @@
             "1: " + getCheckMessage(MSG_KEY_MISMATCH),
         };
 
-        verify(checkConfig, getPath("InputPackageDeclarationDiffDirectory.java"), expected);
+        verify(checkConfig,
+                getNonCompilablePath("InputPackageDeclarationDiffDirectory.java"), expected);
     }
 
     @Test
@@ -87,7 +88,9 @@
             "1: " + getCheckMessage(MSG_KEY_MISMATCH),
         };
 
-        verify(checkConfig, getPath("InputPackageDeclarationDiffDirectoryAtParent.java"), expected);
+        verify(checkConfig,
+                getNonCompilablePath("InputPackageDeclarationDiffDirectoryAtParent.java"),
+                expected);
     }
 
     @Test
@@ -99,7 +102,8 @@
         };
 
         verify(checkConfig,
-                getPath("InputPackageDeclarationDiffDirectoryAtSubpackage.java"), expected);
+                getNonCompilablePath("InputPackageDeclarationDiffDirectoryAtSubpackage.java"),
+                expected);
     }
 
     @Test
@@ -108,7 +112,8 @@
         checkConfig.addAttribute("matchDirectoryStructure", "false");
         final String[] expected = CommonUtil.EMPTY_STRING_ARRAY;
 
-        verify(checkConfig, getPath("InputPackageDeclarationDiffDirectory.java"), expected);
+        verify(checkConfig, getNonCompilablePath("InputPackageDeclarationDiffDirectory.java"),
+                expected);
     }
 
     @Test
@@ -117,7 +122,9 @@
         checkConfig.addAttribute("matchDirectoryStructure", "false");
         final String[] expected = CommonUtil.EMPTY_STRING_ARRAY;
 
-        verify(checkConfig, getPath("InputPackageDeclarationDiffDirectoryAtParent.java"), expected);
+        verify(checkConfig,
+                getNonCompilablePath("InputPackageDeclarationDiffDirectoryAtParent.java"),
+                expected);
     }
 
     @Test
@@ -127,7 +134,8 @@
         final String[] expected = CommonUtil.EMPTY_STRING_ARRAY;
 
         verify(checkConfig,
-                getPath("InputPackageDeclarationDiffDirectoryAtSubpackage.java"), expected);
+                getNonCompilablePath("InputPackageDeclarationDiffDirectoryAtSubpackage.java"),
+                expected);
     }
 
     @Test
