diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractOptionCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractOptionCheck.java
index cea7023..ae02c04 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractOptionCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractOptionCheck.java
@@ -68,7 +68,7 @@
                     Enum.valueOf(optionClass, optionStr.trim().toUpperCase(Locale.ENGLISH));
         }
         catch (IllegalArgumentException iae) {
-            throw new ConversionException("unable to parse " + abstractOption, iae);
+            throw new ConversionException("unable to parse " + optionStr, iae);
         }
     }
 
