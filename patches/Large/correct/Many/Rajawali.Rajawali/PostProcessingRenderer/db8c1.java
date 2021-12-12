diff --git a/src/rajawali/renderer/PostProcessingRenderer.java b/src/rajawali/renderer/PostProcessingRenderer.java
index c3bcee5..5e20416 100644
--- a/src/rajawali/renderer/PostProcessingRenderer.java
+++ b/src/rajawali/renderer/PostProcessingRenderer.java
@@ -152,7 +152,7 @@
 	}
 
 	public boolean isInitialized() {
-		return mEnabled;
+		return mInitialized;
 	}
 
 	public void setInitialized(boolean initialized) {
