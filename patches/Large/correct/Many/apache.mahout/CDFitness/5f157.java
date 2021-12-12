diff --git a/examples/src/main/java/org/apache/mahout/ga/watchmaker/cd/CDFitness.java b/examples/src/main/java/org/apache/mahout/ga/watchmaker/cd/CDFitness.java
index 5071d95..426813f 100644
--- a/examples/src/main/java/org/apache/mahout/ga/watchmaker/cd/CDFitness.java
+++ b/examples/src/main/java/org/apache/mahout/ga/watchmaker/cd/CDFitness.java
@@ -90,7 +90,7 @@
 
     CDFitness f = (CDFitness) obj;
 
-    return tp == f.getFp() && fp == f.getFp() && tn == f.getTn() && fn == f.getTn();
+    return tp == f.getTp() && fp == f.getFp() && tn == f.getTn() && fn == f.getFn();
   }
 
   @Override
