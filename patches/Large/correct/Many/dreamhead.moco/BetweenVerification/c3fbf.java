diff --git a/moco-core/src/main/java/com/github/dreamhead/moco/verification/BetweenVerification.java b/moco-core/src/main/java/com/github/dreamhead/moco/verification/BetweenVerification.java
index 3fb4139..47ff154 100644
--- a/moco-core/src/main/java/com/github/dreamhead/moco/verification/BetweenVerification.java
+++ b/moco-core/src/main/java/com/github/dreamhead/moco/verification/BetweenVerification.java
@@ -13,7 +13,7 @@
 
     @Override
     protected boolean meet(final int size) {
-        return size >= min || size <= max;
+        return size >= min && size <= max;
     }
 
     @Override
