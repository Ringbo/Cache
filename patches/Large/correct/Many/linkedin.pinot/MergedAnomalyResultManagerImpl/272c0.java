diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/datalayer/bao/jdbc/MergedAnomalyResultManagerImpl.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/datalayer/bao/jdbc/MergedAnomalyResultManagerImpl.java
index 9c97e33..f01530a 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/datalayer/bao/jdbc/MergedAnomalyResultManagerImpl.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/datalayer/bao/jdbc/MergedAnomalyResultManagerImpl.java
@@ -134,7 +134,7 @@
         Predicate.AND(Predicate.LE("startTime", conflictWindowEnd), Predicate.GE("endTime", conflictWindowStart),
             Predicate.EQ("functionId", functionId), Predicate.EQ("dimensions", dimensions));
     List<MergedAnomalyResultBean> list = genericPojoDao.get(predicate, MergedAnomalyResultBean.class);
-    return batchConvertMergedAnomalyBean2DTO(list);
+    return batchConvertMergedAnomalyBean2DTO(list, true);
   }
 
   @Override
