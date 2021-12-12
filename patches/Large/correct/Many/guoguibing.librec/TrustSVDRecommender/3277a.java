diff --git a/core/src/main/java/net/librec/recommender/context/rating/TrustSVDRecommender.java b/core/src/main/java/net/librec/recommender/context/rating/TrustSVDRecommender.java
index 4943446..58cf909 100644
--- a/core/src/main/java/net/librec/recommender/context/rating/TrustSVDRecommender.java
+++ b/core/src/main/java/net/librec/recommender/context/rating/TrustSVDRecommender.java
@@ -255,7 +255,7 @@
                         double deltaTrustee = error * itemFactorValue / trusteeWeightDenom + regUser * trusteeWeightValue * trusteeFactorValue;
                         trusteeTempFactors.add(trusteeIdx, factorIdx, deltaTrustee);
 
-                        loss += regUser * userWeight * trusteeFactorValue * trusteeFactorValue;
+                        loss += regUser * trusteeWeightValue * trusteeFactorValue * trusteeFactorValue;                        
                     }
                 }
             }
@@ -283,7 +283,7 @@
                     tempUserFactors.add(userIdx, factorIdx, deriValue * trusteeFactorValue + regSocial * trusterWeightValue * userFactorValue);
                     trusteeTempFactors.add(trusteeIdx, factorIdx, deriValue * userFactorValue);
 
-                    loss += regSocial * trusterWeightValue * trusterWeightValue;
+                    loss += regSocial * trusterWeightValue * userFactorValue * userFactorValue;
                 }
             }
 
