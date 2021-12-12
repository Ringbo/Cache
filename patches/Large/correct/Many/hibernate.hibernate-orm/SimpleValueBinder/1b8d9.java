diff --git a/hibernate-core/src/main/java/org/hibernate/cfg/annotations/SimpleValueBinder.java b/hibernate-core/src/main/java/org/hibernate/cfg/annotations/SimpleValueBinder.java
index 6da3198..17132c1 100644
--- a/hibernate-core/src/main/java/org/hibernate/cfg/annotations/SimpleValueBinder.java
+++ b/hibernate-core/src/main/java/org/hibernate/cfg/annotations/SimpleValueBinder.java
@@ -281,7 +281,8 @@
 				type = StringNVarcharType.INSTANCE.getName();
 				explicitType = type;
 			}
-			else if ( buildingContext.getBuildingOptions().getReflectionManager().equals( returnedClassOrElement, Character.class ) ) {
+			else if ( buildingContext.getBuildingOptions().getReflectionManager().equals( returnedClassOrElement, Character.class ) ||
+					buildingContext.getBuildingOptions().getReflectionManager().equals( returnedClassOrElement, char.class ) ) {
 				if ( isArray ) {
 					// nvarchar
 					type = StringNVarcharType.INSTANCE.getName();
