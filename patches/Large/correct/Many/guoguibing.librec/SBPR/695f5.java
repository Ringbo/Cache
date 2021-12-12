diff --git a/librec/src/main/java/librec/ranking/SBPR.java b/librec/src/main/java/librec/ranking/SBPR.java
index 70f90ab..6a6a799 100644
--- a/librec/src/main/java/librec/ranking/SBPR.java
+++ b/librec/src/main/java/librec/ranking/SBPR.java
@@ -183,7 +183,7 @@
 						double delta_qkf = cik * (-puf / (1 + suk)) + ckj * puf;
 						Q.add(k, f, lRate * (delta_qkf - regI * qkf));
 
-						Q.add(j, f, lRate * (cik * (-puf) - regI * qjf));
+						Q.add(j, f, lRate * (ckj * (-puf) - regI * qjf));
 
 						loss += regU * puf * puf + regI * qif * qif;
 						loss += regI * qkf * qkf + regI * qjf * qjf;
