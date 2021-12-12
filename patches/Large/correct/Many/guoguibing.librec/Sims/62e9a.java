diff --git a/librec/src/main/java/librec/util/Sims.java b/librec/src/main/java/librec/util/Sims.java
index 56c96b9..8e54321 100644
--- a/librec/src/main/java/librec/util/Sims.java
+++ b/librec/src/main/java/librec/util/Sims.java
@@ -82,7 +82,7 @@
 	/**
 	 * Calculate Mean Squared Difference (MSD) similarity proposed by Shardanand and Maes [1995]:
 	 * 
-	 * <i>Social information filtering: Algorithms for automating “word of mouth�?/i>
+	 * <i>Social information filtering: Algorithms for automating "word of mouth"</i>
 	 * 
 	 * @param u
 	 *            user u's ratings
@@ -214,14 +214,14 @@
 			}
 		}
 		for (int m = 0; m < temp.size(); m++) {
-			for (int n = m; n < temp.size(); n++) {
+			for (int n = m + 1; n < temp.size(); n++) {
 				if ((uItems.get(temp.get(m)) - uItems.get(temp.get(n)))
 						* (vItems.get(temp.get(m)) - vItems.get(temp.get(n))) < 0) {
 					sum += 1;
 				}
 			}
 		}
-		return 1 - 4 * sum / common * (common - 1);
+		return 1 - 4 * sum / common / (common - 1);
 
 	}
 
