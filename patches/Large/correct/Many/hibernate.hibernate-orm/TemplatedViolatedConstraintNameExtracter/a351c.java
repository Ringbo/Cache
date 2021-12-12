diff --git a/hibernate-core/src/main/java/org/hibernate/exception/spi/TemplatedViolatedConstraintNameExtracter.java b/hibernate-core/src/main/java/org/hibernate/exception/spi/TemplatedViolatedConstraintNameExtracter.java
index 303d2be..193150c 100644
--- a/hibernate-core/src/main/java/org/hibernate/exception/spi/TemplatedViolatedConstraintNameExtracter.java
+++ b/hibernate-core/src/main/java/org/hibernate/exception/spi/TemplatedViolatedConstraintNameExtracter.java
@@ -46,7 +46,7 @@
 		}
 
 		int start = templateStartPosition + templateStart.length();
-		int end = message.indexOf( templateEnd, start );
+		int end = message.lastIndexOf( templateEnd, start );
 		if ( end < 0 ) {
 			end = message.length();
 		}
