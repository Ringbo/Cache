diff --git a/src/org/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer.java b/src/org/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer.java
index e5ce401..7a7962f 100644
--- a/src/org/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer.java
+++ b/src/org/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer.java
@@ -148,7 +148,7 @@
 	}
 
 	public void add(final float pX, final float pY, final float pWidth, final float pHeight) {
-		this.addInner(pX, pY, pX + pWidth, pY + pWidth);
+		this.addInner(pX, pY, pX + pWidth, pY + pHeight);
 	}
 
 	/**
