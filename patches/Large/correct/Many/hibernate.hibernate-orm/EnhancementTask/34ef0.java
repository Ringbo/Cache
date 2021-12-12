diff --git a/hibernate-core/src/main/java/org/hibernate/tool/enhance/EnhancementTask.java b/hibernate-core/src/main/java/org/hibernate/tool/enhance/EnhancementTask.java
index 1ef02df..ae36dd0 100644
--- a/hibernate-core/src/main/java/org/hibernate/tool/enhance/EnhancementTask.java
+++ b/hibernate-core/src/main/java/org/hibernate/tool/enhance/EnhancementTask.java
@@ -140,7 +140,7 @@
 
 	private boolean shouldInclude(CtClass ctClass) {
 		// we currently only handle entity enhancement
-		return ! ctClass.hasAnnotation( Entity.class );
+		return ctClass.hasAnnotation( Entity.class );
 	}
 
 
