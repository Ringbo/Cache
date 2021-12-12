diff --git a/src/main/java/reactor/core/publisher/Operators.java b/src/main/java/reactor/core/publisher/Operators.java
index 8fb41e8..f63fdb4 100644
--- a/src/main/java/reactor/core/publisher/Operators.java
+++ b/src/main/java/reactor/core/publisher/Operators.java
@@ -534,7 +534,7 @@
 			return false;
 		}
 		if (a != null) {
-			a.cancel();
+			s.cancel();
 			reportSubscriptionSet();
 			return false;
 		}
