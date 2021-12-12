diff --git a/src/org/anddev/andengine/entity/sprite/modifier/BasePairFromToModifier.java b/src/org/anddev/andengine/entity/sprite/modifier/BasePairFromToModifier.java
index 6234860..b070231 100644
--- a/src/org/anddev/andengine/entity/sprite/modifier/BasePairFromToModifier.java
+++ b/src/org/anddev/andengine/entity/sprite/modifier/BasePairFromToModifier.java
@@ -28,7 +28,7 @@
 	}
 
 	public BasePairFromToModifier(final float pDuration, final float pFromValueA, final float pToValueA, final float pFromValueB, final float pToValueB, final IModifierListener pModiferListener) {
-		super(pDuration, pFromValueA, pFromValueB, pModiferListener);
+		super(pDuration, pFromValueA, pToValueA, pModiferListener);
 		this.mFromValueB = pFromValueB;
 		this.mValuePerSecondB = (pToValueB - pFromValueB) / pDuration;
 	}
