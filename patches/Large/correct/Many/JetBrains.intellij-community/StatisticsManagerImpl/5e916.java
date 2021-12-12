diff --git a/source/com/intellij/psi/statistics/impl/StatisticsManagerImpl.java b/source/com/intellij/psi/statistics/impl/StatisticsManagerImpl.java
index a68533e..2fb8dda 100644
--- a/source/com/intellij/psi/statistics/impl/StatisticsManagerImpl.java
+++ b/source/com/intellij/psi/statistics/impl/StatisticsManagerImpl.java
@@ -115,7 +115,7 @@
       final String key2 = possibleNames[i];
       if(context != getNameUsageContext(key2)) continue;
       final String name = getName(key2);
-      if(!name.startsWith(prefix)) continue;
+      if(name == null || !name.startsWith(prefix)) continue;
       suggestions.add(name);
     }
     return suggestions.toArray(new String[suggestions.size()]);
