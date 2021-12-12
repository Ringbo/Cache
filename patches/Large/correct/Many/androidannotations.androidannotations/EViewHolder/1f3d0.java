diff --git a/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/holder/EViewHolder.java b/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/holder/EViewHolder.java
index 3f0e968..29f3c46 100644
--- a/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/holder/EViewHolder.java
+++ b/AndroidAnnotations/androidannotations-core/androidannotations/src/main/java/org/androidannotations/holder/EViewHolder.java
@@ -254,7 +254,7 @@
 		onDetachedFromWindowMethod.annotate(Override.class);
 		JBlock body = onDetachedFromWindowMethod.body();
 		onDetachedFromWindowBeforeSuperBlock = body.blockSimple();
-		body.invoke(_super(), onAttachedToWindowMethod);
+		body.invoke(_super(), onDetachedFromWindowMethod);
 	}
 
 	@Override
