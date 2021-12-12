diff --git a/src/info/ata4/unity/cli/DisUnityCli.java b/src/info/ata4/unity/cli/DisUnityCli.java
index b9f1eb1..7d415db 100644
--- a/src/info/ata4/unity/cli/DisUnityCli.java
+++ b/src/info/ata4/unity/cli/DisUnityCli.java
@@ -105,7 +105,7 @@
         if (classListInclude != null || classListExclude != null) {
             SimpleClassFilter classFilter = new SimpleClassFilter();
             parseClassList(classFilter.getAcceptedIDs(), classListInclude);
-            parseClassList(classFilter.getAcceptedIDs(), classListExclude);
+            parseClassList(classFilter.getRejectedIDs(), classListExclude);
             ops.setClassFilter(classFilter);
         }
         
