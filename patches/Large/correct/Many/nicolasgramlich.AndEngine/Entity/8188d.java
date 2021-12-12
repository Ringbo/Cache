diff --git a/src/org/anddev/andengine/entity/Entity.java b/src/org/anddev/andengine/entity/Entity.java
index e7dc019..c274a13 100644
--- a/src/org/anddev/andengine/entity/Entity.java
+++ b/src/org/anddev/andengine/entity/Entity.java
@@ -467,7 +467,7 @@
 		if(this.mChildren == null) {
 			return null;
 		}
-		return this.mChildren.remove(pEntityMatcher);
+		return this.mChildren.remove(pEntityMatcher, Entity.PARAMETERCALLABLE_DETACHCHILD);
 	}
 
 	@Override
