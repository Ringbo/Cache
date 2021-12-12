diff --git a/annotations/src/main/java/org/hibernate/cfg/AbstractPropertyHolder.java b/annotations/src/main/java/org/hibernate/cfg/AbstractPropertyHolder.java
index a73347c..82ae206 100644
--- a/annotations/src/main/java/org/hibernate/cfg/AbstractPropertyHolder.java
+++ b/annotations/src/main/java/org/hibernate/cfg/AbstractPropertyHolder.java
@@ -199,7 +199,7 @@
 	private JoinColumn[] getExactOverriddenJoinColumn(String propertyName) {
 		JoinColumn[] override = null;
 		if ( parent != null ) {
-			override = parent.getOverriddenJoinColumn( propertyName );
+			override = parent.getExactOverriddenJoinColumn( propertyName );
 		}
 		if ( override == null && currentPropertyJoinColumnOverride != null ) {
 			override = currentPropertyJoinColumnOverride.get( propertyName );
@@ -249,9 +249,9 @@
 	private JoinTable getExactOverriddenJoinTable(String propertyName) {
 		JoinTable override = null;
 		if ( parent != null ) {
-			override = parent.getOverriddenJoinTable( propertyName );
+			override = parent.getExactOverriddenJoinTable( propertyName );
 		}
-		if ( override == null && currentPropertyJoinColumnOverride != null ) {
+		if ( override == null && currentPropertyJoinTableOverride != null ) {
 			override = currentPropertyJoinTableOverride.get( propertyName );
 		}
 		if ( override == null && holderJoinTableOverride != null ) {
