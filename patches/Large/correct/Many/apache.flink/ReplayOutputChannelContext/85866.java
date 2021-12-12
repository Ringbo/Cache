diff --git a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/checkpointing/ReplayOutputChannelContext.java b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/checkpointing/ReplayOutputChannelContext.java
index da3b149..6634dc6 100644
--- a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/checkpointing/ReplayOutputChannelContext.java
+++ b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/checkpointing/ReplayOutputChannelContext.java
@@ -31,7 +31,7 @@
 	@Override
 	public boolean isInputChannel() {
 
-		return true;
+		return false;
 	}
 
 	/**
