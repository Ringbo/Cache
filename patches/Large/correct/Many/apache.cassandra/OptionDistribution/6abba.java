diff --git a/tools/stress/src/org/apache/cassandra/stress/settings/OptionDistribution.java b/tools/stress/src/org/apache/cassandra/stress/settings/OptionDistribution.java
index f613985..8784158 100644
--- a/tools/stress/src/org/apache/cassandra/stress/settings/OptionDistribution.java
+++ b/tools/stress/src/org/apache/cassandra/stress/settings/OptionDistribution.java
@@ -482,7 +482,7 @@
         }
 
         @Override
-        public String getConfigAsString(){return String.format("Gaussian:  min=%d,max=%d,mean=%f,stdev=%f", min, max, stdev, mean);}
+        public String getConfigAsString(){return String.format("Gaussian:  min=%d,max=%d,mean=%f,stdev=%f", min, max, mean, stdev);}
 
     }
 
