diff --git a/core/broadleaf-profile-web/src/main/java/org/broadleafcommerce/profile/web/core/CustomerStateRefresher.java b/core/broadleaf-profile-web/src/main/java/org/broadleafcommerce/profile/web/core/CustomerStateRefresher.java
index f09dc7f..f6d1821 100644
--- a/core/broadleaf-profile-web/src/main/java/org/broadleafcommerce/profile/web/core/CustomerStateRefresher.java
+++ b/core/broadleaf-profile-web/src/main/java/org/broadleafcommerce/profile/web/core/CustomerStateRefresher.java
@@ -95,7 +95,7 @@
         postMergedCustomer.setUnencodedChallengeAnswer(preMergedCustomer.getUnencodedChallengeAnswer());
         postMergedCustomer.setAnonymous(preMergedCustomer.isAnonymous());
         postMergedCustomer.setCookied(preMergedCustomer.isCookied());
-        postMergedCustomer.setLoggedIn(preMergedCustomer.isLoggedIn());
+        postMergedCustomer.setLoggedIn(preMergedCustomer.isRegistered());
         postMergedCustomer.getTransientProperties().putAll(preMergedCustomer.getTransientProperties());
     }
 
