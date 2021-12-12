diff --git a/src/org/pentaho/di/trans/steps/ifnull/IfNullMeta.java b/src/org/pentaho/di/trans/steps/ifnull/IfNullMeta.java
index 4bfa5c7..44b2955 100644
--- a/src/org/pentaho/di/trans/steps/ifnull/IfNullMeta.java
+++ b/src/org/pentaho/di/trans/steps/ifnull/IfNullMeta.java
@@ -164,7 +164,7 @@
         typeName = new String[nrtypes]; 
         typereplaceValue = new String[nrtypes]; 
         typereplaceMask = new String[nrtypes];
-        setTypeEmptyString = new boolean[nrfields];
+        setTypeEmptyString = new boolean[nrtypes];
         
         fieldName = new String[nrfields]; 
         replaceValue = new String[nrfields]; 
