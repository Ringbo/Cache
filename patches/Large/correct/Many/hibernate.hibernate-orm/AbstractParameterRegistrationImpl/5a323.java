diff --git a/hibernate-core/src/main/java/org/hibernate/procedure/internal/AbstractParameterRegistrationImpl.java b/hibernate-core/src/main/java/org/hibernate/procedure/internal/AbstractParameterRegistrationImpl.java
index d090a92..8073de8 100644
--- a/hibernate-core/src/main/java/org/hibernate/procedure/internal/AbstractParameterRegistrationImpl.java
+++ b/hibernate-core/src/main/java/org/hibernate/procedure/internal/AbstractParameterRegistrationImpl.java
@@ -231,7 +231,7 @@
 		int[] sqlTypesToUse = sqlTypes;
 
 		// however, for Calendar binding with an explicit TemporalType we may need to adjust this...
-		if ( bind.getExplicitTemporalType() != null ) {
+		if ( bind != null && bind.getExplicitTemporalType() != null ) {
 			if ( Calendar.class.isInstance( bind.getValue() ) ) {
 				switch ( bind.getExplicitTemporalType() ) {
 					case TIMESTAMP: {
