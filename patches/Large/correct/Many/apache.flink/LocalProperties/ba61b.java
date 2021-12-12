diff --git a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/LocalProperties.java b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/LocalProperties.java
index 8f8b5b2..643b7bc 100644
--- a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/LocalProperties.java
+++ b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/LocalProperties.java
@@ -190,7 +190,7 @@
 		}
 		
 		
-		return isTrivial();
+		return !isTrivial();
 		
 	}
 
