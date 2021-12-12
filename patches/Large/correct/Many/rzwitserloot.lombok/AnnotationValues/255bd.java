diff --git a/src/lombok/core/AnnotationValues.java b/src/lombok/core/AnnotationValues.java
index 54fa87a..8c69ffc 100644
--- a/src/lombok/core/AnnotationValues.java
+++ b/src/lombok/core/AnnotationValues.java
@@ -183,7 +183,7 @@
 		}
 		
 		if ( expected == String.class ) {
-			if ( guess instanceof String ) return expected;
+			if ( guess instanceof String ) return guess;
 		}
 		
 		if ( Enum.class.isAssignableFrom(expected) ) {
