diff --git a/src/org/pentaho/di/trans/steps/mergerows/MergeRowsMeta.java b/src/org/pentaho/di/trans/steps/mergerows/MergeRowsMeta.java
index e031b3a..6f1b6ef 100644
--- a/src/org/pentaho/di/trans/steps/mergerows/MergeRowsMeta.java
+++ b/src/org/pentaho/di/trans/steps/mergerows/MergeRowsMeta.java
@@ -1,4 +1,4 @@
- /* Copyright � 2007 Pentaho Corporation.  All rights reserved. 
+ /* Copyright � 2007 Pentaho Corporation.  All rights reserved. 
  * This software was developed by Pentaho Corporation and is provided under the terms 
  * of the GNU Lesser General Public License, Version 2.1. You may not use 
  * this file except in compliance with the license. If you need a copy of the license, 
@@ -276,7 +276,7 @@
     
     public String[] getInfoSteps()
     {
-        if (referenceStepMeta!=null && referenceStepMeta!=null)
+        if (referenceStepMeta!=null && compareStepMeta!=null)
         {
             return new String[] { referenceStepMeta.getName(), compareStepMeta.getName(), };
         }
