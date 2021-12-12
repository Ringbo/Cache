diff --git a/org.springframework.transaction/src/main/java/org/springframework/transaction/support/TransactionSynchronizationUtils.java b/org.springframework.transaction/src/main/java/org/springframework/transaction/support/TransactionSynchronizationUtils.java
index 705dbde..3e17413 100644
--- a/org.springframework.transaction/src/main/java/org/springframework/transaction/support/TransactionSynchronizationUtils.java
+++ b/org.springframework.transaction/src/main/java/org/springframework/transaction/support/TransactionSynchronizationUtils.java
@@ -67,7 +67,7 @@
 		}
 		if (aopAvailable) {
 			// now unwrap scoped proxy
-			resourceRef = ScopedProxyUnwrapper.unwrapIfNecessary(resource);
+			resourceRef = ScopedProxyUnwrapper.unwrapIfNecessary(resourceRef);
 		}
 		return resourceRef;
 	}
