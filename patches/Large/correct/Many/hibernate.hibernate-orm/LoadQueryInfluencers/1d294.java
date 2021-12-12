diff --git a/hibernate-core/src/main/java/org/hibernate/engine/spi/LoadQueryInfluencers.java b/hibernate-core/src/main/java/org/hibernate/engine/spi/LoadQueryInfluencers.java
index 61a54c0..726429d 100644
--- a/hibernate-core/src/main/java/org/hibernate/engine/spi/LoadQueryInfluencers.java
+++ b/hibernate-core/src/main/java/org/hibernate/engine/spi/LoadQueryInfluencers.java
@@ -139,7 +139,7 @@
 	}
 
 	public static String[] parseFilterParameterName(String filterParameterName) {
-		int dot = filterParameterName.indexOf( '.' );
+		int dot = filterParameterName.lastIndexOf( '.' );
 		if ( dot <= 0 ) {
 			throw new IllegalArgumentException( "Invalid filter-parameter name format" );
 		}
