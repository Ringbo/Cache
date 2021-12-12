diff --git a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/io/ID.java b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/io/ID.java
index 92e951c..8de82d5 100644
--- a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/io/ID.java
+++ b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/io/ID.java
@@ -75,7 +75,7 @@
 			return;
 		}
 		
-		System.arraycopy(bytes, 0, this.bytes, 0, SIZE);
+		System.arraycopy(src, 0, this.bytes, 0, SIZE);
 	}
 
 	/**
