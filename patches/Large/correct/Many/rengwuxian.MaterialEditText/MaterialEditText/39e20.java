diff --git a/library/src/main/java/com/rengwuxian/materialedittext/MaterialEditText.java b/library/src/main/java/com/rengwuxian/materialedittext/MaterialEditText.java
index 9bc4ce1..ce2b3cf 100644
--- a/library/src/main/java/com/rengwuxian/materialedittext/MaterialEditText.java
+++ b/library/src/main/java/com/rengwuxian/materialedittext/MaterialEditText.java
@@ -325,7 +325,7 @@
 	}
 
 	public void setFloatingLabel(int mode) {
-		setFloatingLabel(mode);
+		setFloatingLabelInternal(mode);
 		postInvalidate();
 	}
 
