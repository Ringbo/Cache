diff --git a/source/com/intellij/psi/statistics/impl/StatisticsManagerImpl.java b/source/com/intellij/psi/statistics/impl/StatisticsManagerImpl.java
index d9e1133..6acec98 100644
--- a/source/com/intellij/psi/statistics/impl/StatisticsManagerImpl.java
+++ b/source/com/intellij/psi/statistics/impl/StatisticsManagerImpl.java
@@ -179,14 +179,14 @@
     }
     StatisticsUnit unit = loadUnit(unitNumber);
     if (unit == null){
-      unit = new StatisticsUnit(unitNumber, myKeys);
+      unit = new StatisticsUnit(unitNumber);
     }
     myUnits[unitNumber] = new SoftReference(unit);
     return unit;
   }
 
   private StatisticsUnit loadUnit(int unitNumber) {
-    StatisticsUnit unit = new StatisticsUnit(unitNumber, myKeys);
+    StatisticsUnit unit = new StatisticsUnit(unitNumber);
     if (!ApplicationManager.getApplication().isUnitTestMode()){
       String path = getPathToUnit(unitNumber);
       try{
